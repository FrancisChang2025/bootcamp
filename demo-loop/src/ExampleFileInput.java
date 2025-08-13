import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleFileInput {
  public static void main(String[] args) {
    // Specify the file to read from
        File file = new File("input.txt");
        try {
            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);
            
            // Read and display each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
  }
}
