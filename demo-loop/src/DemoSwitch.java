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
    // switch (= if 的意思) 🚫 有以下 3點限制 limitation（要記常考）⭐️
    // 1. it can check one variable ONLY   (只能 checking 1個 varibale value eg. check value of x & y ❌) 
    // 2. equals to....  (> or < can't🙅‍♀️) (No range of value checking)
    // 3. you have to "break" the switch yourself (add default at the end to stop the Loop)

    x = 2;
    switch (x) {
      case 1:      // Code to execute if expression equals case value "1"
        System.out.println("hello");
        break;
      case 2:
        System.out.println("goodbye");
        break;
      case 3:
        System.out.println("bootcamp");
        break;
      default:    // 👈🏻 equals to 'else', case unlimit, you must add 'default' the end to stop Loop
        System.out.println("other cases...");  // Code to execute if expression doesn't match any case
    }
      // Ans: goodbye, bootcamp & other cases....  
      // 因為上面曾經講過 x=3, x=2, 冇講 x=1, 所以答案沒有出 "hello",只出 case 2 & case 3 without "break;"
      // 至於 default result 包尾，JAVA 一定都會出埋。  x 可能有21位 cases，寫不完，所以 this to stop Loop.
      // Add break at the end of each case, to prevent fall-through 防止山泥傾瀉 😂

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
      default:   // 👈 meaning same with 'else', next row can empty. but must add 'default' words here.
    }
    System.out.println(value);  // 9  👈🏻 每個case 都冇breaks，會發生山泥傾潟 fall through，不斷 Loop 👉 Value = 3 * 3 

    int result = 0;
    int base = 3;
    int exponent = 4;  // 👈 using thiss variable to test the result
    switch (exponent) {
      case 2:
        result = base * base;  // 3^2 = 9
      case 3:
        result = result * base;  // 9 * 3 = 27 (fall-through 跳過)
      case 4:
        result = result * base;// 27 * 3 = 81 (final result, if above case omitted 'break;' when exponent is 3, output=0)
        break; // if this were omitted, it would fall through to the next case 若省略此處，則會跳轉到下一個案例
      default:
    }
    System.out.println(result);  // 0

    // !  SWITCH + BREAK + DEFAULT (正確寫法)
    int resultA;
    int baseA = 3;
    int exponentA = 4;
    // 3^4
    switch (exponent) {
    case 0:
        resultA = 1; // 3^0 = 1
        break;
    case 1:
        resultA = base; // 3^1 = 3
        break;
    case 2:
        resultA = base * base; // 3^2 = 9
        break;
    case 3:
        resultA = base * base * base; // 3^3 = 27
        break;
    case 4:
        resultA = base * base * base * base; // 3^4 = 81
        break; // No fall-through here
    default:
        resultA = 0; // Handle unexpected cases
    }
    System.out.println(resultA);  //81 👈 if no 'break;' in each case, Output=0

    Double resultB = Math.pow(3, 4);   // (baseA, exponentA)
    System.out.println("Method 2: resultB=" + resultB);  // Method 2: resultB=81.0
  }
}
