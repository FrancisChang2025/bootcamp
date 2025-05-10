import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.management.Query;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList -> Deque -> Queue
    Queue<Cat> queue1 = new LinkedList<>();
    
    queue1.add(new Cat("John"));   //排隊
    queue1.add(new Cat("Jacky"));
    queue1.add(new Cat("Vincent"));
    System.out.println(queue1.poll());  // John
    System.out.println(queue1);

    Deque<Cat> queue2 = new LinkedList<>();
    queue2.addLast(new Cat("Mary"));
    queue2.addFirst(new Cat("Peter"));
    queue2.addLast(new Cat("Sally"));
    System.out.println(queue2.pollFirst());  // Peter
    System.out.println(queue2);  //[Cat()name=Mary), Cat()name=Sally)]
    System.out.println(queue2.pollLast());  // Sally
    System.out.println(queue2);  // [Cat()name=Mary)]

    ArrayDeque<String> deques = new ArrayDeque<>();
    deques.add("Eva");
    deques.add("Sunny");
    deques.add("Hidy");
    deques.addFirst("Gigi");
    System.out.println(deques); // [Gigi, Eva, Sunny, Hidy]
    deques.addLast("Sunny");
    System.out.println(deques);  // [Gigi, Eva, Sunny, Hidy, Sunny]
    deques.remove("Sunny");
    System.out.println(deques.size());  // 4
    System.out.println(deques);  // [Gigi, Eva, Hidy, Sunny]

    Queue<String> strings = new ArrayDeque<>();
    strings.add("John");
    strings.add("Kenny");
    strings.add("vincent");
    strings.poll();
    System.out.println(strings);  // [Kenny, vincent]

    Deque<String> strings2 = new ArrayDeque<>();
    strings2.addFirst("Kate");
    strings2.addFirst("Mandy");
    strings2.addFirst("Christy");
    System.out.println(strings2);  // [Christy, Mandy, Kate]
    System.out.println(strings2.pollLast());  // Kate


    List<Cat> cats = new LinkedList<>();


    // Animal a1 = new Cat("John");
    Object o1 = new Cat("Peter");
    
  }
}
