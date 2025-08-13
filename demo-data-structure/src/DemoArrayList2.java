import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // Traditional
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Jacky", 13));
    persons.add(new Person("Vincent", 10));

    // Given you know exactly the persons
    List<Person> persons2 = new ArrayList<>(
      Arrays.asList(new Person("Jacky", 13), new Person("Vincent", 10)));

    // ! Java 9 -> List.of()
    // ! Important Note: List.of() does not support the implementation of add(), remove(), etc.
    List<Person> persons3 = List.of(new Person("Jacky", 13), new Person("Vincent", 10));
    System.out.println(persons3);
    // persons3.add(new Person("Alex", 3)); // java.lang.UnsupportedOperationException
    // persons3.remove(1); // java.lang.UnsupportedOperationException
    // persons3.set(0, new Person("Oscar", 19)); // java.lang.UnsupportedOperationException

    // ! Arrays.asList()
    List<Person> persons4 = 
        Arrays.asList(new Person("Jacky", 13), new Person("Vincent", 10));
    // persons4.add(new Person("Alex", 3)); // java.lang.UnsupportedOperationException
    // persons4.remove(1); // java.lang.UnsupportedOperationException
    persons4.set(0, new Person("Oscar", 19));
    System.out.println(persons4);

    // ! new Arrays.asList()
    List<Person> persons5 = new ArrayList<>(
       Arrays.asList(new Person("Jacky", 13), new Person("Vincent", 10)));
    persons5.add(new Person("Alex", 3));
    persons5.remove(1);
    persons5.set(0, new Person("Oscar", 19));
    System.out.println(persons5);   // {Person.........}
  }
}
