public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // string is not a primitive
    String s1 = "Hello"; // (Not bindling long words)
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // "100100"
    s1 = s1 + "100";
    System.out.println(s1); // "Hello100"

    String t1 = "$";
    String t2 = "200";
    t1 = t1 + t2;
    System.out.println(t1); // "$200"

    String t3 = "$";
    String t4 = "1000.01";
    t4 = t1 + t4;
    System.out.println(t4); // "$2001000.01"

    // String + int
    
    
  }
}
