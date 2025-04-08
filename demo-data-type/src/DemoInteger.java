public class DemoInteger {
  public static void main(String[] args) {
     System.out.println("Hello, World!");

    // define variable y to store an integer value 100
    // print out variable y
    int y = 100;
    System.out.println(y);

    // Re-assigment
    y = 200;
    System.out.println(y);

    // int is a data type
    // ! We cannot re-define the type of y
    // We can define the ype of y once
    // int y = 200; 

    // + - * /
    int a = 1 + 2;
    System.out.println(a); //3


    // from right to left
    // 1. y + 2 -> 202
    // 2. Assign 202 into y.
    y = y + 2;
    System.out.println(y); // 202

    // - *
    // Define variable b, store 99
    // b - 200, put the result in to q
    // print out q
    // q x 10, put the result into Q again
    // print out q
    int b = 99;
    System.out.println(b);
    
    int q = b - 200;
    System.out.println(q);

    int Q = q * 10;
    System.out.println(Q);

    int bootcamp = 6 + 5 * 10;
    System.out.println(bootcamp); // 56

    bootcamp = (6 + 10) * 5;
    System.out.println(bootcamp);  // 80

    int r = 4 /2;
    System.out.println(r); //2

    // Put 2.5 into an integer variable  -> trim deciaml place (Java)
    int r2 = 5 / 2;
    System.out.println(r2); // 2

    // Put ~3.33333 into an 
    r2 = 10 / 3;
    System.out.println(r2); // 3



  }
}
