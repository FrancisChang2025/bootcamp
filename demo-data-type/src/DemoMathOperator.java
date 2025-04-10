public class DemoMathOperator {
  public static void main(String[] args) {
    // + 1
    int x = 3;

    // 4 methods to count + 1, below run 4 differents equals to 4 times, so "3+4"
    x = x + 1;
    x += 1;
    x++; // Normally use
    ++x;
    System.out.println("x=" + x); // 7

    // -1
    int y = 5;
    y = y - 1;
    y -=1;
    y--;
    --y;
    System.out.println("y=" + y);  // 1


    // + or  - non 1 number
    int z = 10;
    z = z + 2;
    z += 2;
    z = z -3;
    z -= 3;
    System.out.println("z=" + z);  // 8


    // * or /
    int a = 6;

    a = a * 5;
    a *= 5;

    a = a /3;
    a /= 3;

    System.out.println("a=" + a); // 2

    
    // Count number of even number between 0 - 9  (Avoid odd number)
    int evenCounter = 0;
    for (int i = 0; i < 10; i++){ // 0,1,2,3,4,5,6,7,8,9
      if (i % 2 == 0) {
        evenCounter++;
        }
      }
      System.out.println("No. of Even Number: " + evenCounter);

      // Ans: 5, using Loop to identify Odd or Even, then counter number
      // if ()


      // ! Method 1 (Run 2 steps)
      // Max (Larger Number) between 2 numbers
      int num1 = 10;
      int num2 = 12;
      // 12 
      int max = 0;
      if (num1 > num2) {
        max = num1;
      } else {
        max = num2;
      }
      System.out.println(max);


      // Larger Number between 3 numbers
      int num3 = 13;
      // 13
      if (max < num3){
        max = num3;
      }
      System.out.println(max);

      // ! Method 2 to num3, using for Loop, run 3 steps & confirm duplicate

      // Find Min. number
      // 40, 32, -19
      int min = 0;
      int num4 = 40;
      int num5 = 32;
      int num6 = -19;
      if (num4 < num5 ){
        min = num4;
      } else {
        min = num5;
      }
      System.out.println("The Min. number is: " + min);  // 32

      if (min != num6){
        min = num6;
      }
      System.out.println("The Min. number is: " + min);  // -19

      }

    }

  

