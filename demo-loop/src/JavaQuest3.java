public class JavaQuest3 {
  public static void main(String[] args) {
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");  // false, next
    } else if (a >= 0 && a < 9) {
      System.out.println("a is between 0 and 8"); // false, next
    // how about a > 9?
    } else if (a > 9){
      System.out.println("a is larger than 9");  // true, print and exit this loop
    } else {
      System.out.println("a < 0");
    }

    
    String str = "I love Java. I love coding";
    int strLength = str.length();
    System.out.println("No. of Words: " + strLength); // No. of Words: 26

    int strWord = strLength;
    if (strWord == 27) {
      System.out.println("str length = 27");   // false, next
    } else if (strWord < 27) { // code here ... add the condition
      System.out.println("str length < 27");   // true, print and exit
    } else if (strWord > 27) { // code here ... complete the code
      System.out.println("str length > 27");
    }


    }
  }

