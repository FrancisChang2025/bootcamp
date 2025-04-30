import java.util.Arrays;

public class Teacher {
  private static Candy[] candies = new Candy[] {new Candy("RED"),
  new Candy("RED"), new Candy("RED"), new Candy("RED"), new Candy("RED"),
  new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
  new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
  new Candy("YELLOW"), new Candy("BLUE"), new Candy("BLUE"),
  new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE"),
  new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE"),};  
  
  // static?
  public void distribute(Child child, Candy candy) {
    child.receive(candy);
  }

  public void distributesAll(Child[] childs){
    int totalCandyCount = Teacher.candies.length;
    int idx = 0;
    while (true) { // 20 times
      boolean isEmpty = false;
      for (int i = 0; i < childs.length; i++) {  // 0-5 (6 times)
        System.out.println(idx);
        distribute(childs[i], Teacher.candies[idx]);
        Teacher.candies[idx] = null;
        if (idx + 1 >= totalCandyCount) {
          isEmpty = true;
          break;
        }
        idx++;
      }
      if (isEmpty) {
        break;
      }
    }
  }
  
  // Testing
  public static void main(String[] args) {

    // Child child1 = new Child();
    // Candy candy1 = new Candy("RED");
    // t1.distribute(child1, candy1);

    Child child1 = new Child();
    Child child2 = new Child();
    Child child3 = new Child();
    Child child4 = new Child();
    Child child5 = new Child();
    Child child6 = new Child();
    Child[] childs =
        new Child[] {child1, child2, child3, child4, child5, child6};
    Teacher t1 = new Teacher();
    t1.distributesAll(childs);

    for (int i = 0; i < childs.length; i++) {
      System.out.println(Arrays.toString(childs[i].getCandies()));
    }
  }
}
