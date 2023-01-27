import cv2
img1 = cv2.imread('C:/Users/che_d/downloads/standard_test_images/mandril_color.tif', 1)
img2 = cv2.imread('C:/Users/che_d/downloads/standard_test_images/jetplane.tif', 1)
cv2.imshow('Blended Image',
           cv2.addWeighted(img1, 0.5, img2, 0.5, 0))
cv2.waitKey(0)
cv2.destroyAllWindows()