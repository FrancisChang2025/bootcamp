import java.math.BigDecimal;

public class Order {
  // Static variable (Not related to Object, common value for all objects) 唔佣有，但大家都可以公家用
  private static long counter = 0;

  // ! Attributes (belongs to object)
  private long id;  // or id = 0;
  private Item[] items;  // private static Item[] items; "static" 多餘，不可變化，竹尸一中以放上面


  // ! Constructors
  public Order() {
    this.items = new Item[0];
    this.id = ++counter;
    // ++counter;
    // this.id = counter;  // (R15 = replace R13-14 into one)
   } 

  // Once we have static variable design, id is not requird inputted by user.
  // public Order(long id) {
  //  this. items = new Item[0];
  //  this.id = id;
  // }

  // ! Methods
  public long getId() {
    return this.id;
  }

  public void add(Item item) {    // comply result 'apple'
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
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
    Order order1 = new Order();    // counter -> 1     new = create  constructor R6-8  
    Item apple = new Item(6.5, 3);
    order1.add(apple);
    System.out.println(order1.amount());  // 

    Order order2 = new Order(); // counter -> 2
    System.out.println(order2.getId());   // 2
    Order order3 = new Order();  // counter -> 3
    System.out.println(order3.getId());   // 3



  }
}
