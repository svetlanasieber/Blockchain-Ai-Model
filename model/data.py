import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score
import pickle


data = {
    'day_of_week': [1, 2, 3, 4, 5, 6, 7] * 10, 
    'hour_of_day': np.random.randint(0, 24, 70),  
    'users_active': np.random.randint(50, 200, 70) 
}

df = pd.DataFrame(data)


df['high_activity'] = df['users_active'].apply(lambda x: 1 if x > 100 else 0)


X = df[['day_of_week', 'hour_of_day']]
y = df['high_activity']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)


model = LogisticRegression()
model.fit(X_train, y_train)


y_pred = model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print(f'Accuracy: {accuracy:.2f}')


with open('activity_model.pkl', 'wb') as f:
    pickle.dump(model, f)
