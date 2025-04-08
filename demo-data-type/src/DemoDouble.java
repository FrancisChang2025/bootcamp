public abstract class DemoDouble {
  public static void main(String[] args){
    int x = 9;
    System.out.println(x);

    // Store a number with decimal place
    // Type: double
    
    double y = 9.9;
    System.out.println(y);

    // ! We cannot store d.p. into integer variable
    x = 9;


  // Store 99.9 int variable price
  // Store 3 into varibale quantity
  // calculate checkout amount
  double price = 99.9;
  int quantity = 3;
  double amount = price * quantity;
  System.out.println(amount);// 299.700000005

  double b = 2.9;
  System.out.println(b);


  //
  double o1 = 0.1 + 0.2;
  System.out.println(o1); // 0.3000000

  // 10 -> int value
  // 3 -> int value
  // 1. 10 / 3 -> int / int -> int (10 / 3 -> 3)
  // 2. assign result into w (3 -> 3.0)
  double w = 10 / 3;
  System.out.println(w); // 3.0

  // ! double / int -> double
  int score1 = 71;
  int score2 = 82;
  // calculate the average score
  // step 1: (int + int) / int -> int (71 + 62)/2 -> 76
  // step 2: 76 -> 76.0
  double averageScore = (score1 + score2) / 2;
  System.out.println(averageScore);

  // ! double / int -> double
  int score3 = 71;
  int score4 = 82;
  // calculate the average score
  // step 1: (int + int) / int -> int (71 + 62)/2 -> 76
  // step 2: 76 -> 76.0
  double averageScore2 = (score3 + score4) / 2.0;
  System.out.println(averageScore2);

  // ! divided by zero -> System Error (Undefine)
  // double r3 = 10 / 0;
  // System.out.println(r3);

  double r4 = 0 / 10;
  System.out.println(r4);

  }
}
