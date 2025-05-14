import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    try {
      registerUser(username, password, email);
      System.out.println("User Registeration is Success.");
    } catch (UserRegistrationException e) {
      System.out.println("User Registeration is Fail: " + e.getMessage());
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    public UserRegistrationException(String message) {
      super(message);  // call parent constuctor, then the parent store the message
    }
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    // try {
    // validateUsername(username);
    // validatePassword(password);
    // validateEmail(email);
    // System.out.println("User registered successfully: " + username);
    // } catch (IllegalArgumentException e) {
    // throw new UserRegistrationException(e.getMessage());
    // }
    String errorMessage = "";
    boolean errorFound = false;
    try {
      validateUsername(username);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }

    try {
      validatePassword(password);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }

    try {
      validateEmail(email);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }

    if (errorFound) {
      throw new UserRegistrationException(errorMessage);
    }
    System.out.println("User registered successfully: " + username);
  }

  // ! Below 3 Bomb 💥

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    if (username == null || "".equals(username)) {
      throw new IllegalArgumentException("Username validation fail.");
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // contains
    boolean withSpeicalChar = password.contains("!") || password.contains("@")
        || password.contains("$") || password.contains("&")
        || password.contains("_");
    if (password.length() < 8 || !withSpeicalChar) {
      throw new IllegalArgumentException("Password validation fail.");
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Email validation fail.");
    }
  }
}