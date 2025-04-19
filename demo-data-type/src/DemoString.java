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

    // String + int -> String (Step 1)
    // Assign String value to String variable (Step 2)
    String s3 = "hello" + 13;
    System.out.println(s3);   // hello13

    // String + boolean -> String
    s3 += s3 + true;
    System.out.println(s3);   // hello13hello13true   ('+=' 等如加2次)

    // equals() -> tools  （)內放參數
    // ! String Method 1: equals()
    // ! Primitive has no tools (value storage ONLY)
    // String is not a primitive. So String can store value and has tools. 
    //   It means that equals to excel "If..."
    String s4 = "hello";
    System.out.println(s4.equals("hello")); // ture, asking if s4 equals to "hello"
    System.out.println(s4.equals("male")); // false, asking if s4 equals to "male"

    System.out.println(1 + 1); //2
    int r2 = 1 + 1;

    boolean result = s4.equals("hello");
    System.out.println(result); // true

    System.out.println(s4.equals("hello")); // true, case same with above boolean, it's 快速版本

    // ! String Method 2: length ()
    // Reference = parameter 參數
    // length() has no parameters, ()沒有參數
    System.out.println(s4.length());  // 5  (Where house)
    System.out.println(s4); // hello

    // Ans:
    int s4Length = s4.length();
    System.out.println(s4Length); // 5

    // Try double
    double d1 = s4.length(); // ! why OK?
    // short s10 = s4.length(); // ! why NOT OK?


    // ! String Method 3: charAt()
    // 1 is an index, which always start with 0,1,2,3 to court ()words/figures
     System.out.println(s4.charAt(1)); // e    "Hello", 2 digial
     System.out.println(s4.charAt(0)); // h    "Hello", 1 digial
    
    
  }
}
