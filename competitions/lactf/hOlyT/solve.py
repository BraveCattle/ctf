from pwn import *
from Crypto.Util.number import long_to_bytes
from Crypto.Util import number

def mgcd(a,b):
    if b == 0 : return a
    return mgcd(b,a % b)
 
r = remote('chall.lac.tf', 31171)

ct = int(r.recvline()[5:])
N = int(r.recvline()[4:])
e = int(r.recvline()[4:])

p = -1
while True:
    r.recvuntil(b'What do you want to ask? > ')
    r.sendline(b"1")
    ad = int(r.recvline())
    if ad == 1 or ad == N-1:
        continue
    p = mgcd(N, ad+1)
    break

assert p != -1
pk = pow(e, -1, (p-1)*(N//p-1))
m = pow(ct, pk, N)
flag = long_to_bytes(m)
print(f"flag: {flag}")
