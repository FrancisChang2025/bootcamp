import java.math.BigDecimal;
import java.util.Arrays;

public class Cart {
  private Item[] items;  // empty no object, ".length()" 就爆炸💣, not array, add item constructor R9

  // Item.java -> price, quantity

  public Cart() {     // for R13 not Bomb!
    this.items = new Item[0];  // 0長度，no this will be error 'null' nothing, will 💣
  }

  public Item[] getItems() {
    return this.items;
  }

  public int size() {
    return this.items.length;
  }

  // this.item -> 10
  // for loop -> 0-9
  // newItems[10]
  public void add(Item abc) {  // (Item item) replace by abc  
    Item[] newItems = new Item[this.items.length + 1];  // '+1'就是自己毎位，自己的長度
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = this.items[i];
    } 
    newItems[newItems.length - 1] = abc;  // 找回原先自己的資料copy 去 replace memory
    this.items = newItems;
  }

  // ! 涉及 +,-,*,/ and 小數點位運算，都要用 BigDecimal method in the Loop
  public double checkoutAmount() {
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++){
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);  //前amount 拿走，即漏1步，指針不到
    }
    return amount.doubleValue();
  }

  // Old Method: below steps same with above R35 to R39 直接把 BigDecimal 搬到 R35
  // double amount = 0.0;
  // for (int i = 0; i < this.items.length; i++){
  //   amount = BigDecimal.valueOf(this.items[i].amount()).add(BigDecimal.valueOf(amount))
  //    .doubleValue();
  //  return amount;





  public static void main(String[] args) {
    int[] arr = new int[3]; // fixed length
    arr[0] = 10;
    arr[1] = 100;
    arr[2] = -2;
    System.out.println(Arrays.toString(arr)); // [10, 100, -2]
    int[] arr2 = arr; // backup the address of array object

    arr = new int[4];
    System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]
    System.out.println(Arrays.toString(arr2));  // [10, 100, -2] 先保留原本 arr 資料，否則
                                                  // 直接new 會被 replace memory 替代，消失舊

    String s = "hello";
    System.out.println(s); // hello    (printing the value in the address of object)
    s = "hello1"; // new String object
    System.out.println(s); // hello1    (different address)

    //
    Cart cart = new Cart();
    Item rice = new Item(99.9, 2);        // array[0]
    Item water = new Item(4.5, 7);        // array[1]
    Item fish = new Item(30.0, 4);        // array[2]
    System.out.println(cart.size()); // 0
    cart.add(rice); 
    cart.add(water);
    cart.add(fish);
    System.out.println(cart.size()); // 3
    System.out.println(cart.getItems()[2].getQuantity()); // 4    (Item array 加長咗)
                          //    R13 👆 fish     👆view class 'item.java'

    System.out.println(cart.checkoutAmount());   // 351.3


 
  }
}