public class SavingAccout extends SubAccount {
  private Currency currency;  // HKD, USD, CNY...
  // ! read, write & compare

  // 
  public static SavingAccout ofHKD () {
    return new SavingAccout(Currency.HKD);
  }

  private SavingAccout(Currency currency){
    this.currency = currency;
  }

  public static void main(String[] args) {
    SavingAccout sa = new SavingAccout(Currency.USD);
    System.out.println(sa.getBalance());  //0.0
    sa.credit(150);
    System.out.println(sa.debit(100)); // true
    System.out.println(sa.getBalance());  // 50.0
    System.out.println(sa.debit(60));  // false
    System.out.println(sa.getBalance());  // 50.0

    CurrentAccount ca = new CurrentAccount();
    ca.credit(200);
    ca.debit(110);
    System.out.println(ca.getBalance());  // 90.0

    PersonalAccount pa = new PersonalAccount();
    // add $100 to saving account
    pa.getSavingAccount().credit(100);
    // add $500 to current account
    pa.getCurrentAccount().credit(500);
    // deduct $80 from saving account
    pa.getSavingAccount().debit(80);
    // deduct $230 from current account
    pa.getCurrentAccount().debit(230);
    // print out the balance of this personal account
    System.out.println(pa.getSavingAccount().getBalance());  // 20.0
    System.out.println(pa.getCurrentAccount().getBalance());  // 270.0
    System.out.println(pa.balance());  // 290.0

    SavingAccout sa2 = SavingAccout.ofHKD();

  }
}

