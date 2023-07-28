import java.security.SecureRandom;

public class Main {

    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static String generatePassword(int length) {
        String allCharacters = UPPER_CASE + LOWER_CASE + DIGITS + SPECIAL_SYMBOLS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Set the desired password length
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
}
