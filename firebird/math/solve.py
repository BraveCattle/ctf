def decom(x):
    if x == 1:
        return []
    for i in range(2, x+1):
        if x%i == 0:
            return [i]+decom(x//i)

primes = [0]

# with open("primes.txt") as f:
#     for line in f:
#         num = eval(line.strip("\n"))
#         if num%4 == 1:
#             primes.append(num)

# print("prime selection done!")

# with open("decom_res.txt") as f:
#     for line in f:
#         num = eval(line.strip("\n"))
#         x = primes.index(num)
#         print(x)

dic = {}

with open("x_res.txt") as f:
    for line in f:
        num = eval(line.strip("\n"))
        dic[num] = 1 if num not in dic else dic[num]+1

# print(dic)

def search(idx, dic, flag):
    if len(dic) == 0:
        print(f"Found flag: {flag}")
        return

    # print(f"calculating on idx: {idx}, cur flag: {flag}, remaining: {len(dic)}")
    # print(f"mul of current 2: {flag[idx]*flag[idx+1]}")
    if idx+2 >= len(flag):
        valid = []
        for i in range(1, 128):
            if flag[idx]*flag[idx+1]*i in dic and dic[flag[idx]*flag[idx+1]*i] > 0:
                # print(f"valid: {chr(i)}")
                valid.append(chr(i))
        for v in valid:
            mul = flag[idx]*flag[idx+1]*ord(v)
            dic[mul] -= 1
            if dic[mul] == 0:
                del dic[mul]
            search(idx+1, dic, flag+bytes(v, encoding='utf8'))
            dic[mul] = 1 if mul not in dic else dic[mul]+1
            # print(flag)
    else:
        mul = flag[idx]*flag[idx+1]*flag[idx+2]
        # print(f"mul: {mul}")
        assert mul in dic
        dic[mul] -= 1
        if dic[mul] == 0:
            del dic[mul]
        search(idx+1, dic, flag)

search(0, dic, b"firebird{")