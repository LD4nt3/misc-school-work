import cv2
img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 1)
b1 = cv2.copyMakeBorder(img, 10, 10, 10, 10, cv2.BORDER_WRAP)
b2 = cv2.copyMakeBorder(img, 10, 10, 10, 10, cv2.BORDER_CONSTANT, value=[255, 0, 0])
cv2.imshow('Wrap', b1)
cv2.imshow('Constant', b2)
cv2.waitKey(0)
cv2.destroyAllWindows()