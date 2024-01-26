from pwn import *
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad
import hashlib
import itertools

OFFSET = 80

def encrypt(v, rsa_n, e = 0x10001):
    return hex(pow(v, e, rsa_n))[2:].rjust(256, '0')

r = remote("ash-chal.firebird.sh", 36008)

enc_flag = r.recvline()[5:].strip()
# print(f"enc_flag len: {len(enc_flag)}, enc: {enc_flag}")
rsa_n = r.recvline()[5:].strip()
rsa_n = int(rsa_n.decode('utf8'), 16)
# print(f"rsa_n: {rsa_n}")
enc_sec = r.recvline()[5:].strip()
enc_sec = enc_sec.decode('utf8').split(':')
# print("enc_sec", enc_sec)
iv       = bytes.fromhex(enc_flag[:32].decode('utf8'))
enc_flag = bytes.fromhex(enc_flag[32:].decode('utf8'))
# print(f"iv: {iv.hex()}")

offset_s = [pow(2, OFFSET*0x10001*i, rsa_n) for i in range(10)]
inv = [0]+[pow(i, -1, rsa_n) for i in range(1, 11)]

ctxt = []
for i, enc_s in enumerate(enc_sec):
    ctxt.append(hex((int(enc_s, 16)*offset_s[i])%rsa_n)[2:])
payload = ':'.join(ctxt)
# print(f"send: {payload.encode('utf8')}")
r.sendline(payload.encode('utf8'))
recv = r.recvline()[:-1]
dec = recv[10:].decode('utf8')
dec = int(dec, 16)
print(f"dec: {hex(dec)}, length: {len(hex(dec))}")

tmp_str = hex(dec)[2:]
sec_weight = []
for i in range(9):
    sec_weight.append(int(tmp_str[-(OFFSET//4):], 16))
    tmp_str = tmp_str[:-(OFFSET//4)]
sec_weight.append(int(tmp_str, 16))
# print("sec_weight (hex):", [hex(s)[2:] for s in sec_weight])

sec = []
for i in range(10):
    for t in range(1, 11):
        if encrypt(sec_weight[i]*inv[t]%rsa_n, rsa_n) in enc_sec:
            # print(f"weight of index sec_weight[{i}] is {t}")
            sec.append(int.to_bytes(sec_weight[i]*inv[t]%rsa_n, 8, 'big'))
# print(f"len sec: {len(sec)}, sec: {sec}")
assert len(sec) == 10

key = hashlib.sha256(b''.join(sec)).digest()
cipher = AES.new(key, AES.MODE_CBC, iv)
ptxt = unpad(cipher.decrypt(enc_flag), 16)
print(ptxt)