import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
import random
from sklearn.linear_model import Perceptron
from sklearn.metrics import classification_report

iris = load_iris()
iris.target_names

targets = (iris.target==0).astype(np.int8)

datasets = train_test_split(iris.data, 
                            targets,
                            test_size=0.2)

train_data, test_data, train_labels, test_labels = datasets
sample = random.sample(range(len(train_data)), 10)

print(targets)
p = Perceptron(random_state=42,
               max_iter=10,
               tol=0.001)
p.fit(train_data, train_labels)

for i in sample:
    print(i, p.predict([train_data[i]]))
    
print(classification_report(p.predict(train_data), train_labels))


