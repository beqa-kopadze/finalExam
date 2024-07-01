package finalexam.task5;

public class CommunicationTester {

    public static void main(String[] args) {
        // Example endpoint
        String endpoint = "https://jsonplaceholder.typicode.com/posts";
        CommunicationManager commManager = new CommunicationManager(endpoint);

        // Example message
        String message = "Hello, how can I help you?";
        String response = commManager.sendUserMessage(message);

        System.out.println("Response from server: " + response);
    }
}
