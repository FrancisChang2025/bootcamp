import javax.swing.plaf.synth.SynthStyle;

public class Factorial {
  public static int factorial(int n) {
    // Base case 基本情況
    if (n == 0) {
        return 1;
    }
    // Recursive case 遞歸情況
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    int number = 5;
    System.out.println("Factorial of " + number + " is: " + factorial(number));
  }   // Factorial of 5 is: 120
}
