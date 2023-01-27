import numpy as np
import cv2
import matplotlib.pyplot as plt


# A Python program to return multiple
# values from a method using tuple

# This function returns a tuple
def fun():
	str = "geeksforgeeks"
	x = 20
	return str, x; # Return tuple, we could also
					# write (str, x)

# Driver code to test above method
str, x = fun() # Assign returned tuple
print(str)
print(x)

img = cv2.imread('C:/Users/17R4/downloads/standard_test_images/mandril_color.tif', 1)
cv2.circle(img, (233,512), 2, (33, 255, 8), 2, cv2.FILLED)
cv2.imshow("Output", img)
px = img[500,100,1]#green
print( px )

'''
for i in range(rows):
    for j in range(cols):
        k = img[i,j]
        print(k)
img = img.astype(np.float32)
vals = len(np.unique(img))
vals = 2 ** np.ceil(np.log2(vals))
noisy = np.random.poisson(img * vals) / float(vals)
print(abs(noisy-img))
plt.imshow(noisy, cmap='gray')
plt.title('Poisson Noise')
plt.axis('off')
plt.show()
'''