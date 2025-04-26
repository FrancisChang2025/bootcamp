import java.math.BigDecimal;

public class Order {
  // Static 靜態 variable (Not related to Object, common value for all objects) 唔擁有，但大家都可以公家用
  private static long counter = 0;

  // ! 1. Attributes (belongs to object 有變化) : 特徵 有 ➡️ Elements of object 原素
  private long id;  // or id = 0;
  private Item[] items;  // 'private static Item[] items;''
  //                                 加 👆 "static" 代表這句是多餘，不會有任何變化，可以放上面，慳 memory

  // ! 2. Constructors : 特徵 有 ➡️ call and construct object
  public Order() {
    this.items = new Item[0];
    this.id = ++counter;    // 每次 new 都直接去 公家那裡找, 每次找到 counter 就＋1，那下位再取又+1, 大家就不會 duplicate
    // ++counter;
    // this.id = counter;  // (R15 = replace R14-15 into one)
   } 

  // Once we have static variable design, id is not requird inputted by user.
  // public Order(long id) {
  //  this. items = new Item[0];
  //  this.id = id;
  // }

  // ! 3. Methods 工具  (Setter & Getter)  : 特徵 有 ➡️ return type
  public long getId() {
    return this.id;
  }

  public void add(Item item) {    // comply result 'apple'
    Item[] newItems = new Item[this.items.length + 1];   // new 一個新的 array 自己屋企
    for (int i = 0; i < this.items.length; i++) {         // use for Loop to backup existing array 
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;   // 新加入的嘢，放入新空間的最後個位，newItems.length - 1
    this.items = newItems;
  }
  // Order o1 = new Order()
  // o1.getAmount()
  public double amount() {    // Go to "Cart.java" to copy BigDecimal formula R35-39
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++){
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);  //前amount 拿走，即漏1步，指針不到
    }
    return amount.doubleValue();
  }



  public static void main(String[] args) {
    Order order1 = new Order();    // counter -> 1   'new' 在 Java 世界是動詞，意思是 create array -> constructor R6-8  
    Item apple = new Item(6.5, 3);
    order1.add(apple);
    System.out.println(order1.amount());  // 19.5     (6.5 * 3)

    Order order2 = new Order(); // counter -> 2
    System.out.println(order2.getId());   // 2
    Order order3 = new Order();  // counter -> 3
    System.out.println(order3.getId());   // 3



  }
}
