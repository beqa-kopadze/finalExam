package finalexam.task5;

public class CommunicationManager {

    private String endpoint;
    private final HttpClient httpClient;

    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
        this.httpClient = new HttpClient();
    }

    public String sendUserMessage(String message) {
        String jsonInputString = "{\"message\": \"" + message + "\"}";
        return httpClient.sendPostRequest(endpoint, jsonInputString);
    }
}
