import java.util.ArrayList;
import java.util.HashSet;
import com.azul.crs.internal.asm.Handle;

public class DemoHashSet {

  public static void main(String[] args) {
    // A set of String
    // ! Difference between ArrayList and HashSet
    // 1. ArrayList has ordering, while HashSet has not
    // 2. HashSet avoid duplicate elements, while ArrayList is able in store duplicated elements.
    HashSet<String> strings = new HashSet<>();
    // Java allows "bypass" the returned value.
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size());  // 2

    System.out.println(strings.add("ijk"));  // true
    System.out.println(strings.size());  // 3

    // ! because "def" already exists in strings HashSet, we cannot add a duplicate object into HashSet
    System.out.println(strings.add("def"));  // fasle
    System.out.println(strings.add("def"));  // fasle
    System.out.println(strings.size());  // 3

    // ! HashSet has most of the methods of ArrayList
    strings.remove("ijk");
    strings.isEmpty();
    strings.contains("abc");
    // strings.clear();

    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");
    names.add("John");

    // ! ArrayList allows duplicate objects
    System.out.println(names.size());  // 3

    HashSet<String> uniqueNames = new HashSet<>();
    for (String name : names) {
      uniqueNames.add(name);
    }
    // HashSet's toString()
    System.out.println(uniqueNames);  // (John, Peter)

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Jennie"));
    cats.add(new Cat("Vincent"));
    cats.add(new Cat("Luscas"));
    cats.add(new Cat("Jennie"));
    System.out.println(cats.equals("Jennie")); //  false

    // HashSet
    HashSet<Cat> uniqueCats = new HashSet<>();

    // add() -> equals() -> duplicate
    for (Cat cat : cats) {
      uniqueCats.add(cat); // add() -> equals() and hashCode() 
    }
    System.out.println(uniqueCats);

    // 1. true / false (Check if any duplicated cat)
    boolean foundDuplicated = false;
    for (Cat cat : cats) {
      if (!uniqueCats.add(cat)){
        foundDuplicated = true;
        break;
      }
    }
    System.out.println(foundDuplicated);  // true


    // 2. Has Ordering, remove Duplicated
    HashSet<Cat> catSet = new HashSet<>();
    ArrayList<Cat> orderedCats = new ArrayList<>();
    for (Cat cat : cats) {   //  ordering
        if (catSet.add(cat)) { // checking
          orderedCats.add(cat);  // ordering
        }
      }
    System.out.println(orderedCats); //[Cat()name=Jennie), Cat()name=Vincent), Cat()name=Luscas)]

    
  }
}
