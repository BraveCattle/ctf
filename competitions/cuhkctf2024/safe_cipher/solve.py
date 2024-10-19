def xor(x, y):
    return bytes(a ^ b for a, b in zip(x, y))

c = open("flag.txt.enc", "rb").read()

k1 = xor(c[0:10], b"cuhk24ctf{")
k2 = xor(c[40:50], b"cuhk24ctf{")
k3 = xor(c[80:90], b"cuhk24ctf{")
k = k1+k2+k3

print(xor(c, k+k+k+k))
#b'cuhk24ctf{lon9_prefis_kind_o7_iNtRe5t1n}cuhk24ctf{lon9_prefis_kind_o7_iNtRe5t1n}cuhk24ctf{lon9_prefis_kind_o7_iNtRe5t1n}'