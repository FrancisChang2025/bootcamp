// ! One to One: One Person has one height and one weight (refer Person.java)

// ! One to Many Sample:

import java.util.Arrays;

public class Classroom {
  private String[] names; // stores String Array address，因為有好多學生名
  private String tutor;

  public String[] getNames() {
    return this.names;
  }

  public void setNames(String[] names) {
    this.names = names;
  }

  public void setTutor(String tutor) {
    this.tutor = tutor;    // 係這裡 class write tutor 表示隨時可換老師
  }



  public static void main(String[] args) {
    Classroom c1 = new Classroom();    // 'new' = create object -> Classroom object to c1 storage.
    // John Mary
    // create String array        See R8 class
    String[] students = new String[2];  // 這裡不可直接打人名，要用 Array 方法，作者📝 要求。
    students[0] = "John";
    students[1] = "Mary";
    // c1.setNames(students[0]); // error, students is String array object, students[0] -> String object
    c1.setNames(students);
    System.out.println(c1.getNames()[0]); // John

    // for loop, print all student names in the classroom
    for (int i = 0; i < c1.getNames().length; i++) {
      System.out.println(c1.getNames()[i]);
    }

    // Find Mary, and replace by Steven.   (Use Loop to find Mary and then replace by Steven)
    for (int i = 0; i < c1.getNames().length; i++) {
      if (c1.getNames()[i].equals("Mary")) {      // <- 'equal()'method, String 才可用的工具
        c1.getNames()[i] = "Steven";
        break;
      }
    }
    
    System.out.println(Arrays.toString(c1.getNames())); // [John, Steven]
  }
}