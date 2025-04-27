import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.BiConsumer;

public class DemoString {
  public static void main(String[] args) {
    // String -> Literal Pool  (數字有限數 -128 to 127 得256個位記數字，String object unlimitation)
    // ! In this case, we have one "hello" String object only
    String s = "hello";
    String s1 = "hello";
    System.out.println(s == s1);  // true

    String s2 = "hello1"; // different String -> new String object

    // so, at this moment, we got 2 String objects in memory (hello and hello1)
    // but we have 3 object references (s, s1 and s2) variable

    // Operations
    s = s + "world"; // s -> "helloworld"
    // s = new String("abc");  // s -> declare 'abc'    絕不可以❌ 重覆 declare in the string word 左手邊，但右手邊 new String, is OKAY.
    // so, at this moment, we got 3 String Objects in memory (hello, hello1, helloworld)
    // new String("world");   // this code is OKAY, even if no Address 孤兒仔，即下行 R23 打印，read 唔到，離開咗就找不回。

    s1 = s1 + "???"; // s1 -> "hello???"
    // so, at this moment, we got 3 String objects in memory (hello1, helloword, hello???)
    // "hello" object will be collected by JVM (Auto-GC)
    // see R7

    // ! Algorithm 算法 -> program Performance: runtime speed and memory usage
    // Official words -> Time Complexity and Space Complexity (same above meaning R29)
    // Space Complexity = RAM (Saving $) attention memory usage

    String s4 = new String("hello1");
    System.out.println(s2 == s4);  // false

    System.out.println(s1);  // hello???
    String s5 = "hello???";
    System.out.println(s1 == s5);  // false.  因為 s1要 "+" -> new String(), 用 for loop 要時間 runtime, 除非 RAM 夠行得快
    String s6 = "hello???";
    System.out.println(s5 == s6);  // true

    // ! CONCAT : it can be used to
    String s7 = "hello".concat("???");  // source code -> new String()
    System.out.println(s7 == s5);  // false

    String s8 = String.valueOf("hello???");   // 'valueOf' to visit pool first (Checking)
    System.out.println(s8 == s5);   // true

    String s9 = new String("hello???");  // Skip pool checking, direct create, 永遠都不會有相同 object 位置
    System.out.println(s8 == s9);   // fasle

    String s10 = new String("hello???").intern();  // another source code，create in 'String Pool' is not memory there.
    System.out.println(s5 == s10);   // true

    int[] arr = new int[3];  //  C Program, but here, In java, array is one of the most raw structure. 
    int x = 3; // Primitive is also the raw structure in Java.

    String s12 = "hellh";  // String is a source code. You can directly "Cmd" + Enter click "String" to check explanation
    System.out.println(s12.replace('h','x'));  // xellx      Using 'replace'(for Loop -> slow)

    String s13 = s12.substring(1); // ellh    由第一個位開始睇到最尾

    // replace() -> For Loop   s12.toCharArray(); 所以 substring() is a char array, 只抽取 extract 部分字串收改 快過 replace
    // s12.charAt(3);  s12.charAt(4)

    BigDecimal bd = BigDecimal.valueOf(1.0); // add, subtract, multiply, divide  先從功能上考慮，即 ＋,-,*,/,% 有冇其他取替到
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.2));  // 2.2    When execute completed, this create 1.2 object will be
    //                                                           disappear & replaced by result (2.2 object).
    System.out.println(bd == bd2);  // false

    LocalDate ld = LocalDate.of(2025, 4, 24);   // '0f' 有 return create 的意思
    LocalDate ld2 = LocalDate.of(2025, 4, 24);
    System.out.println(ld == ld2);   // false
    System.out.println(ld.equals(ld2));  // true, check values


  }
}
