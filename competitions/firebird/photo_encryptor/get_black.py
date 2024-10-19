import matplotlib.pyplot as plt
import matplotlib.image as mpimg
import numpy as np

black = np.array([[np.array([0, 0, 0, 1], dtype=np.float_) for w in range(width)] for h in range(height)])
print(black)
plt.imsave("black.png", black)