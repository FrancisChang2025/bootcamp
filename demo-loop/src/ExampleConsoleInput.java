import java.util.Scanner;

public class ExampleConsoleInput {
  public static void main(String[] args) {
     // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a string
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();        // Read an integer
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble(); // Read a double
        // Display the input
        System.out.println("Hello, " + name + ". You are " + age + " years old and " + height + " meters tall.");
        // Close the scanner
        scanner.close();
  }
}
