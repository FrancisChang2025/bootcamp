public class Demolf2 {
  public static void main(String[] args) {
     // Question: Find the middle char of the string
     // i.e. abcde -> c
     String s3 = "abcde";
     if (s3.length() % 2 == 1) {    // true -> print  (5/2=2.5) 有餘數，是'1'
       System.out.println(s3.charAt(s3.length() / 2)); // c  （5/2=2), position: 0,1,2
     }    
     // abcde -> c (5 / 2 -> 2)
     // abcd -> b (4 / 2 -> 2)
     // ab -> a (2 / 2 -> 1)
     // a -> a (1 / 2 -> 0)
     
     // ! 以下情況，用 ODD/EVEN 去找答案。  即用 '%' 有冇餘數。  （除不盡，即等如'1'），(否則等'0' 除得盡，有冇餘數)
     
     s3 = "abcd";
     if (s3.length() % 2 == 1) { // odd length  
       System.out.println(s3.charAt(s3.length() / 2));  // false  (4/2=2)冇餘數，除得盡，所以是雙數 go to step row 18
     } else { // even length
       System.out.println(s3.charAt(s3.length() / 2 - 1)); // true (4/2 -1 = 1),Ans is '1',所以=true -> print
     }
           // b    符合 else condition is true, Ane is '1', means that position 0,1 

     s3 = "abce";
     if (s3.length() % 2 == 1){  // false -> no print    冇餘數，不等如'1'     (4/2=2)
      System.out.println(s3.charAt(s3.length()) /2);  //   
     }

     s3 = "ab";
     if (s3.length() % 2 == 1) {  // false -> no print    冇餘數，不等如'1'    (2/2=1)
      System.out.println(s3.charAt(s3.length() / 2));  //  
     }

     s3 = "a";
     if (s3.length() % 2 == 1) {  // true -> print  (1/2=0.5)  有餘數，除不䀆，所以等如'1'
      System.out.println(s3.charAt(s3.length() / 2));   // a     position 0  (1/2 = 0)
     }


     // odd number
     int x5 = 7;
     // Assignment (right to left 因為有'＝＝' 先決定 true / false)
     boolean isOdd = x5 % 2 == 1;
     System.out.println(isOdd); // true
 
     boolean isLargerThan5 = x5 > 5;
     System.out.println(isLargerThan5); // true
 
     // && -> AND   (x5 && >5)
     if (isOdd && isLargerThan5) {    // true -> print       ('&&' asking means true/false)
       System.out.println("It is an odd number and larger than 5.");
     }

     // Example: If elderly > 60 and Unemployment 如果是長者 且是失業人士 就可以取救濟金 (TWO events) Use '&&' 
     int salaries = 0;
     int age = 80;
     if (age > 65 && salaries <= 0) {
      System.out.println("You are eligible for relief funds.");
     }  else {
      System.out.println("You are not eligible for relief funds.");
     }
     // You are eligible for relief funds.

     // Execise: 
     // int x5 = 10;
     // odd number
     x5 = 10;
     isOdd = x5 % 2 == 1;
     System.out.println(isOdd); // false
 
     // even number and larger than 5   (10 && >5) 是雙數 且大過5， 可以用 '!'
     if (!isOdd && isLargerThan5) {    // true -> 不是單數 且大過5
       System.out.println("It is an even number and larger than 5.");
     }

 
     // Basic approach  
     // if (x5 % 2 == 1 && x5 > 5) {
     // System.out.println("basic approach");
     
     // Basic approach
     if (x5 % 2 == 1 && x5 > 5) { // missing boolean step
       if (isOdd && isLargerThan5) {
         System.out.println("It is an odd number and larger than 5.");
       }
        if (!isOdd && isLargerThan5) {
          System.out.println("It is an even number and larger than 5.");
        }
      }
      // false -> no print

 
     // || -> or     
     // (10 or >5)
     if (isOdd || isLargerThan5) {    // true -> print
       System.out.println("It is an odd number OR larger than 5.");
     }

    int x6 = 10;
    // Step 1: x6 < 9.  If true, exit criteria checking; if false, go step 2. (Right)
    // Step 2: x6 % 2 == 0 && x6 > 0   //   && event go first. from right to left 先睇'&&', if true,再睇 'or'
     if (x6 < 9 || x6 % 2 == 0 && x6 > 0) {
       System.out.println("yes");   // yes
      }


    // Question: Counting
    String s5 = "hello world";  // 11個 characters
    // Count how many character 'o' in s5.
    // Ans: 2
    int numCount = 0;
    for (int i = 0; i < s5.length(); i++) {    // run 11 times, i = 0,1,2,3,4,5,6,7,8,9,10
      if (s5.charAt(i) == 'o') {
        numCount++;
      }
    }    
    System.out.println("The no. of 'o' character= " + numCount);  // 2
   


 }
}
