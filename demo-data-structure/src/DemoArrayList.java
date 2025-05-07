import java.time.LocalDate;
import java.util.ArrayList;

public class DemoArrayList {
  
  public static void main(String[] args) throws Exception {
    // Store a set of Integer
    int[] arr = new int[] {4, -10, 100, 55};
    // ! int[] cannot store non-int values

    // Auto-box
    // long -> Long (Number)
    // byte -> Byte (Number)
    Number[] numbers = new Number[] {3L, (byte) 5};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    Object[] objects = new Object[]{new Cat("Peter"), 4L, (byte) 10 };

    // ! Disadvantages of int[]
    // 1. fixed length

    // Array is the most underlying data structure 最底層
    // ArrayList is a higher level data structure for storing a set of values
      // For user, you doesn't even know it is made by array
    
    // ! Advantage of ArrayList
    // 1. variale length
    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(10); // auto-box from int to Integer
    integers.add(100);
    integers.add(-3);
    System.out.println(integers.size());  //3

    // add() vs size()
    // add() -> new array process, copy array
    // size() -> array length,  not For Loop, directly to view .length

    // ArrayList of LocalDate
    LocalDate[] dates = new LocalDate[3];
    
    ArrayList<LocalDate> dates2 = new ArrayList<LocalDate>();
    dates2.add(LocalDate.of(2014, 1, 1));
    dates2.add(LocalDate.of(2025, 10, 1));
    System.out.println(dates2.size());  // 2

    // ! remove()
      // 1. for loop
      // 2. use LocalDate's equals  作者的諗法，決定咗 equals 的年月日
    dates2.remove(LocalDate.of(2025, 10, 1));


    // call String's equals()
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    System.out.println(names.remove("Jenny"));  // false
    System.out.println(names.remove("John"));  // true

    // ! so, at this moment, you should understand why equals() is important for every class

    // 
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("John")); // John
    cats.add(new Cat("Jacky")); // Jacky

    cats.remove(new Cat("John"));  // remove Cat John
    System.out.println(cats.size());  // 1

  }
}
