import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    System.out.println(0.1 + 0.2);  // 0.30000000000004  
    // ! 運算 +, -, *, /

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
    // BigDecimal divide BigDecimal
    // BigDecimal three = BigDeciaml.valueOf(3.0);

    // ! Not-terminating deciaml expansion
    // BigDecimal bd7 = BigDecimal.valueOf(10.0).divide(3.0);  // Error
    BigDecimal bd7 = BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_UP);
    System.out.println(bd7);  // 3.33  '2個小數位，一定要放整數，不能是小數位'

    // 8.5 / 2 -> 4.25 (half up) -> 4.3
    BigDecimal bd9 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_UP);
    System.out.println(bd9);    // 4.3

    // 8.5 / 2 -> 4.25 (half down) -> 4.2
    BigDecimal bd10 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_DOWN);
    System.out.println(bd10);    // 4.2
    
    BigDecimal bd11 = new BigDecimal("5").divide(BigDecimal.valueOf(2));
    System.out.println(bd11);    // 2.5

    // BigDecimal bd8 = new BigDecimal("10.0").divide(BigDecimal.valueOf(3.0));

    System.out.println(BigDecimal.valueOf(-2).abs());  // 2
    System.out.println(BigDecimal.valueOf(2).pow(3));   // 8
    // double result = BigDecimal.valueOf(2).doubleValue();
    BigDecimal source = BigDecimal.valueOf(2);
    double result1 = source.doubleValue();
    long result2 = source.longValue();
    int result3 = source.intValue();
    float result4 = source.floatValue();  //  float -> double 
    String result5 = source.toString();   // "2"
    System.out.println(source);  // 2


    String lan = "Java";
    System.out.println("Java".equals(lan)); // true


  }
}
