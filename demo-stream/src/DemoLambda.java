import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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
    // BiFunction
    BiFunction<String, String, String> concatOperation = (s1, s2) -> s1.concat(s2);
    System.out.println(concatOperation.apply("hello", "world"));  // helloword

    // !
    Predicate<Integer> elderlyFormula = age -> age > 65;  // formula
    System.out.println(elderlyFormula.test(60));  // false
    System.out.println(elderlyFormula.test(85));  // true
    System.out.println(elderlyFormula.test(65));  // false

    BiPredicate<String, ArrayList<String>> containString = (targetName, nameList) -> {
      return nameList.contains(targetName);
    };

    // ! 有入冇出
    // Consumer
    Consumer<Cat> catConsumer = (cat) -> {
      cat.eat();
      cat.sleep();
      System.out.println("hello");
    };

    // ! 冇入有出
    // Supplier       Example : Random to draws marksix
    Supplier<Integer> marksixNumber = () -> {
      return new Random().nextInt(49) + 1;  // 1 = 49
    };
    System.out.println(marksixNumber.get());
    System.out.println(marksixNumber.get());
    System.out.println(marksixNumber.get());

    // ! 兩入冇出
   BiConsumer<Integer, Integer> additional = (a, b) -> {
    System.out.println(a);  // 3
    System.out.println(b);  // 7
    System.out.println(a + b);  // 10
    System.out.println(a * b);  // 21
    System.out.println("hello");  // hello
   };
   additional.accept(3, 7);  

  // Unary Operator
  Function<String, String> stringFunction1 = s -> s + "hello";
  System.out.println(stringFunction1.apply("vincent")); // vincenthello

  // ! 一入一出 (相同出入type)
  UnaryOperator<String> stringFuntion2 = s -> s + "hello";
  System.out.println(stringFuntion2.apply("lucas"));  //lucashello

  // ! 兩入一出 (相同出入type)
  BinaryOperator<String> stringFunction3 = (s1, s2) -> s1 + s2; // BiFunction<String, String, String>
  System.out.println(stringFunction3.apply("abc", "def"));  // abcdef
  }

  // ! Shared to other class
  // DemoLambda.generateMarksix()
  public static Integer generateMarksix() {
    return new Random().nextInt(49) + 1;
  }

  // Procedure
  public static void eat(Cat cat) {
    cat.eat();
    cat.sleep();
  }
}
