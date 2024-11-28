package com.example.blockchainvoting.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PredictionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int dayOfWeek;
    private int hourOfDay;
    private String predictionResult;

    private LocalDateTime timestamp;

    public PredictionHistory() {
    }

    public PredictionHistory(int dayOfWeek, int hourOfDay, String predictionResult, LocalDateTime timestamp) {
        this.dayOfWeek = dayOfWeek;
        this.hourOfDay = hourOfDay;
        this.predictionResult = predictionResult;
        this.timestamp = timestamp;
    }


    public Long getId() {
        return id;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(int hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public String getPredictionResult() {
        return predictionResult;
    }

    public void setPredictionResult(String predictionResult) {
        this.predictionResult = predictionResult;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
