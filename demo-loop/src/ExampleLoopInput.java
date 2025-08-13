import java.util.Scanner;

public class ExampleLoopInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter names (type 'exit' to quit):");
        while (true) {
            name = scanner.nextLine(); // Read a string input
            if ("exit".equalsIgnoreCase(name)) {
                break; // Exit loop if user types 'exit'
            }
            System.out.println("You entered: " + name);
        }
        // Close the scanner
        scanner.close();
  }
}
