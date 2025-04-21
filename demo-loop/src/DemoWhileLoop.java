public class DemoWhileLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x);  // 16

    // For Loop (init, continue condition, modifier)
    // ! While Loop (continue condition)   工能跟 For Loop 一樣，再簡單啲，只考慮中間條件
    int k = 0;
    while (k < 3) {
      System.out.println("hello");   //  Index = 0,1,2  (Run 3 times of 'hello')
      k++;
    }
    // Step 1: 
    // Step 2:


    // Do while Loop 'upgrade ver.'  (Detail week 2 to learning)
    // ! No entry condition (At least execute once) 至少 run 一次 programme
    k = 0;
    do {
      System.out.println("hello 喂");   // 0,1,2 (Run 3 times of 'hello 喂')
      k++;
    } while (k < 3);
  }
}
