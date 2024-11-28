package com.example.blockchainvoting.service;

import com.example.blockchainvoting.model.PredictionHistory;
import com.example.blockchainvoting.repository.PredictionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class PredictionService {

    @Autowired
    private PredictionHistoryRepository predictionHistoryRepository;

    private final String PREDICTION_API_URL = "http://localhost:5000/predict";

    public String getPrediction(int dayOfWeek, int hourOfDay) {
        RestTemplate restTemplate = new RestTemplate();

      
        String jsonPayload = String.format("{\"day_of_week\": %d, \"hour_of_day\": %d}", dayOfWeek, hourOfDay);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(jsonPayload, headers);

      
        ResponseEntity<String> response = restTemplate.exchange(
                PREDICTION_API_URL, HttpMethod.POST, entity, String.class
        );

        String predictionResult = response.getBody();

     
        PredictionHistory predictionHistory = new PredictionHistory(dayOfWeek, hourOfDay, predictionResult, LocalDateTime.now());
        predictionHistoryRepository.save(predictionHistory);

        return predictionResult;
    }
}
