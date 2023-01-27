import cv2
import matplotlib.pyplot as plt
img = cv2.imread('C:/Users/17R4/downloads/standard_test_images/peppers_color.tif', 1)
img = cv2.cvtColor (img, cv2.COLOR_BGR2RGB)
plt.imshow (img)
plt.title ('COLOR IMAGE')
plt.axis('off')
plt.show()