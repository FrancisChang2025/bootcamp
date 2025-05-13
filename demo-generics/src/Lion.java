public class Lion extends Animal {
  private int weight;

  public static <U extends LifeGood> void addTwoThings(Bag<U> bag,U lifeGood1,
     U lifeGood2) {
    bag.add(lifeGood1);
    bag.add(lifeGood2);
  }

  // static: input -> output, instance variable is not required
  public static int sum(int x, int y) {
    return x + y;
  }

  // use instance method, only when instance variable is required.
  public int sum2(int x, int y) {
    return x + y + this.weight;  // New Lion to carriage.. e.g. weight, it cannot write to 'static'
  }

  // Bad Design: You waste a lion....  "not static"
  public  int sum3(int lionWeight, int x, int y){
    return lionWeight + x + y;
  }

  public static void main(String[] args) {
    // Lion.addTwoThings(null, null, null);
    System.out.println(Lion.sum(1, 2));  // 3
    System.out.println(new Lion().sum2(1, 2));  // 3
  }
}
