import os
from zlib import crc32

records =  ["504b03041400000008006bb029576cec2c391d.definitelynotadomain.net", # |PK........k.)Wl.,9.|
            "0000001b0000000d0000007265616c20666c61.definitelynotadomain.net", # |...........real fla|
            "672e747874cb4d4c2fc84cad4e314e2eaa2c30.definitelynotadomain.net", # |g.txt.ML/.L.N1N..,0|
            "37cc338b37cf308e4fcb3131ab0500504b0102.definitelynotadomain.net", # |7.3.7.0.O.11...PK..|
            "1f001400000008006bb029576cec2c391d0000.definitelynotadomain.net", # |........k.)Wl.,9...|
            "001b0000000d00240000000000000020000000.definitelynotadomain.net", # |.......$....... ...| extra field length: 0x24
            "000000007265616c20666c61672e7478740a00.definitelynotadomain.net", # |....real flag.txt..|
            "2000000000000100180061d244be9be3d90161.definitelynotadomain.net", # | .........a.D.....a|
            "d244be9be3d90147f0f3b69be3d901504b0506.definitelynotadomain.net", # |.D.....G.......PK..|
            "00000000010001005f000000480000000000.definitelynotadomain.net"
           ]

output = open("output.zip", "wb")
for r in records:
    r = r.split('.')[0]
    print(f"writing {r} to result")
    output.write(bytearray.fromhex(r))