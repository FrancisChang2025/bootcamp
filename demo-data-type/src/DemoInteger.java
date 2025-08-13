public class DemoInteger {
  public static void main(String[] args) {
     System.out.println("Hello, World!"); // Hello, World!

    // define variable y to store an integer value 100
    // print out variable y
    int y = 100;
    System.out.println(y);  // 100

    // Re-assigment
    y = 200;
    System.out.println(y);  // 200

    // int is a data type
    // ! We cannot re-define the type of y
    // We can define the type of y once
    // int y = 200; 

    // + - * /
    int a = 1 + 2;
    System.out.println(a); // 3

    // from right to left
    // 1. y + 2 -> 202
    // 2. Assign 202 into y.
    y = y + 2;
    System.out.println(y); // 202

    // - *
    // Define variable b, store 99
    // b - 200, put the result into q
    // print out q
    // q * 10, put the result into q again
    // print out q
    int b = 99;
    System.out.println(b); // 99
    
    int q = b - 200;
    System.out.println(q); // -101

    int Q = q * 10;
    System.out.println(Q);  // -1010

    int bootcamp = 6 + 5 * 10;
    System.out.println(bootcamp); // 56

    bootcamp = (6 + 10) * 5;
    System.out.println(bootcamp);  // 80

    int r = 4 /2;
    System.out.println(r); //2

    // ! Put 2.5 into an integer variable 👉 trim deciaml place (Java)
    int r2 = 5 / 2;
    System.out.println(r2); // 2

    // ! Put ~3.33333 into an integer variable 👉 trim deciaml place (Java)
    r2 = 10 / 3;
    System.out.println(r2); // 3
  }
}
