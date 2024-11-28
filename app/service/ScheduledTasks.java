package com.example.blockchainvoting.service;

import com.example.blockchainvoting.repository.PredictionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class ScheduledTasks {

    @Autowired
    private PredictionHistoryRepository predictionHistoryRepository;

   
    @Scheduled(cron = "0 0 2 * * ?")
    public void cleanOldPredictions() {
        LocalDateTime oneMonthAgo = LocalDateTime.now().minusMonths(1);
        Date dateOneMonthAgo = Date.from(oneMonthAgo.atZone(ZoneId.systemDefault()).toInstant());

        predictionHistoryRepository.deleteAllByTimestampBefore(dateOneMonthAgo);
        System.out.println("Old predictions deleted successfully at " + LocalDateTime.now());
    }
}
