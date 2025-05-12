public class Calculator {
  private int x;
  private int y;
  

  // instance method sum2
  public static int Sum2() {
    return this.x + this.y;
  }





  public static int sum(int x, int y) {
    return x + y;
  }

  public static double bmi(double height, double weight) {
    return -1;
  }

  public void setY(int y) {
    this.y = y;
  }


  public static void main(String[] args) {
    Calculator.bmi(1.76, 78);

    // System.out.println(Calculator.sum(3, 7));   // 10
    // System.out.println(Calculator.sum(3, 10));   // 13

    Calculator c1 = new Calculator(3,7);

    
}
