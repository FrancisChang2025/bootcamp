public class DemoConverison {
  public static void main(String[] args) {
    // ! Checking Safe or Unsafe !!!
    
    int x = 3;
    // because it is safe conversion, so JAVA helps auto-convert
    long l = x;
    System.out.println(l);  // 3

    // because it is safe conversion, so JAVA helps auto-convert
    double d1 = 0.3f;
    System.out.println(d1);   // 0.30000001192092896 (floating point ....)

    // ! NOT OK, byte input to 'x', it is variable of int, unsafe conversion, JAVA Reject auto-convert
    // byte b1 = x;  -> Not work.
    // byte b1 = 3;   -> OK in JAVA accept.
    byte b1 = (byte) x;   // may cause overflow

    // ! 1. Implicit conversion (= Auto conversion) Below is Formula
    // ! byte -> short -> int -> long -> float -> doublt
    // ! char -> int  (char 最少為0，所以不會有negative)
    double d2 = 3L;
    System.out.println(d2);   // 3.0

    float f2 = 4L;
    System.out.println(f2);    // 4.0


    int asciiOfa = 'a';
    System.out.println(asciiOfa);  // 97
    // 0, A, a
    int asciiOfA = 'A';
    System.out.println(asciiOfA);  // 65
    int asciiOf0 = '0';
    System.out.println(asciiOf0);  // 48

    // ! 2. Explicit Conversion.
    int x2 = 8;   // 40000 就會出事，未出事至 run 才知
    short s2 = (short) x2;

    // ! 3. autobox, unbox (Wrapper class)
    int x3 = Integer.valueOf(9);  // unbox
    Integer x4 = x3;  // autobox




  }
}
