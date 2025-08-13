import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Speech Disability Assistant - Java Application
 * 
 * This application helps people with speech disabilities by providing:
 * 1. Speech-to-text conversion for those with unclear speech
 * 2. Text-to-speech for those who cannot speak
 * 3. Communication assistance and text saving functionality
 * 
 * Problem Statement: People with speech disabilities (dysarthria, apraxia, 
 * stuttering, etc.) often face challenges in digital communication. This tool
 * provides assistive technology to bridge that gap.
 * 
 * Note: This is a simulation. Real implementation requires speech libraries
 * like CMU Sphinx, Google Speech API, or Microsoft Speech Platform.
 */
public class SpeechDisabilityAssistant {
    
    private static final String CONVERSATION_LOG = "speech_assistance_log.txt";
    private static List<String> conversationHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        displayWelcomeScreen();
        mainMenu();
    }
    
    private static void displayWelcomeScreen() {
        System.out.println("==============================================================");
        System.out.println("            SPEECH DISABILITY ASSISTANT                      ");
        System.out.println("                                                              ");
        System.out.println("    Helping people with speech challenges communicate        ");
        System.out.println("                                                              ");
        System.out.println("  Features:                                                   ");
        System.out.println("  * Speech-to-Text Conversion                                ");
        System.out.println("  * Text-to-Speech Playback                                  ");
        System.out.println("  * Communication Templates                                  ");
        System.out.println("  * Conversation History                                     ");
        System.out.println("==============================================================");
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
    
    private static void mainMenu() {
        while (true) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("           MAIN MENU");
            System.out.println("=".repeat(50));
            System.out.println("1. [MIC] Speech-to-Text Converter");
            System.out.println("2. [SPEAKER] Text-to-Speech Player");
            System.out.println("3. [CHAT] Quick Communication Templates");
            System.out.println("4. [NOTES] View Conversation History");
            System.out.println("5. [DELETE] Clear All Data");
            System.out.println("6. [HELP] Help & Instructions");
            System.out.println("7. [EXIT] Exit Application");
            System.out.println("=".repeat(50));
            System.out.print("Choose an option (1-7): ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    speechToTextFunction();
                    break;
                case "2":
                    textToSpeechFunction();
                    break;
                case "3":
                    quickCommunicationTemplates();
                    break;
                case "4":
                    viewConversationHistory();
                    break;
                case "5":
                    clearAllData();
                    break;
                case "6":
                    displayHelp();
                    break;
                case "7":
                    exitApplication();
                    return;
                default:
                    System.out.println("X Invalid option. Please try again.");
            }
        }
    }
    
    /**
     * Speech-to-Text Function
     * In real implementation, this would use speech recognition libraries
     */
    private static void speechToTextFunction() {
        System.out.println("\n[MIC] SPEECH-TO-TEXT CONVERTER");
        System.out.println("-".repeat(40));
        System.out.println("This feature helps convert unclear or difficult speech into clear text.");
        System.out.println("\n[SIMULATION MODE - Real version would capture audio]");
        
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Start speech recognition");
            System.out.println("2. Practice with text input (simulation)");
            System.out.println("3. Return to main menu");
            System.out.print("Choose: ");
            
            String option = scanner.nextLine().trim();
            
            switch (option) {
                case "1":
                    simulateSpeechRecognition();
                    break;
                case "2":
                    practiceTextInput();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
    
    private static void simulateSpeechRecognition() {
        System.out.println("\n[REC] Recording... (Simulation)");
        System.out.println("In a real implementation, this would:");
        System.out.println("* Capture audio from microphone");
        System.out.println("* Process speech using AI recognition");
        System.out.println("* Handle unclear speech patterns");
        System.out.println("* Correct common speech errors");
        
        // Simulate processing delay
        System.out.print("Processing speech");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        
        System.out.print("\nFor simulation, please type what you would say: ");
        String simulatedSpeech = scanner.nextLine();
        
        if (!simulatedSpeech.trim().isEmpty()) {
            String processedText = processSpeechText(simulatedSpeech);
            displayConvertedText(processedText);
            logConversation("Speech-to-Text", simulatedSpeech, processedText);
        }
    }
    
    private static void practiceTextInput() {
        System.out.println("\n[PRACTICE] Practice Mode");
        System.out.println("Type sentences that might be difficult to pronounce:");
        System.out.print("Your text: ");
        String practiceText = scanner.nextLine();
        
        if (!practiceText.trim().isEmpty()) {
            String processedText = processSpeechText(practiceText);
            displayConvertedText(processedText);
            
            // Provide pronunciation tips
            providePronunciationTips(practiceText);
            logConversation("Practice", practiceText, processedText);
        }
    }
    
    private static String processSpeechText(String rawText) {
        // Simulate speech processing improvements
        String processed = rawText;
        
        // Common speech disability corrections (simulation)
        processed = processed.replace("th", "th"); // Placeholder for real processing
        processed = processed.replaceAll("\\s+", " "); // Clean extra spaces
        processed = processed.trim();
        
        // Capitalize first letter
        if (!processed.isEmpty()) {
            processed = processed.substring(0, 1).toUpperCase() + 
                       processed.substring(1);
        }
        
        return processed;
    }
    
    private static void displayConvertedText(String text) {
        System.out.println("\n[CHECK] CONVERTED TEXT:");
        System.out.println("+" + "-".repeat(50) + "+");
        System.out.println("| " + String.format("%-48s", text) + " |");
        System.out.println("+" + "-".repeat(50) + "+");
        
        System.out.print("\nWould you like to save this text? (y/n): ");
        String save = scanner.nextLine().trim().toLowerCase();
        if (save.startsWith("y")) {
            saveTextToFile(text);
        }
    }
    
    /**
     * Text-to-Speech Function
     */
    private static void textToSpeechFunction() {
        System.out.println("\n[SPEAKER] TEXT-TO-SPEECH PLAYER");
        System.out.println("-".repeat(40));
        System.out.println("This feature helps people who cannot speak to communicate.");
        
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Type text to convert to speech");
            System.out.println("2. Use quick phrases");
            System.out.println("3. Return to main menu");
            System.out.print("Choose: ");
            
            String option = scanner.nextLine().trim();
            
            switch (option) {
                case "1":
                    customTextToSpeech();
                    break;
                case "2":
                    quickPhrasesToSpeech();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
    
    private static void customTextToSpeech() {
        System.out.print("\nEnter text to convert to speech: ");
        String textToSpeak = scanner.nextLine();
        
        if (!textToSpeak.trim().isEmpty()) {
            simulateTextToSpeech(textToSpeak);
            logConversation("Text-to-Speech", textToSpeak, "Spoken aloud");
        }
    }
    
    private static void quickPhrasesToSpeech() {
        String[] quickPhrases = {
            "Hello, how are you?",
            "Thank you very much.",
            "Please help me.",
            "I need assistance.",
            "Can you repeat that?",
            "I understand.",
            "I don't understand.",
            "Excuse me.",
            "I'm sorry.",
            "Have a good day."
        };
        
        System.out.println("\n[MOBILE] Quick Phrases:");
        for (int i = 0; i < quickPhrases.length; i++) {
            System.out.println((i + 1) + ". " + quickPhrases[i]);
        }
        System.out.print("\nSelect a phrase (1-" + quickPhrases.length + ") or 0 to return: ");
        
        try {
            int selection = Integer.parseInt(scanner.nextLine().trim());
            if (selection >= 1 && selection <= quickPhrases.length) {
                simulateTextToSpeech(quickPhrases[selection - 1]);
                logConversation("Quick Phrase", quickPhrases[selection - 1], "Spoken aloud");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid selection.");
        }
    }
    
    private static void simulateTextToSpeech(String text) {
        System.out.println("\n[SPEAKER] Playing speech...");
        System.out.println("Text: \"" + text + "\"");
        System.out.println("[In real implementation, this would use TTS engine]");
        
        // Simulate speech playback
        System.out.print("Speaking");
        for (int i = 0; i < text.length() / 10; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\n[CHECK] Speech playback complete!");
    }
    
    /**
     * Quick Communication Templates
     */
    private static void quickCommunicationTemplates() {
        System.out.println("\n[CHAT] QUICK COMMUNICATION TEMPLATES");
        System.out.println("-".repeat(45));
        
        String[][] templates = {
            {"Medical", "I need medical help.", "I'm in pain.", "Call a doctor.", "Emergency!"},
            {"Daily Needs", "I'm hungry.", "I'm thirsty.", "I need to rest.", "Bathroom please."},
            {"Social", "Good morning!", "How are you?", "Nice to meet you.", "See you later."},
            {"Work/School", "I have a question.", "I need help.", "Thank you.", "I understand."}
        };
        
        for (int i = 0; i < templates.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + templates[i][0] + ":");
            for (int j = 1; j < templates[i].length; j++) {
                System.out.println("   * " + templates[i][j]);
            }
        }
        
        System.out.print("\nSelect category (1-" + templates.length + ") or 0 to return: ");
        try {
            int category = Integer.parseInt(scanner.nextLine().trim());
            if (category >= 1 && category <= templates.length) {
                System.out.print("Select phrase (1-" + (templates[category-1].length-1) + "): ");
                int phrase = Integer.parseInt(scanner.nextLine().trim());
                if (phrase >= 1 && phrase < templates[category-1].length) {
                    String selectedPhrase = templates[category-1][phrase];
                    simulateTextToSpeech(selectedPhrase);
                    logConversation("Template", selectedPhrase, "Spoken aloud");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid selection.");
        }
        
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
    
    private static void viewConversationHistory() {
        System.out.println("\n[NOTES] CONVERSATION HISTORY");
        System.out.println("-".repeat(40));
        
        if (conversationHistory.isEmpty()) {
            System.out.println("No conversation history available.");
        } else {
            for (int i = 0; i < conversationHistory.size(); i++) {
                System.out.println((i + 1) + ". " + conversationHistory.get(i));
            }
        }
        
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
    
    private static void logConversation(String type, String input, String output) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm");
        String logEntry = String.format("[%s] %s: %s -> %s", 
            now.format(formatter), type, input, output);
        
        conversationHistory.add(logEntry);
        
        try (FileWriter writer = new FileWriter(CONVERSATION_LOG, true)) {
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            System.out.println("Error saving to log file.");
        }
    }
    
    private static void saveTextToFile(String text) {
        try (FileWriter writer = new FileWriter("saved_speech_text.txt", true)) {
            LocalDateTime now = LocalDateTime.now();
            writer.write("[" + now + "] " + text + "\n");
            System.out.println("[CHECK] Text saved to saved_speech_text.txt");
        } catch (IOException e) {
            System.out.println("[X] Error saving text to file.");
        }
    }
    
    private static void providePronunciationTips(String text) {
        System.out.println("\n[LIGHTBULB] Pronunciation Tips:");
        System.out.println("* Speak slowly and clearly");
        System.out.println("* Take breaks between words if needed");
        System.out.println("* Practice difficult sounds repeatedly");
        System.out.println("* Use breathing exercises before speaking");
    }
    
    private static void clearAllData() {
        System.out.print("Are you sure you want to clear all data? (yes/no): ");
        String confirm = scanner.nextLine().trim().toLowerCase();
        
        if (confirm.equals("yes")) {
            conversationHistory.clear();
            System.out.println("[CHECK] All data cleared.");
        } else {
            System.out.println("Operation cancelled.");
        }
    }
    
    private static void displayHelp() {
        System.out.println("\n[HELP] HELP & INSTRUCTIONS");
        System.out.println("=".repeat(50));
        System.out.println("This application is designed for people with speech disabilities including:");
        System.out.println("* Dysarthria (unclear speech due to muscle weakness)");
        System.out.println("* Apraxia (difficulty coordinating speech movements)");
        System.out.println("* Stuttering and other fluency disorders");
        System.out.println("* Voice disorders");
        System.out.println("* Post-stroke communication difficulties");
        System.out.println("\nFeatures explained:");
        System.out.println("1. Speech-to-Text: Converts unclear speech to readable text");
        System.out.println("2. Text-to-Speech: Speaks written text aloud");
        System.out.println("3. Templates: Quick access to common phrases");
        System.out.println("4. History: Track and review conversations");
        System.out.println("\nFor real implementation, this would integrate with:");
        System.out.println("* Google Cloud Speech-to-Text API");
        System.out.println("* Microsoft Azure Cognitive Services");
        System.out.println("* CMU Sphinx for offline processing");
        System.out.println("* Native OS text-to-speech engines");
        
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
    
    private static void exitApplication() {
        System.out.println("\n[WAVE] Thank you for using Speech Disability Assistant!");
        System.out.println("Remember: Your voice matters, and technology is here to help.");
        System.out.println("Stay strong and keep communicating! [MUSCLE]");
        scanner.close();
    }
}