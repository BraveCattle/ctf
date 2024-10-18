from pwn import *

context.log_level = 'debug'
context.arch = 'amd64'
r = process("./hft")

r.send(p64(1))
r.sendline(b'\x00')
# recv = r.recvall()
# print(f"{recv = }")

r.interactive()