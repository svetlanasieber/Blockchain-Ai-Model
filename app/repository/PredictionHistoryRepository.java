package com.example.blockchainvoting.repository;

import com.example.blockchainvoting.model.PredictionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PredictionHistoryRepository extends JpaRepository<PredictionHistory, Long> {
    List<PredictionHistory> findByDayOfWeek(int dayOfWeek);
}
