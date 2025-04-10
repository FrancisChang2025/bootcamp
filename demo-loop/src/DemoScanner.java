import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt();
    System.out.println("input=" + input);  // result will ask you type (input) data

    // Determin if the is odd or even number
    // Its odd number.
    // Its even number.
    if (input % 2 == 1){
      System.out.println("Its odd number");
    } else {
      System.out.println("Its even number");
    }
  }
}
