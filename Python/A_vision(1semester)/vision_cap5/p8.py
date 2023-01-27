import cv2
img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 1)
negative = abs(255 - img)
cv2.imshow('Grayscale', img)
cv2.imshow('Negative', negative)
cv2.waitKey(0)
cv2.destroyAllWindows()