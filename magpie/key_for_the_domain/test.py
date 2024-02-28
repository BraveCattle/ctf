import os
from itertools import permutations as P
from itertools import combinations as C
from zlib import crc32

records =  [
            "504b03041400000008006bb029576cec2c391d.definitelynotadomain.net", # |PK........k.)Wl.,9.|
            "0000001b0000000d0000007265616c20666c61.definitelynotadomain.net", # |...........real fla|
           ]

remaining_recs = [
            "00000100304d614b0d9b0000740000004fd966.definitelynotadomain.net",
            "501bec0d0000611df01d1f00d9000018002f47.definitelynotadomain.net",
            "0837000161006b4c00022e4400d900004b006c.definitelynotadomain.net",
            "0014006c00c800006c03726b014c4bf0000031.definitelynotadomain.net",
            "002cad0a0066ec00c8be0d29000014572c6120.definitelynotadomain.net",
            "672e747874cb4d4c2fc84cad4e314e2eaa2c30.definitelynotadomain.net"  # |g.txt.ML/.L.N1N..,0|
            "74006c6172720066002c1d080061036c002f65.definitelynotadomain.net",
            "37cc338b37cf308e4fcb3131ab0500504b0102.definitelynotadomain.net", # |7.3.7.0.O.11...PK..|
            "1f001400000008006bb029576cec2c391d0000.definitelynotadomain.net", # |........k.)Wl.,9...|
            "1800004f4b001f006c00005700ad000000722e.definitelynotadomain.net",
            "7400cb00ec0100d21fb0002caad9574fcb006b.definitelynotadomain.net",
            "00392e4c000000617200e3399b31660600cc44.definitelynotadomain.net",
            "004bec78ec4b002000000d0000e35f2e000000.definitelynotadomain.net",
            "001b0000000d00240000000000000020000000.definitelynotadomain.net", # |.......$....... ...| extra field length: 0x24
            "000074300000503300014b670d31aa0000e339.definitelynotadomain.net",
            "00000074010078004800006c0000045701332c.definitelynotadomain.net",
            "000000007265616c20666c61672e7478740a00.definitelynotadomain.net", # |....real flag.txt..|
            "2000000000000100180061d244be9be3d90161.definitelynotadomain.net", # | .........a.D.....a|
            "00ab001d00084d9b0000570500666b74000000.definitelynotadomain.net",
            "5f2900002e78d900e3500565be2c5700500166.definitelynotadomain.net",
            "d244be9be3d90147f0f3b69be3d901504b0506.definitelynotadomain.net", # |.D.....G.......PK..|
            "0000660014001d004b0005be089b2f0000004c.definitelynotadomain.net",
            "00000000010001005f000000480000000000.definitelynotadomain.net"
            ]

cnt = 0
exec_cnt = 0
all_recs = records+remaining_recs

for length in range(1, 20):
    # for perm in P(remaining_recs, length):
    for comb in C(remaining_recs, length):
        exec_cnt += 1
        print(f"executed {exec_cnt} times")
        output_hex = "".join(r.split('.')[0] for r in records)
        # output_hex += "".join(r.split('.')[0] for p in perm)
        output_hex += "".join(c.split('.')[0] for c in comb)
        with open(f'outputs/output{cnt}.zip', 'wb') as output:
            output.write(bytearray.fromhex(output_hex))
        try:
            ret = os.system(f'unzip outputs/output{cnt}.zip')
            if ret == 0:
                cnt += 1
                print(f"found {cnt} valid files!")
            else:
                os.system(f'rm outputs/output{cnt}.zip')
        except:
            print("Error!")
            exit(0)

# output = open("output.zip", "wb")
# for r in records:
#     r = r.split('.')[0]
#     print(f"writing {r} to result")
#     output.write(bytearray.fromhex(r))