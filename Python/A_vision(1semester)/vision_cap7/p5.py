import scipy.signal
import numpy as np
import matplotlib.pyplot as plt
import cv2

img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 0)

k1 = np.ones((7, 7), np.uint8)/49

blurred = scipy.signal.convolve2d(img, k1)

k2 = np.array([[0, -1, 0],
                   [-1, 25, -1],
                   [0, -1, 0]], dtype=np.int8)

sharpened = scipy.signal.convolve2d(img, k2)

plt.subplot(131)
plt.imshow(img, cmap='gray')
plt.title('Original Image')
plt.axis('off')
plt.subplot(132)
plt.imshow(blurred, cmap='gray')
plt.title('Blurred Image')
plt.axis('off')
plt.subplot(133)
plt.imshow(sharpened, cmap='gray')
plt.title('Sharpened Image')
plt.axis('off')
plt.show()