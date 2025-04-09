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
    System.out.println(a1Length); //6


    System.out.println(a1.charAt(3)); // n is a 4 digit in "Orange"

    char threeChar = a1.charAt(3);
    System.out.println(threeChar); // n

    // char threeChar = a1.charAt(10);
    // System.out.println(threeChar); // Exception (System Error), 10 is over-value, space

    // Naming Convention - Java
    // Camel case
    String studentName = "John";
    System.out.println(studentName); // John
  }
}
