public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    // askig if x > 3
    // x > 3 -> true / false
    boolean result = x > 3;
    System.out.println(result);  // false

    boolean result2 = x >= 3;
    System.out.println(result2);  // ture

    //  ! if conditionals 條件  （分差路，利用如果⋯⋯）
    if (x > 3) {  
      System.out.println("x is larger than 3"); // can't identify, not system error
    }   // false -> skip code block

    if (x < 3) {
      System.out.println("x is smaller than 3"); // can't identify, not system error
    }   // false -> skip code block

    if (x >= 3) {
      System.out.println("x is larger than or equal to 3"); 
    }   // true, therefore -> "x is larger than 3"


    // ! if + else  (else -> One conditional ONLY)
    if (x > 3) {
      System.out.println("do something....");
    } else {   // implication: x <= 3
      System.out.println("do something else....");
    }
    // Ans is "do something else....", because x > 3 is not situable.


    // ==
    // x = 3, "=" -> assignment (assign 3 to x)
    // ! "==" -> "asking if" they are same value, it means that converted (Not equals)
    char gender = 'F';
    if (gender == 'M'){   // false, whether equal to ....char gender 是男士？
      System.out.println("He is male.");
    } else {
      System.out.println("She is female."); // Ans: She is female.
    }

    // !   "!=" -> asking if they are not equal, whether is not equal to ....
    if (gender != 'M') {  // true    gender 不是男士 ?
      System.out.println("Not a Male.");  // Not a Male.
    }

    // if (x = 10);  Is error 
    if (x == 3) {
      System.out.println("Superman");  // Superman
    }

    // ! Math Operators: +, -, *, /, %  （有5個運算 math operators）
    int r = 14 / 3;
    System.out.println(r);   // 4

    // "%" -> remainder 餘數 
    int r2 = 14 % 3;
    System.out.println(r2);   // 2   

    // ! Comparsion operators: >, <. >=, <=, !=, ==   （有6個 比較 operators）
    // Apply for all primitives

    // ! String 3 methods + if 混合使用  -> if + equal() or length() or charAt()
    // if + String equals()
    String s2 = "Bootcamp";
    if (s2.equals("Bootcamp")) {  // true     (s2 是否等如 Bootcamp ? )
      System.out.println("12345");  // print "12345"
    }

    // Approach 1  (left to right to read, bootcamp happens, and to anything, else no action)
    // Step 1: s2.equals ("Bootcamp") -> true
    // Step 2: true == false -> false     ('==' means asking if) true 不是 false，所以就是 false)
    // Step 3: Skip code block            (所以冇答案回覆 not print)
    if (s2.equals("Bootcamp") == false) {
      System.out.println("23456");  // not print
    }

   // Approach 2  ("!" right to left to read, not bootcamp situation and must do anything)
   // Step 1: s2.equals ("Bootcamp") -> true
    // Step 2: !true == false      (恴即 是看右手邊後半部份, true 不等如 false,即表示結果是 true, 
    //                                     前面加 '！' 表示反轉結果，即由 true 變成 false)
    // Step 3: Skip code block
    if (!s2.equals("Bootcamp")) {
      System.out.println("23456"); // not print
  }

  boolean r3 = !(x > 3);  // !false  x等如3，不是大過，所以就是錯 -> 前面加'！'即表示反轉結果，就是 true
  System.out.println(r3); // true   (x不是大過3，因為 x 本身是等如 3，所以 r3 = 3)

  // ! Raining now, is wrongly when add "!", because raining, therefore "I am running..."
  boolean isRaining = true;     // 題目提供情景，現在是下雨中。  所以下雨中 = true
  if (!isRaining) {   // false, so not print out    (明明現在下著雨，你話不是落緊雨，所以是 false 注前有'!' 反轉結果)
    System.out.println("I am running....");  // false -> not print
  }

  isRaining = true; 
  if (isRaining) {   //  判斷現在下雨中，所以true 
    System.out.println("I am running...."); // true -> print "I am running..."
  }


  // if + length(), charAt()
  // "s2.length() >= 3 -> true / false"
  if (s2.length() >= 3){         // s2 = bootcamp, "bootcamp" 有8個位，所以 >3 -> true -> print
    System.out.println("hello");  // print -> 'hello'
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
    System.out.println("no");  // no
  }

  // 但 charAt() 不可以 over 字的長度 或 長度是0 -> OK, 但運算 0 - 1 ＝ 結果是 -1， 因為變成 false, 會💥 爆炸
  s2 = "abcd";
  if (s2.charAt(s2.length() - 1) == 'a') {
    System.out.println("yes");
  } else {
    System.out.println("no");  // no
  }
  


  // Question: Find the middle char of the string
  // abcde -> c (5 / 2 -> 2)
  // abcd -> b (4 / 2 -> 2)

  // ab -> a (2 / 2 -> 1)
  // a -> a (1 / 2 -> 0)
  
  s3 = "abcd";
     if (s3.length() % 2 == 1) { // odd length
       System.out.println(s3.charAt(s3.length() / 2));  // false  (4/2=2)冇餘數，所以是雙數 go to step row 16
     } else { // even length
       System.out.println(s3.charAt(s3.length() / 2 - 1)); // true (4/2 -1 = 1),Ans is '1',所以 print
     }
     // b    符合 else condition is true, Ane is '1', means that position 0,1

  }
}