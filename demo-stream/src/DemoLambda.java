import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoLambda {
  public static void main(String[] args) {
    // Function f(x) = y
    // y = x + 1

    // 有入有出 （一入一出）
    // Function<in type, out type>
    Function<Integer, Integer> y = x -> x + 1;  // formula
    System.out.println(y.apply(10));   // 11

    int numX = 10;
    int numY = numX + 1;
    //Function<Integer, Integer> numY = numX -> numX + 1;
    //System.out.println(numY.apply(10));  // 11

    Function<Integer, Integer> discount19PercentOff = amount -> (int) (amount * 0.9); // formula
    System.out.println(discount19PercentOff.apply(10));  // 9

    Function<Integer, Double> circleArea = radius -> Math.pow(radius, 2.0) * Math.PI;
    System.out.println(circleArea.apply(3));  // ~28.27

    Function<String, String> cleanName = name -> name.trim().toUpperCase();
    System.out.println(cleanName.apply("Vincent Lau..."));  // "VINCENT LAU"

    // ! Lambda expression focus on the method implementation only.
    // ! The object created by lambda cannot hold attributes

    // 兩入一出
    BiFunction<String, String, String> concatOperation = (s1, s2) -> s1.concat(s2);
    System.out.println(concatOperation.apply("hello", "world"));  // helloword

    Predicate<Integer> elderlyFormula = age -> age > 65;
    System.out.println(elderlyFormula.test(60));  // false
    System.out.println(elderlyFormula.test(85));  // true
    

  }
}
