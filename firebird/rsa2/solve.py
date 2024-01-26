from pwn import *
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad
import hashlib
import itertools

OFFSET = 80

def encrypt(v, rsa_n, e = 0x10001):
    return hex(pow(v, e, rsa_n))[2:].rjust(256, '0')

r = remote("ash-chal.firebird.sh", 36008)

# parsing input
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

# sth related to Lenstra¨CLenstra¨CLov¨¢sz, no idea how to solve XP