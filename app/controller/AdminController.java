package com.example.blockchainvoting.controller;

import com.example.blockchainvoting.model.PredictionHistory;
import com.example.blockchainvoting.repository.PredictionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private PredictionHistoryRepository predictionHistoryRepository;

    @GetMapping("/admin/prediction-history")
    @ResponseBody
    public List<PredictionHistory> viewPredictionHistory(@RequestParam(required = false) Integer dayOfWeek) {
        if (dayOfWeek != null) {
            return predictionHistoryRepository.findByDayOfWeek(dayOfWeek);
        } else {
            return predictionHistoryRepository.findAll();
        }
    }
}
