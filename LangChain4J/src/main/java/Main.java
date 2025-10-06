import dev.langchain4j.model.openai.OpenAiChatModel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the model (demo endpoint — no API key needed)
        OpenAiChatModel model = OpenAiChatModel.builder()
            .baseUrl("http://langchain4j.dev/demo/openai/v1")
            .apiKey("demo")
            .modelName("gpt-4o-mini")
            .build();

        Scanner scanner = new Scanner(System.in);
        System.out.println("LangChain4J Chat (type 'exit' to quit)");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Bye!");
                break;
            }

            // Send to model
            try {
                String answer = model.chat(input);
                System.out.println("AI: " + answer);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}