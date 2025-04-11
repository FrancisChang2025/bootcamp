public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x);  // 5

    x = ++x + 1;  // 6 + 1  
    System.out.println(x);  // 7

    // !!!
    x = x++ + 1;    // 7 + 1 , x myself +1 first
    System.out.println(x);  // 8

    int y = 2;
    x = ++y + 1;
    System.out.println(x);  // 4  (1+2+1)
    System.out.println(y);  // 3  (2+1)

    x = y++ + 1;
    System.out.println(x);  // 4  (3+1)
    System.out.println(y);  // 4  (3+1)

    int k =0;
    while (k++ < 3){    // printout 3 times
      System.out.println("hello");
    }

    
    y = 8;
    x = ++y + ++y + 2;    // 9+10+2
    // Step1: first ++y -> 9
    // Step2: second ++y -> 10
    // Step3: 9 + 10 + 2
    System.out.println(x);  // 21
    System.out.println(y);  // 10

    y = 8;  // reset
    x = y++ + y++ + 2;
    // Step1: first y++ -> 8
    // Step2: second y++ -> 9
    // Step3: 8 + 9 + 2
    System.out.println(x);  // 19
    System.out.println(y);  // 10



  }
}
