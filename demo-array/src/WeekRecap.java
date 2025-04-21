public class WeekRecap {
  public static void main(String[] args) {
    // Data Type: Primitives 基本資料型態
    byte b1 = -128;
    byte b2 = 127;
    // byte b3 = 128;

    // short s1 = 33000;
    short s2 = 32000;
    short s3 = -32000;

    int i1 = 2_100_000_000;
    int i2 = -2_100_000_000;

    // int to long (auto-convert)
    long l1 = 10L;

    //
    float f1 = 3.3f;
    double d1 = 1.9;

    char c1 = 'a';
    // int - int      (死記 char -> store character 儲存字元, auto-convert to int - int)
    System.out.println('a' - 'a'); // 0
    System.out.println('a' - 'b'); // -1

     // ! 🥸 用 boolean 去定義咗字眼，如 isEldery 是老人，以後用這字就定義為老人, 不用再 age >= 65)
    boolean isEldery = false;  
    // isEldery -> formula / definition
    int age = 65;
    isEldery = age >= 65;

    if (!isEldery) {     // 不是長者，即 < 65
      System.out.println("I am not an elderly.");
    }
    if (age < 65) {
      System.out.println("I am not an elderly.");
    }

    int b = 3;
    boolean result = b > 1 || b > 10;
    boolean result2 = true || false;

    System.out.println(result2);  // true
    System.out.println(true && false); // false

    // true && true
    // true && false -> false
    // true || false -> true

    // +, -, *, /, %
    int x = 10;
    boolean isOdd = x % 2 == 1;

    int a = 0;
    a++;
    ++a;
    System.out.println(a++); // 2
    System.out.println(a); // 3
    a += 2;
    a = a + 3;

    // System.out.println(10 / 0); // system error
    System.out.println(0 / 3); // 0
    System.out.println(10 / 3); // 3

    System.out.println(10.0 / 3.0); // 3.3333333333333335

    // if, else if, else
    int y = 4;
    int u = 3;
    if (y > 2 && u < 1) {

    } else if (y > 2 && u >= 1) {

    } else if (y <= 2 && u < 1) {

    } else { // y <= 2 && u >= 1

    }

    if (y > 8) {
      System.out.println("Java");
    } else if (y > 1 && y <= 8) {
      System.out.println("Python");
    } else if (y > -3 && y <= 1) {
      System.out.println("Javascript");
    } else if (y <= -3) {
      System.out.println("C++");
    }

    int o = 9;
    // 1. == (cannot check range of values)
    // 2. break;
    switch (o) {
      case 1:
        System.out.println("do something 1 ...");
        break;
      case 2:
        System.out.println("do something 2 ...");
        break;
      default:
        System.out.println("something else ...");
    }

    // loop, repeat to do something in x times
    //
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }

    // we can leverage i to do something (i.e. charAt)
    String s = "hello";
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }

    int count = 0;
    while (count < 3) {
      System.out.println("hello");
      count++;
    }

    count = 0;
    do {
      System.out.println("bye");
      count++;
    } while (count < 3);

    // equals
    String w = "Java";
    if (w.equals("Java")) {
      System.out.println("it is Java");
    }

    // ! case sensitive
    if (w.equals("java")) {
      System.out.println("it is java"); // not print
    }

    // ! Preferable
    if ("Java".equals(w)) {
      System.out.println("it is Java");
    }

    // length()
    System.out.println(w.length()); // 4
    System.out.println("Java".length()); // 4

    // charAt()
    System.out.println(w.charAt(0)); // J
    System.out.println("Java".charAt(0)); // J

    // System.out.println("Java".charAt(-1)); // system error
    // System.out.println(w.charAt(w.length())); // system error
    System.out.println(w.charAt(w.length() - 1)); // a

    // for + if
    String s4 = "Goodbye";
    // Count the number of a-z (97+25)
    // ! When you perform +,-,*,/ or comparison, Java will convert char to int.
    int counter = 0;
    for (int i = 0; i < s4.length(); i++) {
      if (s4.charAt(i) >= 97 && s4.charAt(i) <= 122) {
        counter++;
      }
    }
    System.out.println("counter=" + counter);
  }
}
