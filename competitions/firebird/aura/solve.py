from skimage import io
import matplotlib.pyplot as plt

def decode(s, length):
    msg = ""
    s = [s[i:i + 16] for i in range(0, len(s), 16)]
    for ch in s:
        msg = msg + chr(int(ch,2))
    print(msg)

def extract():
    img = io.imread("./aura.tif")
    width, height, c = img.shape
    print(f"w: {width}, h: {height}, c: {c}")
    msg = ""
    length = 10
    for i in range(width):
        for j in range(height):
            lsb0 = bin(int(img[i, j, 0]))[-1]
            lsb1 = bin(int(img[i, j, 1]))[-1]
            lsb2 = bin(int(img[i, j, 2]))[-1]
            msg += lsb0+lsb1+lsb2
    print(msg)

if __name__ == '__main__':
    extract()