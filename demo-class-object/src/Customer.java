import java.math.BigDecimal;
import java.text.Bidi;

public class Customer { // Blueprint 藍圖(沒有生命) -> HardDisk to 去生产 Customer(有生命) -> Memory
  // ! class content  (blueprint) 作者

  // Attributes 特徵
  // private 私有變數, 內容封閉 -> by default, this object is not readable & not writable
  private String name;
  private String email;
  // .... etc...
  private String customer;

  private Order[] orders;  // One customer has many orders, One order has many items.

  // VIP -> if the total amount of all orders >= 10000 (boolean method is VIP())
  // customer1.isVIP() -> true / false

  public Customer(){
    this.orders = new Order[0];
  }

  // 1 second -> 1000 ms
  // 0-1 ms 千分1秒
  // human being -> 0.1 s 0.2 s
  public boolean isVIP(){
    // for loop to orders
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.orders.length; i++){
      total = total.add(BigDecimal.valueOf(this.orders[i].amount()));
    }
    return total.doubleValue() >= 10000;
   }

  public void add(Order order){
    Order[] newOrder = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++){
      newOrder[i] = this.orders[i];
    } 
    newOrder[newOrder.length - 1] = order;
    this.orders = newOrder;

  }

  // Setter   設置方法 (产生工具比人放 data 入去)
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  // Getter  獲取方法
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public String getCustomer() {
    return this.customer;
  }



  // !  Main method is NOT a must for a class file, it is for "DATA GROUPING". it is a machine.
  public static void main(String[] args) {
    String s = "hello";   // click 'run' -> Memory
    System.out.println("hello");

    BigDecimal bd = new BigDecimal("1.3");  // 'BigDecimal' 藍圖，JAVA已經寫好 (Cmd + return) to view.
    
    // ! Create Object (new...) 用家     Machine to start run, after exit memory
    // 每個 Object 都有自己的工具(藍圖已經产生咗出來），用家直接取 Tools to create Object.
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);   // John Chan   if 'null' 即冇嘢顯示，不答你 because is a private R9
    System.out.println(email);  // john@gmail.com

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());

    Order order1 = new Order();
    order1.add(new Item(15.3, 9));
    order1.add(new Item(2.5, 3));
    john.add(order1);
    
    Order order2 = new Order();
    order2.add(new Item(1000.3, 9));
    mary.add(order2);
    System.out.println(mary.isVIP());  // false

    Order order3 = new Order();
    order3.add(new Item(200.5, 10));
    mary.add(order3);
    System.out.println(mary.isVIP());  // ture


  }
}
