import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static class SortedByNameDesc implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
      return s1.compareTo(s2) > 0 ? -1 : 1;
    }
  }

  // formula -> Person age desc
  public static class SortedByNamePerson implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
  }

  public static void main(String[] args) {
    Queue<String> q1 = new PriorityQueue<>(new SortedByNameDesc()); // Underlying data structure -> ArrayList -> array
    q1.add("vincent");
    q1.add("Lucas");
    q1.add("Sally");

    for (String s : q1) {   // For Loop,'add' not yet ordering, but quick
      System.out.println(s);
    }

    // consume the queue
    while (!q1.isEmpty()) {
      System.out.println(q1.poll());  // ! ordering -> pick up (slow)
    }

    // method: poll()
    // 👉 ordering -> String compareTo()
    // 👉 remove the object

    // 3 Persons  -> PQ  插隊  Age ranking (Elderly)
    Queue<Person> q2 = new PriorityQueue<>(new SortedByNamePerson());
    q2.add(new Person("John", 18));
    q2.add(new Person("Peter", 40));
    System.out.println(q2.poll());  // Person(name=Peter, age=40)
    q2.add(new Person("Chloe", 55));
    System.out.println(q2.poll());  // Person(name=Chloe, age=55)
    System.out.println(q2.poll());  // Person(name=John, age=18)
 

  }
}
