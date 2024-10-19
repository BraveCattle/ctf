from zlib import *
data = open('I_go_to_maincampus_on_foot.png', 'rb').read()[0x63:0x90B47B]
data = decompress(data)
print(data)