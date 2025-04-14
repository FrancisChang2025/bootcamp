import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    System.out.println(0.1 + 0.2);  // 0.30000000000004  // 運算+,-,*,/

    // Solution
    BigDecimal bd1 = new BigDecimal("0.1");   // 0.1 -> approach 1
    BigDecimal bd2 = BigDecimal.valueOf(0.2);   // 0.2 -> approach 2 (prefer use this)

    System.out.println(bd1);
    System.out.println(bd2);

    // bd1 + bd2 -> 0.3
    // ! add()
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3);   // 0.3
    System.out.println(bd1);   // 0.1
    System.out.println(bd2);   // 0.2

    // ! subtract()
    BigDecimal bd4 = bd3.subtract(bd1);
    System.out.println(bd4);  // 0.2  (0.3 - 0.1)

    // ! multiply()
    BigDecimal bd5 = bd2.multiply(bd3);
    System.out.println(bd5);  // 0.06   (0.2 * 0.3)

    //! divide()
    BigDecimal bd6 = bd5.divide(bd2);
    System.out.println(bd6); // 0.3   (0.06 / 0.2)

    // 10 / 3
    // rounding? 3.45 -> 3.4 (HALF_DOWN)?  3.45 -> 3.5 (HALF_UP) 四捨五一?


  }
}
