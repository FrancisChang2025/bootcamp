public class Calculator {
  private int age;

  public Calculator(int age) {
    this.age = age;
  } 
  
  // ! Instance method (Input & self variable -> output) 有 object
  public int sum(int x, int y) {
    // int + int -> int
    return x + y + this.age;    // 除了運算外，還會去自己或指定 object 睇埋觀察埋裡面啲嘢
  }

  // ! Static Method (Input -> output)  沒有 object  (通常這地方形容成 Library / Pantry, 大眾可使用）
  // ! Not able to access Instance variable
  public static int sum2(int x, int y) {   // 開一個名 calculator 去呼喚 sum2,sum2 is 運算object工具
    return x + y;    // before return, must checking type 'int', else will be error
  }

  public static void print(String str) {
    System.out.println("The String is " + str);
  }

  public static void main(String[] args) {
    // Static method
    Calculator c1 = new Calculator(65);  // Calculator 冇生命 只是1個名，c1 是 object 可以運算
    int result = c1.sum(1, 2);    // object.sum  -> run R11 -> myself 65 + (1 + 2)
    System.out.println(result); // 68
    System.out.println(Calculator.sum2(1, 2)); // 3

    Calculator.print("hello"); // The String is hello   👉 Go to R20

  }
}

