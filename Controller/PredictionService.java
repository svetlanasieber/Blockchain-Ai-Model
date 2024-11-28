import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping("/predict-activity")
    public String predictActivity(@RequestParam int dayOfWeek, @RequestParam int hourOfDay) {
        return predictionService.getPrediction(dayOfWeek, hourOfDay);
    }
}
