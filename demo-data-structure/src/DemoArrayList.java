import java.math.BigDecimal;
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

    Object[] objects = new Object[] {new Cat("Peter"), 4L, (byte) 10};

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
    System.out.println(integers.size());  // 3

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
    names.add(new String("Sally"));
    System.out.println(names.remove("Jenny"));  // false
    System.out.println(names.remove("John"));  // true

    // ! so, at this moment, you should understand why equals() is important for every class

    // Cat's equals
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("John")); // John
    cats.add(new Cat("John")); // John
    cats.add(new Cat("Jacky")); // Jacky

    cats.remove(new Cat("John")); // remove John
    System.out.println(cats.size()); // 2

    System.out.println(cats.contains("Mary"));
    System.out.println(cats.contains("Jacky"));

    //
    ArrayList<BigDecimal> decimals = new ArrayList<BigDecimal>();
    decimals.add(BigDecimal.valueOf(3.5));
    decimals.add(BigDecimal.valueOf(4.7));
    
    // ! Able to remove -> because BigDecimal equals() is workig...
    decimals.remove(new BigDecimal("3.5"));
    System.out.println(decimals.size());  // 1

    // Create a list of Double, remove some of them...
    // ArrayList 
    ArrayList<Double> d1Doubles = new ArrayList<>();
    d1Doubles.add(3.5);
    d1Doubles.add(4.7);

    // because Double equals() is working...
    d1Doubles.remove(4.7);
    System.out.println(d1Doubles.size()); // 1

    Double d1 = 3.9;
    Double d2 = 3.9;
    System.out.println(d1.equals(d2)); // true,  if false, asking 作者點解，equals()定義
    System.out.println(d1.compareTo(d2));  // 0

    // 
    ArrayList<Double> newDoubles = new ArrayList<>();
    newDoubles.add(10.9);
    newDoubles.add(4.1);
    newDoubles.add(8.8);
    d1Doubles.addAll(newDoubles);
    System.out.println(d1Doubles.size());   // 4

    // for-each loop
    // 1. by default loop through all elements
    for (Double x : d1Doubles)  {
      System.out.println(x);
    }
    // ArrayList -> underlying structure is array.
    // concept -> index
    for (int i = 0; i < d1Doubles.size(); i++) {
      System.out.println(d1Doubles.get(i));
    }

    int[] arr2 = new int[] {3, -1, 100};
    // Loop all elements of int array
    for (int x : arr2) {
      System.out.println(x);
    }

    // ! for-each loop (Array or ArrayList)
    // for loop (basic, use int i as counter)

    // basic for loop (advantage: Access 2 elements in one iteration)
    for (int i = 0; i < arr2.length; i++){
      System.out.println(arr2[i]);
      System.out.println(arr2[i] + 1);  // = R123 "x"
    }

    // ArrayList
    System.out.println(d1Doubles.contains(10.9));  // true

    System.out.println(d1Doubles.isEmpty());  // false

    System.out.println(d1Doubles.get(0));   // 3.5
    System.out.println(d1Doubles.set(0, 9.9));  // 3.5
    d1Doubles.set(0, 9.9);
    System.out.println(d1Doubles.get(0));  // 9.9

    d1Doubles.clear();  // assign 0 size array
    // new Double(0)
    System.out.println(d1Doubles.size());   // 0

    // ! clear() vs null
    // d1Doubles -> ArrayList Object Address
    d1Doubles = null;

    // read -> get(index), contains(), isEmpty()
    // write/modify -> set(), add(), remove(), clear(),
    
    

  }
}
