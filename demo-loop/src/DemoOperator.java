public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);  // 4
    ++x;
    System.out.println(x);  // 5

    x = ++x + 1;   // 前置++  未進行運算之前，先加咗'1'先，即 5＋1＝6， 後再加'1' ＝ 7 
    System.out.println(x);  // 7  (6 + 1)

    // !!!
    x = x++ + 1;   // 後置++  不用理會，當看不見，跟平時一樣運算便可。
    System.out.println(x);  // 8  (7 + 1 , x myself +1 first)

    int y = 2;
    x = ++y + 1;
    System.out.println(x);  // 4  (3+1)
    System.out.println(y);  // 3  (2+1)

    x = y++ + 1;
    System.out.println(x);  // 4  (3+1)
    System.out.println(y);  // 4  (3+1)

    int k = 0;
    while (k++ < 3){    // printout "hello" 3 times
      System.out.println("hello");
    }
    // * While -> same with "For...Loop", Auto-Run until "while loop" completed to STOP.
    // Round 1: k=0 後置++ 不用理會，所以 Index = 0
    // Round 2: k=1 (0+1)
    // Round 3: k=2 (1+1)
    
    y = 8;
    x = ++y + ++y + 2;    // 21  (9+10+2)
    // Step1: first ++y -> 9
    // Step2: second ++y -> 10
    // Step3: 9 + 10 + 2
    System.out.println(x);  // 21
    System.out.println(y);  // 10

    y = 8;  // reset
    x = y++ + y++ + 2;
    // Step1: first y++ -> 8
    // Step2: second y++ -> 9  第2個需要把前數先處理咗先，再用前數進行處理如果有關係，自己加'1' 👉 後 y++ (8+1)
    // Step3: 8 + 9 + 2
    System.out.println(x);  // 19
    System.out.println(y);  // 10



  }
}
