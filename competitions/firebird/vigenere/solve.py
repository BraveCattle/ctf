import secrets

SHIFT = 65
MOD = 26
BLOCKLENGTH = 20

def vigenere_enc(block,key):
    return(add(block,key))

def vigenere_dec(block,key):
    return(sub(block,key))

def ctr(num):
    decimal_num = 0
    power = len(num) - 1
    for digit in num:
        decimal_num += (ord(digit) - ord('A')) * (MOD ** power)
        power -= 1

    decimal_num += 1

    result = ""
    while decimal_num > 0:
        remainder = decimal_num % MOD
        result = chr(remainder + ord('A')) + result
        decimal_num //= MOD

    return(result)

def add(block1,block2):
    assert(len(block1)<= len(block2))
    assert(len(block2)<= BLOCKLENGTH)
    b1upper = block1.upper()
    b2upper = block2.upper()
    b1 = [ ord(b1upper[i])-SHIFT for i in range(len(block1))]
    b2 = [ ord(b2upper[i])-SHIFT for i in range(len(block1))]
    s = [ (b1[i] + b2[i]) % MOD for i in range(len(block1))]
    slist = [ chr(s[i]+SHIFT) for i in range(len(block1))]
    sum = ''.join(slist)
    return(sum)

def sub(block1,block2):
    assert(len(block1)<= len(block2))
    assert(len(block2)<= BLOCKLENGTH)
    b1upper = block1.upper()
    b2upper = block2.upper()
    b1 = [ ord(b1upper[i])-SHIFT for i in range(len(block1))]
    b2 = [ ord(b2upper[i])-SHIFT for i in range(len(block1))]
    s = [ (b1[i] - b2[i]) % MOD for i in range(len(block1))]
    slist = [ chr(s[i]+SHIFT) for i in range(len(block1))]
    sum = ''.join(slist)
    return(sum)

def get_blocks(s):
    blocks = []
    i = 0
    while(i + BLOCKLENGTH<len(s)):
        blocks.append(s[i:i+BLOCKLENGTH])
        i = i + BLOCKLENGTH
    blocks.append(s[i:len(s)])
    return(blocks)

def vigenere_ctr_dec(ctxt, key):
    blocks = get_blocks(ctxt)
    nonce = blocks[0]
    ptxt = ""
    for i in range(1, len(blocks)):
        to_add = vigenere_enc(nonce, key)
        ptxt += sub(blocks[i], to_add)
        nonce = ctr(nonce)
    return(ptxt)

ctxt = "ULDGWMFOXRNTKTVECMMNPQPAJYLJPIXJQUTYRQIQLQSURMZGYUTTPMHOHJAKNQKFFYGTPWXTMFWKHELLZYYFSUDNFKHOZAQIFQDPLUEFFPAILDTXQWWWKIGSVPPTMMWQMODAIBCODZTDSYUQBFSMLSILAZZHVXNTHPUASMZQBBSQZIKHQCLQFQXQAUJGMKACTYBBVMCXUMJOC"

print(len(ctxt))
blocks = get_blocks(ctxt)
print(f"Nonce: {blocks[0]}")
for i, b in enumerate(blocks):
    print(b[:-1]+chr(ord(b[-1])-i))

for i in range(len(blocks)-2):
    diff = [ord(blocks[i][j])-ord(blocks[i+1][j]) for j in range(len(blocks[i]))]
    print(f"block {i}:", "".join(str(d)+'\t' for d in diff))

print(vigenere_ctr_dec(ctxt, "A"*20))