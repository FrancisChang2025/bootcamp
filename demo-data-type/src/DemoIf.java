public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    // askig if x > 3
    // x > 3 -> true / false
    boolean result = x > 3;
    System.out.println(result);  // false

    boolean result2 = x >= 3;
    System.out.println(result2);  // ture

    // if conditionals
    if (x > 3) {  // false -> skip code block
      System.out.println("x is larger than 3"); // can't identify, not system error
    }

    if (x < 3) {
      System.out.println("x is larger than 3"); // can't identify, not system error
    }

    if (x >= 3) {
      System.out.println("x is larger than 3"); // x is larger than 3
    }


    // if + else  (else -> One conditional ONLY)
    if (x > 3) {
      System.out.println("do something....");
    } else {   // implication: x <= 3
      System.out.println("do something else....");
    }
    // Ans is "do something else....", because x > 3 is not situable.


    // ==
    // x = 3, "=" -> assignment (assign 3 to x)
    // ! "==" -> asking if they are same value, it means that converted (Not equals)
    char gender = 'F';
    if (gender == 'M'){   // false, whether equal to ....
      System.out.println("He is male.");
    } else {
      System.out.println("She is female."); // Ans: She is female.
    }

    // "!=" -> asking if they are not equal, whether is not equal to ....
    if (gender != 'M') {  // true
      System.out.println("Not a Male.");
    }

    // if (x = 10);  Is error 
    if (x == 3) {
      System.out.println("Superman");
    }

    // ! Math Operators: +, -, *, /, %
    int r = 14 / 3;
    System.out.println(r);   // 4

    // "%" -> remainder
    int r2 = 14 % 3;
    System.out.println(r2);   // 2

    // ! Comparsion operators: >, <. >=, <=, !=, ==
    // Apply for all primitives

    // String :
    // if + String equals()
    String s2 = "Bootcamp";
    if (s2.equals("Bootcamp")) {  // true
      System.out.println("12345");  // print
    }

    // Approach 1  (left to right to read, bootcamp happens, and to anything, else no action)
    // Step 1: s2.equals ("Bootcamp") -> true
    // Step 2: true == false -> false
    // Step 3: Skip code block
    if (s2.equals("Bootcamp") == false) {
      System.out.println("23456");  // not print
    }

  // Approach 2  ("!" right to left to read, not bootcamp situation and must do anything)
  // Step 1: s2.equals ("Bootcamp") -> true
    // Step 2: !true == false
    // Step 3: Skip code block
    if (!s2.equals("Bootcamp")) {
      System.out.println("23456"); // not print
  }

  boolean r3 = !(x > 3);  // !false -> true
  System.out.println(r3); // true

  boolean isRaining = true;  // ! Raining now, is wrongly when add "!", because raining, therefor "I am running..."
  if (!isRaining) {   // false, so not print out
    System.out.println("I am running....");
  }


  // if + length(), charAt()
  // "s2.length() >= 3 -> true / false"
  if (s2.length() >= 3){
    System.out.println("hello");  // print
  } else {
    System.out.println("goodbye");  // skip
  }

  // Question: check if the last character of s2 equals to 'a',
  // if yes, print "yes", if no, print "no"
  // s2 = Bootcamp
  // ! charAt() + length()

  // Step 1: from inside to outside s2.length() -> 8
  // Step 2: 8 - 1 -> 7
  // Step 3: charAt(7) -> 'p'
  // Step 4: 'p' == 'a' -> false, go to Step 5
  // Step 5: print no

  // s2 = "";  // String is no limit
  if (s2.charAt(s2.length() - 1) == 'a') {
    System.out.println("yes");
  } else {
    System.out.println("no");
  }

  //s2 = "abcd";
  


  // Question: Find the middle char of the string
  // abcde -> c (5 / 2 -> 2)
  // abcd -> b (4 / 2 ->2)

  // ab -> a (2 / 2 -> 1)
  // a -> a (1 / 2 -> 0)
  String s3 = "abcd";
  System.out.println(s3.charAt(s3.length()/2));
  
  }

  String s3 = "abce";
  if (s3.length() % 2 == 1){

  }


  // odd number
  int x5 = 7;
  // Assignment (right to left)
  boolean isOdd = x5 % 2 == 1;  // Ans "1" or "0"
  System.out.println(isOdd);  // true

  boolean isLargerThan5 = x5 > 5;
  System.out.println(isLargerThan5);  // true

  // && -> AND
  if (isOdd && isLargerThan5) {
    System.out.println("It is an odd number and larger than 5.");
  }

  // even number and larger than 5
  if (!isOdd && isLargerThan5) {
    System.out.println("It is an even number and larger than 5.");
  }

    // Execise: 
    // int x5 = 10;


// Basic approach
    if (x5 % 2 == 1 && x5 > 5) { // missing boolean step
  if (isOdd && isLargerThan5) {
    System.out.println("It is an odd number and larger than 5.");
  }
  if (!isOdd && isLargerThan5) {
    System.out.println("It is an even number and larger than 5.");
}

// || -> or
if (isOdd || isLargerThan5){
  System.out.println("It is an odd number OR Larger than 5.");
}

int x6 = 10;
// Step 1: x6 < 9.  If true, exit criteria checking; if false, go step 2. (Right)
// Step 2: x6 % 2 == 0 && x6 > 0   // && event go first.
if (x6 < 9 || x6 % 2 == 0 && x6 > 0) {
  System.out.println("yes");

  // Question: Counting
  String s5 = "hello world";
  // Count how many character 'o' in s5.

  // Ans: 2

}


  //int s2Length = s2.length();
  //System.out.println(s2Length); // 8
  //String ans1 = "a";
  //System.out.println(ans1); // a

  //int a2Length = ans1.length();
  //char ans1 = s2.charAt(6);
    //System.out.println(ans1);
  //if (s2.charAt(ans1) = "a") {
   // System.out.println("yes");
  //} else {
    //System.out.println("no");
 // }





  }
}