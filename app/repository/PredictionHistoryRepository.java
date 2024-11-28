package com.example.blockchainvoting.repository;

import com.example.blockchainvoting.model.PredictionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionHistoryRepository extends JpaRepository<PredictionHistory, Long> {
}
