import cv2
import numpy as np
from matplotlib import pyplot as plt
img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 1)
input = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
output = cv2.filter2D(input, -1, np.ones((15, 15), np.uint8)/225)
plt.subplot(121)
plt.imshow(input)
plt.title('Input')
plt.axis('off')
plt.subplot(122)
plt.imshow(output)
plt.title('Output')
plt.axis('off')
plt.show()