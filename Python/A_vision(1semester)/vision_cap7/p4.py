import numpy as np
import cv2
import matplotlib.pyplot as plt
img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 0)
img = img.astype(np.float32)
row, col = img.shape
rand_noise = np.random.randn(row, col)
rand_noise = rand_noise.reshape(row, col)
noisy = img + img * rand_noise
print(abs(noisy-img))
plt.imshow(noisy, cmap='gray')
plt.title('Random Normal Noise')
plt.axis('off')
plt.show()