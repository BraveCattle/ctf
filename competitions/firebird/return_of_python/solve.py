from pwn import *

# r = remote('ash-chal.firebird.sh', 36004)
r = remote('chal.firebird.sh', 35010)

recv = r.recvline().decode().strip()

for i in range(80):
    recv = r.recvline().decode().strip()
    print(f"i: {i+1}, recv: {recv}, send: {bytes(str(eval(recv)), encoding='utf8')}")
    r.sendline(bytes(str(eval(recv)), encoding='utf8'))

r.interactive()