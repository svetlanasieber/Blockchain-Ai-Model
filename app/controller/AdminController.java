package com.example.blockchainvoting.controller;

import com.example.blockchainvoting.model.PredictionHistory;
import com.example.blockchainvoting.repository.PredictionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PredictionHistoryRepository predictionHistoryRepository;

    @GetMapping("/prediction-history")
    public String viewPredictionHistory(org.springframework.ui.Model model) {
        List<PredictionHistory> predictions = predictionHistoryRepository.findAll();
        model.addAttribute("predictions", predictions);
        return "prediction_history";
    }

    @GetMapping("/activity-stats/days")
    @ResponseBody
    public List<Long> getMostActiveDays() {
        List<Long> activityByDay = predictionHistoryRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(PredictionHistory::getDayOfWeek, Collectors.counting()))
                .values()
                .stream()
                .collect(Collectors.toList());

        return activityByDay;
    }

    @GetMapping("/activity-stats/hours")
    @ResponseBody
    public List<Long> getMostActiveHours() {
        List<Long> activityByHour = predictionHistoryRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(PredictionHistory::getHourOfDay, Collectors.counting()))
                .values()
                .stream()
                .collect(Collectors.toList());

        return activityByHour;
    }
}
