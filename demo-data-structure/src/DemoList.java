import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // ArrayList<Bird> birds = new ArrayList<>();
    List<Bird> birds = new ArrayList<>();

    // "List" interface has a set of methods to the implements
    System.out.println(birds.isEmpty());  // true

    // Because ArrayList implements List, so we know ArrayList must contains add() method
    birds.add(new Bird("John", null));
    System.out.println(birds.size()); // 1

    // Polymorphism:
    // Compile time: List determines if birds is able to call add()
    // Run time: ArrayList.add()

    // ! why we use List<Bird> as oject reference type?
    birds = new LinkedList<>(birds);
    System.out.println(birds);  // [Bird@70dea4e]
    birds.add(new Bird("vincent", null));

    System.out.println(birds.getLast().getName());  // vincent

    LinkedList<Bird> manyBirds = new LinkedList<>();
    manyBirds.add(new Bird("Ricky", null)); //
    manyBirds.addFirst(new Bird("Jacky", null));
    System.out.println(manyBirds); // [Bird(name=Jacky), Bird(name=Ricky)]

    manyBirds.poll(); // ! LinkedList has poll(), but List does not have.
    System.out.println(manyBirds); // [Bird(name=Ricky)]

    manyBirds.push(new Bird("Tommy", null)); // ! LinkedList has poll(), but List does not have.
    System.out.println(manyBirds); // [Bird(name=Tommy), Bird(name=Ricky)]

    // usually we use List as type reference, until you want to use specific methods of the class.
    
    // List<String> emails = new ArrayList<>();
    // List<String> emails = new LinkedList<>();
  }
}
