import numpy as np
from sklearn import datasets, linear_model
import matplotlib.pyplot as plt

boston = datasets.load_boston()
print(boston)
print()

print('Información en el dataset:')
print(boston.keys())
print()

print('Características del dataset:')
print(boston.DESCR)

print('Cantidad de datos:')
print(boston.data.shape)
print()

print('Nombres columnas:')
print(boston.feature_names)

X_p = boston.data[:, np.newaxis, 5]

y_p = boston.target

plt.scatter(X_p, y_p)
plt.show()

from sklearn.model_selection import train_test_split

X_train_p, X_test_p, y_train_p, y_test_p = train_test_split(X_p, y_p, test_size=0.2)
from sklearn.preprocessing import PolynomialFeatures

poli_reg = PolynomialFeatures(degree = 3)

X_train_poli = poli_reg.fit_transform(X_train_p)
X_test_poli = poli_reg.fit_transform(X_test_p)

pr = linear_model.LinearRegression()

pr.fit(X_train_poli, y_train_p)

Y_pred_pr = pr.predict(X_test_poli)

plt.scatter(X_test_p, y_test_p)
plt.plot(X_test_p, Y_pred_pr, color='red', linewidth=3)
plt.show()
print()
print('DATOS DEL MODELO REGRESIÓN POLINOMIAL')
print()
print('Valor de la pendiente o coeficiente "a":')
print(pr.coef_)
print('Valor de la intersección o coeficiente "b":')
print(pr.intercept_)
print('Precisión del modelo:')
print(pr.score(X_train_poli, y_train_p))