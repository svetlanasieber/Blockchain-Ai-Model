package com.example.blockchainvoting.repository;

import com.example.blockchainvoting.model.PredictionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface PredictionHistoryRepository extends JpaRepository<PredictionHistory, Long> {

    void deleteAllByTimestampBefore(Date date);
}
