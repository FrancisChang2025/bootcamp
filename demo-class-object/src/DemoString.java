import java.math.BigDecimal;
import java.time.LocalDate;

public class DemoString {
  public static void main(String[] args) {
    // String -> Literal Pool
    // ! In this case, we have one "hello" String object
    String s = "hello";
    String s1 = "hello";
    System.out.println(s == s1); // true
    String s2 = "hello1"; // different String -> new String object

    // so, at this moment, we got 2 String objects in memory (hello and hello1)
    // but we have 3 object references (s, s1 and s2)

    // Operations
    s = s + "world"; // s -> "helloworld"
    // so, at this moment, we got 3 String objects in memory (hello, hello1, helloworld)

    s1 = s1 + "???"; // s1 -> "hello???"
    // so, at this moment, we got 3 String objects in memory (hello1, helloworld, hello???)
    // "hello" object will be collected by JVM (Auto-GC)

    // Algorithm -> program (Performance: runtime speed and memory usage)
    // Time Complexity and Space Complexity

    String s4 = new String("hello1");
    System.out.println(s2 == s4); // false

    System.out.println(s1); // "hello???"
    String s5 = "hello???";
    System.out.println(s1 == s5); // false, "+" -> new String()
    String s6 = "hello???";
    System.out.println(s5 == s6); // true

    String s7 = "hello".concat("???"); // source code -> new String()
    System.out.println(s7 == s5); // false

    String s8 = String.valueOf("hello???");
    System.out.println(s8 == s5); // true

    String s9 = new String("hello???");
    System.out.println(s8 == s9); // false

    String s10 = new String("hello???").intern();
    System.out.println(s5 == s10); // true

    int[] arr = new int[3]; // In Java, array is one of the most raw structure.
    int x = 3; // Primitive is also the raw strucuture in Java.

    String s12 = "hellh"; 
    System.out.println(s12.replace('h', 'x')); // slow -> for loop
    String s13 = s12.substring(1); // ellh

    BigDecimal bd = BigDecimal.valueOf(1.0); // add, subtract, multiply, divide
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.2));
    System.out.println(bd == bd2); // false

    LocalDate ld = LocalDate.of(2025, 4, 24);
    LocalDate ld2 = LocalDate.of(2025, 4, 24);
    System.out.println(ld == ld2); // false
    System.out.println(ld.equals(ld2)); // true, check values

  }
}