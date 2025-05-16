import java.util.ArrayList;
import java.util.function.Consumer;

public class MathTest {
  public static void main(String[] args) {
    MathOperation addition = (x, y) -> x + y;
    System.out.println(addition.operate(7, 10)); // 17

    MathOperation subtraction = (x, y) -> x - y;
    System.out.println(subtraction.operate(20, 8));  // 12
    
    MathOperation multiplication = (x, y) -> x * y;
    System.out.println(multiplication.operate(20, 8));  // 160

    MathOperation division = (x, y) -> x / y;
    System.out.println(division.operate(5, 2));  // 2

    MathOperation rectangularArea = (length, width) -> length * width;
    System.out.println(rectangularArea.operate(3, 4));  // 12

    // ! "return" if you have more than 1 line of code
    MathOperation pythagorean = (a, b) -> {
      double result = Math.pow(a, 2.0) + Math.pow(b, 2.0);
      return (int) Math.sqrt(result);
    };
    System.out.println(pythagorean.operate(3, 4));  // 5

    // for - each
    ArrayList<Child> childs = new ArrayList<>();
    childs.add(new Child("John"));
    childs.add(new Child("Peter"));
    childs.add(new Child("Steven"));
    
    // ! for-each
    for (Child child : childs) {
      System.out.println("Child: " + child.getName());
    }
    // ! for-each lambda
    Consumer <Child> printName = child -> System.out.println("Child: " + child.getName());
    childs.forEach(printName);
  }
}
