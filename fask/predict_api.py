from flask import Flask, request, jsonify
import pickle
import numpy as np

app = Flask(__name__)


with open('activity_model.pkl', 'rb') as f:
    model = pickle.load(f)

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    day_of_week = data['day_of_week']
    hour_of_day = data['hour_of_day']
    features = np.array([[day_of_week, hour_of_day]])
    prediction = model.predict(features)
    return jsonify({'high_activity': int(prediction[0])})

if __name__ == '__main__':
    app.run(port=5000)
