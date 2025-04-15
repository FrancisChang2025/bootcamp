import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // abs
    // pow
    // Math.abs(-3.0);
    
    // int -> double (Safe -> auto-conversion)
    double result = Math.pow(2.0, 3);
    System.out.println(result);  // 8.0

    // square root
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.abs(-3.0)); // 3.0
    double value = -3.0;
    double result2 = 0.0;
    
    if (value < 0) {
      result2 = value * -1;
    } else {
      result2 = value;
    }
    System.out.println(result2);


    // Round to integer
    System.out.println(Math.round(3.24));   // 3
    System.out.println(Math.round(3.78121831));   //4

    // 0 -1
    System.out.println(Math.random());  // 0.2907474330135633

    System.out.println(new Random().nextInt(3)); // 0 - 2

    // 1 - 3
    System.out.println(new Random().nextInt(3) + 1); // 1 - 3

    
    // ! Remember the below:
    //  1 - 49 (Marksix)
    //  0 - 48
    System.out.println(new Random().nextInt(49) + 1);   // 1 - 49

    // Generate 6 numbers between 1-49 隨意抽出6個，可重覆
    int[] marksix = new int[6];
    int k = 0;
      while(k < 6) {
        marksix[k] = new Random().nextInt(49) + 1;
        k++;
     }

    System.out.println("Marksix=" + k);

       // Generate 6 different numbers between 1-49 隨意抽出6個，但不可重覆
       int[] marksix2 = new int[6];
      k = 0;
      int uniqueCount = 0;
      boolean isDuplicated = false;
      while(uniqueCount < 6) {
        int gereratedValue= new Random().nextInt(49) + 1;

        // ! Check if generated value is already in the array -> isDuplicated
        // code...for loop + if
        isDuplicated = false;
        for (int i = 0; i < marksix2.length; i++){
          if (marksix2[i] == gereratedValue) {
            isDuplicated = true;
            break;
          }
        }

        if (!isDuplicated){
          marksix2[uniqueCount] = gereratedValue;
          uniqueCount++;
           }
       }
       System.out.println(Arrays.toString(marksix2));

       
  }
}
