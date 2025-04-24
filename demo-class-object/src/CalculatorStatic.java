public class CalculatorStatic {
  
  // ! Static method (input -> output)   與 object 冇關，用 new 才有 object
  public static int sum(int x, int y) {
    // int + int -> int
    return x + y;  // x + y + z or x + y + this.age  Use 'static', Can't no object 
  }


  public static void main(String[] args) {
    // Static method
    int result = CalculatorStatic.sum(1, 2);
    System.out.println(result);  // 3

  }

}
