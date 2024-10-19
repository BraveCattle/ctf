import base64

encrypt_flag = "804b73a2b653fa811fa221502b2ba01aaec543eb9ce3ce8deec091aa658ca7058e58aa9c3c47279df7ce789f6d004ec98fb017d13bd30fdd0f5032d159536a0b4438b1b653fc4d86169d29aebbbb1c2b"

iv = encrypt_flag[:16]
cipher_text = encrypt_flag[16:]

c = []
idx = 0

while idx < len(cipher_text):
    c.append(cipher_text[idx:idx+16])
    idx += 16

# print(c)

ci_xor_ci = []
ci_xor_mi = []
for i in range(len(c)-1):
    ci_xor_ci.append(hex(eval('0x'+c[i])^eval('0x'+c[i+1])))

for i, x in enumerate(ci_xor_ci):
    print(f"c{i} xor c{i+1}: {x[2:]}")