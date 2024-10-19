import matplotlib.pyplot as plt
import matplotlib.image as mpimg
from random import *
import numpy as np
import hashlib

enc_image = mpimg.imread("enc.png")
print(enc_image.shape, type(enc_image[0, 0]), enc_image[0, 0])
# print(enc_image)

height, width = enc_image.shape[0], enc_image.shape[1]
result = []

for h in range(height):
    result.append(round(enc_image[0][h][0]*255))
# print(result)

key = "".join(chr(i) for i in result[:25])
print(key)

dec_image = []
enc_image = mpimg.imread("encrypted_flag.png")
for h in range(height):
    tmp = []
    for w in range(width):
        p = enc_image[h, w]
        pixel = np.array([(round(p[0]*255)^ord(key[(h+w)%len(key)]))/255,
                          (round(p[1]*255)^ord(key[(h+w)%len(key)]))/255,
                          (round(p[2]*255)^ord(key[(h+w)%len(key)]))/255], dtype=np.float_)
        tmp.append(pixel)
    dec_image.append(tmp)

dec_image = np.array(dec_image)
# plt.imsave("dec.png", dec_image)
seed(hashlib.md5(key.encode()).hexdigest().encode())
result = []

rand_ints = []
for _ in range(height*width*3):
    rand_ints.append(randint(0, width))
    rand_ints.append(randint(0, height))

idx = len(rand_ints)
for w in range(width-1, -1, -1):
    for h in range(height-1, -1, -1):
        for k in range(2, -1, -1):
            w_rd, h_rd = rand_ints[idx-2], rand_ints[idx-1]
            idx -= 2
            dec_image[h, w][k] = (round(dec_image[h, w][k]*255) ^ round(dec_image[(h+h_rd)%height, (w+w_rd)%width][k]*255))/255

plt.imsave("result.png", dec_image)