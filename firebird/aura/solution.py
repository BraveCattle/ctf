import cv2
import numpy as np

img = cv2.imread('aura.tif', -1)
b, g, r = cv2.split(img)

for i in range(8):
    cv2.imwrite(f'./results/blue_ch{i}.png', np.uint8((b >> i) & 1) * 255)
    cv2.imwrite(f'./results/green_ch{i}.png', np.uint8((g >> i) & 1) * 255)
    cv2.imwrite(f'./results/red_ch{i}.png', np.uint8((r >> i) & 1) * 255)