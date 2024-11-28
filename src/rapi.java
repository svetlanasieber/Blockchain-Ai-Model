import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    public String getPrediction(double[] features) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:5000/predict";
      
        PredictionRequest request = new PredictionRequest(features);
        PredictionResponse response = restTemplate.postForObject(url, request, PredictionResponse.class);
        return response.getPrediction();
    }
}

class PredictionRequest {
    private double[] features;

   
}

class PredictionResponse {
    private String prediction;

  
}
