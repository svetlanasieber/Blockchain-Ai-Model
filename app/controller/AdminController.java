package com.example.blockchainvoting.controller;

import com.example.blockchainvoting.model.PredictionHistory;
import com.example.blockchainvoting.repository.PredictionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private PredictionHistoryRepository predictionHistoryRepository;

    @GetMapping("/admin/prediction-history")
    public String viewPredictionHistory(Model model) {
        List<PredictionHistory> predictions = predictionHistoryRepository.findAll();
        model.addAttribute("predictions", predictions);
        return "prediction_history";
    }
}
