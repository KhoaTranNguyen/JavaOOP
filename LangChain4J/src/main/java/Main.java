package LangChain4J.src.main.java;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.data.message.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize the model (demo endpoint — no API key needed)
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        int maxHistory = 20;
        List<ChatMessage> history = new ArrayList<>();
        history.add(SystemMessage.from("You are a helpful assistant."));

        Scanner scanner = new Scanner(System.in);
        System.out.println("LangChain4J Chat (type 'exit' to quit)");
        System.out.println("----------------------------------------");

        while (true) {
            if (history.size() > maxHistory) {
                history = history.subList(history.size() - maxHistory, history.size());
            }

            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Bye!");
                break;
            }

            try {
                UserMessage userMessage;

                if (input.startsWith("url:")) {
                    String imageUrl = input.substring(4).trim();
                    userMessage = UserMessage.from(
                            TextContent.from("Describe this image:"),
                            ImageContent.from(imageUrl)
                    );
                } else if (input.startsWith("file:")) {
                    String filePath = input.substring(5).trim();
                    File file = new File(filePath);
                    byte[] imageBytes = Files.readAllBytes(file.toPath());
                    String base64 = Base64.getEncoder().encodeToString(imageBytes);
                    userMessage = UserMessage.from(
                            TextContent.from("Describe this image:"),
                            ImageContent.from(base64, "image/" + getExtension(filePath))
                    );
                } else {
                    userMessage = UserMessage.from(input);
                }

                history.add(userMessage);

                AiMessage ai = model.chat(history).aiMessage();
                System.out.println("AI: " + ai.text());

                history.add(ai);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // Utility to get file extension
    private static String getExtension(String filePath) {
        int dotIndex = filePath.lastIndexOf('.');
        return dotIndex == -1 ? "png" : filePath.substring(dotIndex + 1);
    }
}