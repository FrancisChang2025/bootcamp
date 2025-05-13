public class RandomPWGenerator {

  public static String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
  public static String digits = "0123456789";
  public static String specialCharacters = "!@#$%^&*()-_+=<>?";
  public static String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

  private static final int PASSWORD_LENGTH = 12; // Adjust length as needed

  public static void main(String[] args) {
    String password = generatePassword(PASSWORD_LENGTH);
    System.out.println("Generated Password: " + password);
  } 

  private static String generatePassword(int length) {
     SecureRandom random = new SecureRandom();
     StringBuilder password = new StringBuilder(length);

     for (int i = 0; i < length; i++) {
         int index = random.nextInt(CHARACTERS.length());
         password.append(CHARACTERS.charAt(index));
     }

    return password.toString();
  }
}
