from pwn import *

context.log_level = 'debug'

r = process("./SpaceEscape")

r.recvuntil(b"Which way would you like to go? (enter right or left): \n")
r.sendline(b"left")
r.recvuntil(b"Which way would you like to go? (enter right or left): \n")
r.sendline(b"left")
r.recvuntil(b"Which way would you like to go? (enter right or left): \n")
r.sendline(b"right")
r.recvuntil(b"but you only have one attempt. \n")
r.sendline(b"r4r2")
# r.recvuntil(b"Success, you did it! HOL 8000 is disabled, now you can start on fixing up the ship and planning a course to to Earth. \n")
# recv = r.recvall()

# print(f"flag: {recv}")

r.interactive()

# magpie{1M_S0rRY_dAv3}