import cv2
img1 = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 1)
img2 = cv2.imread('C:/Users/che_d/downloads/standard_test_images/jetplane.tif', 1)
cv2.imshow('NumPy Subtract', img1 - img2 )
cv2.imshow('OpenCV Subtract', cv2.subtract(img1, img2))
cv2.waitKey(0)
cv2.destroyAllWindows()