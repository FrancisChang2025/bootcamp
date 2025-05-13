import java.util.ArrayList;

public class Bag2 {
  private ArrayList<LifeGood> things;

  public Bag2() {
    this.things = new ArrayList<>();
  }

  public void add(LifeGood lifeGood) {
    things.add(lifeGood);
  }
}