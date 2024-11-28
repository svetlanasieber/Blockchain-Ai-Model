import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class PredictionService {

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

        return response.getBody();
    }
}
