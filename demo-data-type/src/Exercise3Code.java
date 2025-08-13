public class Exercise3Code {
  public static void main(String[] aStrings) {
    // equals()
    // length()
    // charAt()

    String a1 = "Orange";
    System.out.println(a1.equals("Orange")); // ture

    boolean result = a1.equals("Orange");
    System.out.println(result); // ture


    int a1Length = a1.length();
    System.out.println(a1Length); // 6


    System.out.println(a1.charAt(3)); // n is a 4 digit in "Orange"

    char threeChar = a1.charAt(3);
    System.out.println(threeChar); // n

    // char threeChar = a1.charAt(10);
    // System.out.println(threeChar); // 💥Exception (System Error), 10 is over-value, space 爆炸

    // ! Naming Convention - Java 名明方式，唔用 underscore, 用這證明唔專業 😛
    // Camel case
    String studentName = "John";
    System.out.println(studentName); // John

    // Exercise:
    String s1 = "Java";
    // equals()
    System.out.println(s1.equals("Java")); // true
    System.out.println(s1.equals("java")); // false
    boolean result1 = s1.equals("Python"); // false
    System.out.println(result1);
    // length()
    System.out.println(s1.length()); // 4
    int s1Length = s1.length();
    System.out.println(s1Length); // 4
    // charAt()
    System.out.println(s1.charAt(0)); // J
    char firstChar = s1.charAt(0);
    System.out.println(firstChar); // J

    System.out.println(s1.charAt(1)); //a 
  }
}
