import java.math.BigDecimal;
import java.text.Bidi;

public class Customer {   // Blueprint 藍圖 to create Customer -> HardDisk, Life -> Memory
  // ! class content  (blueprint) 作者

  // Attributes 特徵
  // private 內容封閉 -> by default, this object is not readable & not writable
  private String name;
  private String email;
  // .... etc...

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }



  // main method is NOT a must for a class file  
  public static void main(String[] args) {
    String s = "hello";   // click 'run' -> Memory
    System.out.println("hello");

    BigDecimal bd = new BigDecimal("1.3");
    
    // ! Create Object (new...) 用家
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);   // John Chan   if 'null'    because is a private R9
    System.out.println(email);  // john@gmail.com

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());
    
  }
}
