// Custom Exception

import java.util.Scanner;
import javax.naming.InvalidNameException;
import javax.naming.NameClassPair;
import javax.swing.plaf.synth.SynthStyle;

public class InvalidAgeException extends RuntimeException {
  private String code;

  public static void main(String[] args) {
    // InvalidAgeException iae = new InvalidAgeException();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input an age number:");
    int input = scanner.nextInt();

    try {
      int result = calculate(input);
      System.out.println("The input is " + input + " and the result is " + result);
    } catch (InvalidAgeException e) {
      System.out.println("Please input again. The value age is invalid.");
    }

    scanner.nextLine();

    // capture name, name length cannot be > 10
    System.out.println("Please input a name: ");
    String name = scanner.nextLine();
    try {
      int length = nameLength(name);
      System.out.println("The name length=" + length);
    } catch (NameTooLongException e) {
      System.out.println("The name " + name + " is too long. Please inpt again.");
    }
  }

    public static int nameLength(String name) {
      if (name.length() > 10)
        throw new NameTooLongException();
      return name.length();
    }


    public static int calculate(int age) {
      if (age < 0) {
        throw new InvalidAgeException();
      }
      return age + 10;
    }
}
