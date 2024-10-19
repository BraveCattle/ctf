from pwn import *

r = remote("chall.lac.tf", 31321)

payload = "please"*39 + "pretty"*15 + "flag"

r.recvuntil(b"hi, i'm aplet321. how can i help?\n")
r.sendline(payload.encode("utf8"))
r.recvuntil(b"ok here's your flag\n")
flag = r.recvuntil(b"}")
print(f"flag: {flag}")