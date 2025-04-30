// Account, SubAccount

// PersonalAccout & CommercialAccount
// Saving & Current

import java.math.BigDecimal;

public abstract class Account {
  // private double balance;
  private SubAccount[] subAccounts; // saving, stock, foreign exchange

  // super()
  public Account() {
    this.subAccounts = new SubAccount[2];
    this.subAccounts[0] = new SavingAccout();  // ! New Concept
    this.subAccounts[1] = new CurrentAccount();
  }

  public SubAccount getSavingAccount() {
    return this.subAccounts[0];
  }

  public SubAccount getCurrentAccount() {
    return this.subAccounts[1];
  }

  public double balance() {
    // loop SubAccounts to sum up balance
    BigDecimal bd = new BigDecimal(0.0);
    for (int i = 0; i < this.subAccounts.length; i++){
      bd = bd.add(BigDecimal.valueOf(this.subAccounts[i].getBalance()));
    }
    return bd.doubleValue();
  }


  public static void main(String[] args) {
    Animal animal = new Cat("John", 12);
    animal = new Dog("Susan");

    Animal[] animals = new Animal[] {new Cat("John", 12), new Dog("Peter")};
    // Cat cat = new Animal("Peter"); // NOT OK
  }
}
