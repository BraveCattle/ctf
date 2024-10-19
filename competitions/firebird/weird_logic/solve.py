part1 = [
    "00111101",
    "00110100",
    "11111001",
    "00000001",
    "00001111",
    "11001101",
    "11110011",
    "00000000",
    "00011000",
    "11011111",
    "00010000",
    "00010011",
    "11111111",
    "11101011",
    "11010111",
    "00000000"
]

part2 = [
    "11111111",
    "00011010",
    "00001000",
    "11100000",
    "00001010",
    "11011111",
    "11110101",
    "00000000",
    "00100111",
    "11100111",
    "10010110",
    "00110110",
    "00100111",
    "11110001",
    "11111110",
    "00000000"
]

str1 = ""
for i in range(len(part1[0])):
    for j in range(len(part1)):
        str1 += part1[j][i]
    str1 += '\n'

str2 = ""
for i in range(len(part2[0])):
    for j in range(len(part2)):
        str2 += part2[j][i]
    str2 += '\n'

str1 = str1.strip().split('\n')
str2 = str2.strip().split('\n')
for i in range(len(str1)):
    tmp = str1[i]+str2[i]
    tmp = tmp[::-1]
    for t in range(4):
        print(chr(int(tmp[t*8:(t+1)*8], 2)), end="")

print("")

# firebird{I0Glc_G@735_aR3_3zP3az}