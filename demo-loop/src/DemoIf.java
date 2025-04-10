public class DemoIf {
  public static void main(String[] args) {
    // ! if, else if, else 組合
    int x = 9;  // value should be change

    // 1. if + else if + else
    if (x < 10){
      System.out.println("x < 10");  // ! print

    } else if (x < 15) {
      System.out.println("x < 15");  // not print      

    } else if (x >= 20) {
      System.out.println("x >= 20");  // not print

    } else {  // 10 - 19
      System.out.println("10 - 91");  // not print

    }

    // 2. if

    // 3. if + else

    // 4. if + else if    (Sample: different type 'hello or Hello', ans accept)
    String s = "hello";
    if (s.equals("hello")) {
      System.out.println("this is hello");

    } else if (s.equals("Hello")) {
      System.out.println("this is hello");

    } // else   <- in this, if add 'else',this else is very important to change result


  }
}
