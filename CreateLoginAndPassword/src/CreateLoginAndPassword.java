import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateLoginAndPassword {
    private static final int MAX_LENGTH = 8;
    private static final int NUMBER_OF_LOGINS_AND_PASSWORDS = 10;
    private static final String FILE_NAME = "logins_passwords.txt";

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (int i = 1; i < NUMBER_OF_LOGINS_AND_PASSWORDS + 1; i++) {
                String login = generateLogin(MAX_LENGTH);
                String password = generatePassword(MAX_LENGTH);
                writer.write(i + ") Account");
                writer.write("\nLogin: " + login + "\nPassword: " + password + "\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateLogin(int maxLength) {
        StringBuilder login = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            int index = random.nextInt(3);
            switch (index) {
                case 0:
                    login.append((char) ('a' + random.nextInt(26)));
                    break;
                case 1:
                    login.append((char) ('A' + random.nextInt(26)));
                    break;
                case 2:
                    login.append((char) ('0' + random.nextInt(10)));
                    break;
            }
        }
        return login.toString();
    }

    private static String generatePassword(int maxLength) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            int index = random.nextInt(3);
            switch (index) {
                case 0:
                    password.append((char) ('a' + random.nextInt(26)));
                    break;
                case 1:
                    password.append((char) ('A' + random.nextInt(26)));
                    break;
                case 2:
                    password.append((char) ('0' + random.nextInt(10)));
                    break;
            }
        }
        return password.toString();
    }
}