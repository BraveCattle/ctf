import hashlib

def search(cur, add, tar, tar_len, h_algo):
    if len(cur+add) >= tar_len:
        hash_val = h_algo((cur+add).encode('utf-8')).hexdigest()
        print(f"c: {cur+add} {hash_val}")
        if hash_val.startswith(tar):
            result.append(add)
        return
    # for c in cnt.keys():
    for c in table:
        # if cnt[c] <= 0 or (len(add) > 0 and add[-1] == c):
        #     continue
        # cnt[c] -= 1
        search(cur, add+c, tar, tar_len=tar_len, h_algo=h_algo)
        # cnt[c] += 1
    return None

flag = 'hkcert23{31313136_rdhrdhrdhr_y0u_msz}'
table = "".join(chr(i) for i in range(32, 127))

cur = 'hkcert23{h0p3_y0u_u53d_th3_s0urc3m4p}'
result = []

h_algo = hashlib.sha256
search(cur, add="", tar="e3c817", tar_len=38, h_algo=h_algo)
if len(result) >= 1:
    print(result)
    for add in result:
        print(h_algo((cur+add).encode('utf-8')).hexdigest())
else:
    print("GG!")

# print(f"0-{8}: {hashlib.sha224(cur[0:8].encode('utf-8')).hexdigest()}, tar: {'b08c89'}")
# print(f"0-{10}: {hashlib.sha224(cur[0:10].encode('utf-8')).hexdigest()}, tar: {'ce45fd'}")
# print(f"0-{12}: {hashlib.sha256(cur[0:12].encode('utf-8')).hexdigest()}, tar: {'87b3c7'}")
# print(f"0-{14}: {hashlib.sha256(cur[0:14].encode('utf-8')).hexdigest()}, tar: {'d0687a'}")
# print(f"0-{16}: {hashlib.sha256(cur[0:16].encode('utf-8')).hexdigest()}, tar: {'cbe2c9'}")
# print(f"0-{18}: {hashlib.sha256(cur[0:18].encode('utf-8')).hexdigest()}, tar: {'c25dd2'}")
# print(f"0-{20}: {hashlib.sha256(cur[0:20].encode('utf-8')).hexdigest()}, tar: {'b72709'}")
print(f"0-{36}: {hashlib.sha256(cur[0:36].encode('utf-8')).hexdigest()}, tar: {'7ef31a'}")
