import cv2
img = cv2.imread('C:/Users/che_d/downloads/standard_test_images/peppers_color.tif', 1)
upscale = cv2.resize(img, None, fx=1.5, fy=1.5,
                     interpolation=cv2.INTER_CUBIC)
downscale = cv2.resize(img, None, fx=0.5, fy=0.5,
                       interpolation=cv2.INTER_AREA)
cv2.imshow('upscale', upscale)
cv2.imshow('downscale', downscale)
cv2.waitKey(0)
cv2.destroyAllWindows()