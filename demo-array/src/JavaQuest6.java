import java.util.ArrayList;
import java.util.List;

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int count = 15; // Change this value as needed
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        int n = 0;
        List<Integer> fibSequence = new ArrayList<>();
        if (n <= 0) return fibSequence;
        
        fibSequence.add(0); // First Fibonacci number
        if (n > 1) fibSequence.add(1); // Second Fibonacci number

        for (int i = 2; i < n; i++) {
            int nextNumber = fibSequence.get(i - 1) + fibSequence.get(i - 2);
            fibSequence.add(nextNumber);
        }
        return fibSequence;

  }
}