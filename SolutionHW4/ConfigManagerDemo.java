import java.util.Scanner;
public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter max players: ");
        String maxPlayers = scanner.nextLine();
        configManager.setConfig("maxPlayers", maxPlayers);

        System.out.print("Enter default language: ");
        String defaultLanguage = scanner.nextLine();
        configManager.setConfig("defaultLanguage", defaultLanguage);

        System.out.print("Enter game difficulty: ");
        String gameDifficulty = scanner.nextLine();
        configManager.setConfig("gameDifficulty", gameDifficulty);

        System.out.println("Updated Configurations:");
        configManager.printAllConfigs();
        scanner.close();
    }
}
