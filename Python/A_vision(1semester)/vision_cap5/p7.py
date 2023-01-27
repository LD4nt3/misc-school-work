import cv2
img1 = cv2.imread('C:/Users/17R4/downloads/standard_test_images/mandril_color.tif', 1)
img2 = cv2.imread('C:/Users/17R4/downloads/standard_test_images/jetplane.tif', 1)
cv2.imshow('Image1', img1 * 2)
cv2.waitKey(0)
cv2.destroyAllWindows()