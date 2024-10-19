def virginiaCrack(cipherText):
    length = getKeyLen(cipherText)
    key = getKey(cipherText,length)
    keyStr = ''
    for k in key:
        keyStr+=k
    print('the key:',keyStr)
    plainText = ''
    index = 0
    for ch in cipherText:
        c = chr((ord(ch)-ord(key[index%length])+26)%26+97)
        plainText += c
        index+=1
    return plainText

def getKeyLen(cipherText):
    # keylength = 1
    # maxCount = 0
    # for step in range(3,10):
    #     count = 0
    #     for i in range(len(cipherText)-step):
    #         if cipherText[i] == cipherText[i+step]:
    #              count += 1
    #     if count>maxCount:
    #         maxCount = count
    #         keylength = step
    # return keylength
    return 20

def getKey(text,length):
    key = []
    alphaRate = [0.082, 0.015,0.028,0.043,0.127,
              0.022,0.02,0.061,0.07,0.002,0.008,
              0.04,0.024,0.067,0.075,0.019,0.001,
              0.06,0.063,0.091,0.028,0.01,0.023,0.001,0.02,0.001]
    #alphaRate =[0.08167,0.01492,0.02782,0.04253,0.12705,0.02228,0.02015,0.06094,0.06996,0.00153,0.00772,0.04025,0.02406,0.06749,0.07507,0.01929,0.0009,0.05987,0.06327,0.09056,0.02758,0.00978,0.02360,0.0015,0.01974,0.00074]
    matrix =textToList(text,length)
    for i in range(length):
        w = [row[i] for row in matrix]
        li = countList(w)
        powLi = []
        for j in range(26):
            Sum = 0.00000
            for k in range(26):
                Sum += alphaRate[k]*li[k]
            powLi.append(Sum)
            li = li[1:]+li[:1]
        Abs = 1
        ch = ''
        for j in range(len(powLi)):
             if abs(powLi[j] -0.065546)<Abs:
                 Abs = abs(powLi[j] -0.065546)
                 ch = chr(j+97)
        key.append(ch)
    return key

def countList(lis):
    li = []
    alphabet = [chr(i) for i in range(97,123)]
    for c in alphabet:
        count = 0
        for ch in lis:
            if ch == c:
                count+=1
        li.append(count/len(lis))
    return li 

def textToList(text,length):
    textMatrix = []
    row = [] 
    index = 0  
    for ch in text:
        row.append(ch)
        index += 1
        if index % length ==0:
            textMatrix.append(row)
            row = []
    return textMatrix

if __name__ == '__main__':
    cipherText = """PQPAJYLJPIXJQUTYRQIPLQSURMZGYUTTPMHOHJAINQKFFYGTPWXTMFWKHELIZYYFSUDNFKHOZAQIFQDLLUEFFPAILDTXQWWWKIGNVPPTMMWQMODAIBCODZTXSYUQBFSMLSILAZZHVXNMHPUASMZQBBSQZIKHQCLIFQXQAUJGMKACTYBBVMCO"""
    plainText= virginiaCrack(cipherText.lower())
    print('the plainText:\n',plainText)