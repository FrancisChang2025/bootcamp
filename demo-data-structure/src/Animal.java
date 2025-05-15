import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Animal implements Comparable<Animal>{
  private LocalDate dob;

  public Animal() {}

  public Animal(LocalDate dob) {
    this.dob = dob;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  @Override
  public int compareTo(Animal animal) {
    return this.dob.isAfter(animal.getDob()) ? -1 : 1;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", LocalDate.of(2024, 6, 5));
    Cat c2 = new Cat("Peter", LocalDate.of(2024, 7, 5));
    Cat c3 = new Cat("Lucas", LocalDate.of(2024, 6, 30));
    
    List<Cat> cats = new ArrayList<>();
    cats.add(c1);
    cats.add(c2);
    cats.add(c3);

    // Collection.sort 排序
    Collections.sort(cats);  // safe -> Compile time: checked Cat.class has Compare Interface
    System.out.println(cats); //[Cat()name=Peter), Cat()name=Lucas), Cat()name=John)]
  }
}