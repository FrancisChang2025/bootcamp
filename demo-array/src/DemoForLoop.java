import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // ! find max
    int[] arr = new int[] {100, -20, 200, 17};
    
    // Approach 1
    int max = Integer.MIN_VALUE;  
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("max=" + max);  // 200

    // Approach 2  (Difference the above R11 & R12 = below R21)
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(arr[i], max);
      }
    System.out.println(max);  // 200


    // ! Summary
    // equals(), length(), charAt()

    //
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs));  // [h, e, l, l, o]

    // ! convert l to x  and a to b (Prefer use this, not suggest use 'replace' -> R46)
    // hello -> hexxo
    for (int i = 0; i < chs.length; i++){
      if (chs[i] == 'l') {
        chs[i] = 'x';
      } else if (chs[i] == 'a') {  // if a -> b, add 'else if' continue here add code
        chs[i] = 'b';
      }
    }
    System.out.println(Arrays.toString(chs));  // "hello" -> "h, e, x, x, o"

    // covert form char[] to String
    System.out.println(String.valueOf(chs));   // "hexxo"

    System.out.println("hello".replace('l', 'x'));  // "hexxo"


    // ! equalsIgnoreCase()  不理會大小楷都 accept, 串錯字 don't accept
    System.out.println("hello".equals("Hello"));   // fasle
    System.out.println("hello".equalsIgnoreCase("Hello"));   // true
    System.out.println("hello".equalsIgnoreCase("Hexlo"));   // fasle


    double[] values = new double[] {0.2, 0.5, 1.9};

    // each add 0.1
    // Ans should be arrays -> [0.3, 0.6, 2.0]
    for (int i = 0; i < values.length; i++) {
        values[i] = BigDecimal.valueOf(values[i])  //
          .add(BigDecimal.valueOf(0.1))  //
          .doubleValue();
    }
    // ! 'Arrays.toString' means that Answer show arrays value in String 變成字串列出
    System.out.println(Arrays.toString(values));  // [0.3, 0.6, 2.0]


    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(10.3);
    bigDecimals[1] = BigDecimal.valueOf(2.4);  // or -> bigDecimals[1] = new BigDeciimal("2.4");
    bigDecimals[2] = BigDecimal.valueOf(9.9);

    System.out.println(Arrays.toString(bigDecimals));  // [10.3, 2.4, 9.9]


    float[] fArr = new float[bigDecimals.length];
        // for loop: bigDecimals -> fArr     to show Arrays value -> [10.3, 2.4, 9.9]
        for (int i = 0; i < bigDecimals.length; i++){   // 小心字串，名稱，功能字眼，通常有's'尾都加，就是Arrays名稱
          fArr[i] = bigDecimals[i].floatValue(); 
        }
        System.out.println(Arrays.toString(fArr));  // [10.3, 2.4, 9.9]




  }
}