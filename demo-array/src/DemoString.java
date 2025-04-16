public class DemoString {
  public static void main(String[] args) {
    // Week 1: equals(), length(), charAt()
    // Week 2: Other String methods
    // 1. replace()
    System.out.println("bootcamp".replace('o', 'x'));  // bxxtcamp
    System.out.println("bootcamoop".replace("oo", "lll"));  // blllcamlllp

    // 2. indexOf()
    System.out.println("hello".indexOf('o'));  // 4
    System.out.println("hello".indexOf('a'));  // -1  (nothing or space is false)
    System.out.println("hello".indexOf(' '));  // -1

    // 3. concat()
    String s1 = "hello" + "world";
    System.out.println(s1);  // helloworld

        // ! "+" -> slow performance
        String s2 = "hello".concat("world");
        System.out.println(s2);  // helloworld
    
    // 4. lastIndexOf()
    System.out.println("hello".indexOf('l'));  // 2  (2. indexOf() -> firstIndexOf)

    System.out.println("hello".lastIndexOf('l'));  // 3
    System.out.println("hello world".lastIndexOf('l'));  // 9

    // 5. isEmpty()
    boolean result = "".isEmpty();
    System.out.println(result); // ture
    System.out.println("hello".isEmpty());  // false

    // 6. trim()  前後空格 cut 走，不計
    System.out.println(" hello world !!! ".trim());  // hello world !!!
    System.out.println(" hello world !!! ".trim().length());  // 15

    // Coding style: chain methods
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1));  // a
    System.out.println("hello".replace('L', 'x'));  //  hello  (Not error, can't execute)

    // String methods return different types

    // 7. substring
    // ! end index - 1:
    // ! 'e' -> index 1, 'l' -> index 2  (3-1)
    System.out.println("hello".substring(1, 3));   // el
    System.out.println("hello".substring(0));   // hello   (from index 0, to the end of string)


    String unknown = "hello world";
    // extract the second & third characters
    // if the string not long enough, print out, extract as much as possible

    System.out.println("h".substring(0, 1));

    // h -> ""     第一類 group 1
    // he -> e        第二類 group 2  (1,2)
    // hell -> el          第三類 normal group (1,3)
    // hello world -> el   第三類 normal group  (1,3)
    int startIndex = 1;
    int endIndex = 2;
    if (unknown.length() < 2) {
      // re-assign startIndex and endIndex
      startIndex = 1;
      endIndex = 0;
    } else if (unknown.length() == 2) {
      endIndex = 1;
    } // else {   // normal case
      // startIndex = 1;
      // endIndex = 2;
    // }
    System.out.println(unknown.substring(startIndex, endIndex + 1)); // el


    // 8. toLowerCase(), to ()
    System.out.println("HELLO!!!".toLowerCase());   // hello!!!
    System.out.println("hello!!!".toLowerCase());   // hello!!!
    System.out.println("hello!!!".toUpperCase());   // HELLO!!!
    System.out.println("HELLO!!!".toUpperCase());   // HELLO!!!

    // 9. contains()
    System.out.println("hello".contains("ll"));   // true
    System.out.println("hello".contains("lll"));   // false
    
    String name = "Steven";
    if (name.contains("t")){
      System.out.println("Your name contains t character"); //Your。。。。。。character
    }  

    System.out.println("陳大明".contains("陳"));   // true
    System.out.println("陳大明".contains("小"));   // false


    // 10. startsWith(), endsWith()
    System.out.println("hello".startsWith("he"));   // true
    System.out.println("hello".startsWith("helll"));   // false
    System.out.println("hello".endsWith("lo"));   // true
    System.out.println("hello".endsWith("oo"));   // false


    // Check if the String value is Palindromic 對稱
    // e.g. madam 左右對稱
    // ada
    // abcba
    // abccba
    String s = "apple"; //  true
    int right = 0;
    int left = s.length();
    System.out.println(left);
    for (int i = 0; i < s.length() - 1; i++) {
      if (right != left && s.charAt(right) == s.charAt(left)) {
        right++;
        left++;
        break;
      } 
    }
    System.out.println(s + " is a Palindromic");
    




  }
}
