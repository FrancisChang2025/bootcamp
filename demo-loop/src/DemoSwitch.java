public class DemoSwitch {
  public static void main(String[] args) {
    // if -> control the range of values
    int x = 3;
    if (x > 1 && x < 5) {
      System.out.println(x);
    }
    if (x == 3) {
      System.out.println(x);
    }

    // ! switch + default
    // switch
    // 1. it can check one variable ONLY
    // 2. euals to....  (> or < can't) (No range of value checking)
    // 3. you have to "break" the switch yourself (add default at the end)

    x = 2;
    switch (x) {
      case 1:
      System.out.println("hello");
      case 2:
      System.out.println("goodbye");
      case 3:
      System.out.println("bootcamp");
      default:
      System.out.println("other cases...");
    }

    int value = 3;
    x = 4;
    // no break, 3^4
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
    System.out.println(value);



  }
}
