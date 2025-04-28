import java.util.Arrays;
import java.util.Scanner;

public class Person {
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getter, setter
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // eqauls   (今天的我，是否等如昨天的我)
  public boolean equals(Person cat) {
    return this.name.equals(cat.getName()) && this.age == cat.getAge();
  }

  // toString
  public String toString() {
    return "Cat(" + "name=" + this.name + ",age=" + this.age + ")";
  }

  public static void main(String[] args) {
    Person c1 = new Person("John", 10);
    System.out.println(c1.getName());
    c1.setName("Peter");
    System.out.println(c1.getName());

    Person c2 = new Person("Peter", 10);
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1 == c2); // false

    System.out.println(c2.toString()); // Cat(name=Peter,age=10)

    Scanner scanner = new Scanner(System.in);
    String[] catNames = new String[5]; // default value: [null, null, null, null, null]
    int idx = 0;
    while (true) {
      System.out.println("Please provide a cat name:");
      String input = scanner.nextLine();
      boolean found = false;
      for (int i = 0; i < idx; i++) {
        if (catNames[i].equals(input)) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println("The cat name " + input + " already exists.");
        continue;
      } else {
        catNames[idx++] = input;
      }
      if (idx >= catNames.length) {
        break;
      }
    }
    scanner.close();
    System.out.println(Arrays.toString(catNames));


  }
}