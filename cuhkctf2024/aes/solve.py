from pwn import *
from Crypto.Util.Padding import pad, unpad

context.log_level = 'debug'
r = remote("chal.24.cuhkctf.org", 24063)

def xor(a, b):
    return bytes(x ^ y for x, y in zip(a, b))

r.recvuntil(b"iv1: ")
iv1 = bytes.fromhex(r.recv(32).decode())
r.recvuntil(b"iv2: ")
iv2 = bytes.fromhex(r.recv(32).decode())

r.recvuntil(b"Enter the message to encrypt (in hex): ")
to_enc = xor(iv1, iv2).hex()+'00'*16
r.sendline(to_enc.encode())
print(f"To be encrypted plain text: {to_enc}")

r.recvuntil(b"ciphertext1: ")
cipher_text = bytes.fromhex(r.recvuntil(b'\n').decode().strip('\r\n'))
print(f"received cipher_text: {cipher_text}")

r.recvuntil(b"Enter a ciphertext (in hex):")
to_dec = xor(cipher_text, pad(b"Please give me the flag! UwU!", 16)).hex()
r.sendline(to_dec.encode())
print(f"To be decrypted cihpertext: {to_dec}")

r.recvall()

# cuhk24ctf{m4yb3_key_r3u5e_1s_r3a11y_no7_4_g0od_id3a}