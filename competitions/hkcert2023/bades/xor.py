def xor(a, b):
    return bytes(u^v for u, v in zip(a, b))

a, b = input().strip().split()
a, b = bytes.fromhex(a), bytes.fromhex(b)
print(xor(a, b))