// Account, SubAccount

// PersonalAccout & CommercialAccount
// Saving & Current

public abstract class Account {
  // private double balance;
  private SubAccount[] subAccounts; // saving, stock, foreign exchange

  // super()
  public Account() {
    this.subAccounts = new SubAccount[1];
    this.subAccounts[0] = new SavingAccout();  // ! New Concept
    this.subAccounts[1] = new CurrentAccount();
  }

  public double getBalance() {
    return this.balance();
  }

  public SubAccount getSavingAccount() {
    return this.subAccounts[0];
  }

  public SubAccount getCurrentAccount() {
    return this.subAccounts[1];
  }

  public double balance() {
    // loop SubAccounts to sum up balance
  }


  public static void main(String[] args) {
    Animal animal = new Cat("John", 12);
    
    animal = new Dog("Susan");
    // Cat cat = new Animal("Peter"); // NOT OK
  }
}
