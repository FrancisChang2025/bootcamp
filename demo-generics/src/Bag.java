import java.util.ArrayList;

// ! Write less code (Bag2, Bag3, Bag4)
public class Bag<T extends LifeGood> {
  private ArrayList<T> things;   // Water and Food









  // ! Generics for static method
  public static <U extends LifeGood> void addTwoThings(Bag<U> bag,U LifeGood1, U LifeGood2) {
    bag.add(lifeGood1);
    bag.add(lifeGood2);
  }

  public static void main(String[] args) {
    Bag<LifeGood> bag1 = new Bag<>();
    Bag<Food> bag2 = new Bag<>();
    Bag<Water> bag3 = new Bag<>();

    // Bag<Object> bag4 = new Bag<>();

    // If we don't have Generics in Java....
    Bag2 lifegoodBag = new Bag2();
    lifegoodBag.add(new Water());
    lifegoodBag.add(new Food());

    Bag3 foodBag = new Bag3();
    Bag4 waterBag = new Bag4();

    Bag<LifeGood> newBag = new Bag<>();
    Bag.addTwoThings(newBag, new Food(), new Water());
    System.out.println(newBag);

    Bag<LifeGood> newBag2 = new Bag<>();
    Bag.addTwoThings(newBag2, new Food(), new Water());
    System.out.println(newBag2);
  }
}
