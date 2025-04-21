public class DemoSwitch {
  public static void main(String[] args) {
    // if -> control the range of values
    int x = 3;
    if (x > 1 && x < 5) {
      System.out.println(x);  // 3
    }
    if (x == 3) {
      System.out.println(x);  // 3
    }

    // ! switch + default
    // switch  🚫 有以下 3點限制 （要記常考）⭐️
    // 1. it can check one variable ONLY   (只能 checking 1個 varibale value) 
    // 2. equals to....  (> or < can't🙅‍♀️) (No range of value checking)
    // 3. you have to "break" the switch yourself (add default at the end to stop the Loop)

    x = 2;
    switch (x) {
      case 1:
      System.out.println("hello");
      case 2:
      System.out.println("goodbye");
      case 3:
      System.out.println("bootcamp");
      default:    // 👈🏻 equals to 'else', case unlimit, you must add 'default' the end to stop Loop
      System.out.println("other cases...");
    }
      // Ans: goodbye, bootcamp & other cases....  
      // 因為上面曾經講過 x=3, x=2, 冇講 x=1, 所以答案沒有出 "hello",只出 case 2 & case 3
      // 至於 default result 包尾，JAVA 一定都會出埋



    int value = 3;
    x = 4;
    // no break 唔準用,且要做到 3^4
    switch (x) {
      case 1:
      value = value * 3;
      case 2:
      value = value * 3;
      case 3:
      value = value * 3;
      case 4:
      value = value * 3;
      default:
    }
    System.out.println(value);  // 9  👈🏻 每個case 都冇breaks，會發生山泥傾潟，不斷 Loop 👉 Value = 3 * 3 



  }
}
