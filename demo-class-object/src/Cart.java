import java.util.Arrays;

public class Cart {
  private Item[] items;

  // Item.java -> price, quantity

  public void add(Item item) {

  }

  public double checkoutAmount() {
    return -1.0;
  }

  public static void main(String[] args) {
    int[] arr = new int[3]; // fixed length
    arr[0] = 10;
    arr[1] = 100;
    arr[2] = -2;
    System.out.println(Arrays.toString(arr)); // [10, 100, -2]
    int[] arr2 = arr; // backup the address of array object

    arr = new int[4];
    System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]
    System.out.println(Arrays.toString(arr2));

    String s = "hello";
    System.out.println(s); // printing the value in the address of object
    s = "hello1"; // new String object
    System.out.println(s); // different address

    //
    Cart cart = new Cart();
    Item rice = new Item();
    Item water = new Item();
    Item fish = new Item();
    cart.add(rice);
    cart.add(water);
    cart.add(fish);

  }
}