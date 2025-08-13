public class DemoPrimitive {
  public static void main(String [] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, char)
    // 8 primitives in total for Java
    
    // Primtives for Integer (byte, short, int, long)
    int x = 10;
    
    // range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;
    // byte b4 = 128;
    System.out.println(b1); // 10

    // -32xxx to 32xxx
    // View notes table
    short s1 = 10;
    short s2 = -32768;
    short s3 = 32767;
    System.out.println(s2); // -32768

    // int (2.1b)
    int x1 = 1_1000_1000;
    int x2 = 10;
    // int x3 = -2147483648;
    int x3 = -21474648;
    System.out.println(x1);  // 110001000

    // long
    // 10 is an int value
    // Assign int value to long value (NOT OK)
    // ! -2147483649  -> illegal int value
    // ! -2147483649L -> long value (See right hand side)

    long l1 = 10;
    long l2 = -2147483649L;
    System.out.println(l2);  // -2147483649

    // long + int -> long
    l1 = l1 + 100;
    System.out.println(l1); // 110

    x3 = x3 + 1;
    System.out.println(x3); // -2147483648 (overflow)
    x2 = x2 - 1;
    System.out.println(x2); // 2147483647 (overflow)

    // b3 + 1
    // 1. byte + int -> int
    // 2. Assign int to byte variable
    // b3 = b3 + 1; (// can't byte < int, must actually 100% correct)
    
    int i9 = 1;
    // b3 = b3 + i9;
    
    // Stong to excutive int to byte
    b3 = (byte) (b3 + i9); // force assignment
    System.out.println(b3); // -128 (overflow)

    int i10 = 1;
    byte b4 = 1;
    // byte + int -> int
    // assign int to byte (Java: unsafe -> not allow for assignment)
    b4 = (byte) (b4 + i10);
    System.out.println(b4); // 2

    // double, float
    // ! 9.5 is a double value
    // ! 9.5d is a double value
    // ! 9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5d;
    float f1 = 9.5f;
    float f3 = (float) d1; // detals -> simple of the value, using (float) xxx; 

    // ! the type double is more precise than float.
    // float f2 = 9.5;

    float f4 = 0.3f - 0.1f;
    System.out.println(f4); // 0.2......2 (Sample proble with Double)


    // boolean
    boolean b10 = true;
    b10 = false;
    System.out.println(b10);  // false

    int age = 66;
    // "age > 65" -> comparison
    boolean isEldery = age > 65; // "is something isElxxx"
    System.out.println(isEldery); // true

    // char
    // Store single character
    // 'a' -> char value
    // c1 -> char variable
    char c1 = 'a';
    int a = 5;
    System.out.println(a);  // 5
    System.out.println(c1);  // a

    char c2 = '#';
    System.out.println(c2);  // #
    char c3 = 'a';
    System.out.println(c3);  // a
    char c4 = '2';
    System.out.println(c4);  // 2
    char c5 = 'A';
    System.out.println(c5);  // A

  }
}
