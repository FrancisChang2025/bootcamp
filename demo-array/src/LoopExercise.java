import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++){
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    int[] k1 = new int[] {0,1,2,3,4};
    for (int i = 0; i < k1.length; i++){
      k1[i] = k1[i];
    }
    System.out.println(Arrays.toString(k1));

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    int evenNum = 2;
    for (int i = 0; i <= 20; i++){
      if (i % 2 == 0){
        evenNum = i;
        System.out.println(evenNum);
        evenNum += i;
        continue;
      }
    }


    // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    int numbers = 1;
    for (int i = 0; i <= 100; i++){
      if (i % 3 == 0 || i % 5 == 0){
        numbers = i;
        System.out.println(numbers);
        numbers += i;
        continue;
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sumTotal = 0;
    for (int i = 0; i <= 15; i++) {
      sumTotal += i;
    }
    System.out.println("Ans 5: Sum up 1-15 total=" + sumTotal);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int oddSum6 = 0;
    int evenSum6 = 0;
      for (int j = 0; j <= 10; j++ ){
        if (j % 2 == 0){
         j = j + 1;
         oddSum6 = oddSum6 + j;
        }
      }
      System.out.println("Ans 6: sum of odd numbers is= " + oddSum6);

      for (int k = 0; k <= 10; k++ ){
        if (k % 2 == 1){
         k = k + 1;
         evenSum6 = oddSum6 + k;
        }
      }
      System.out.println("Ans 6: sum of even numbers is= " + evenSum6);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if (str7.contains("d")) {
      System.out.println("Ans 7: d is found");
    } else {
      System.out.println("Ans 7: d is not found");
    }


    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
      if (s8a.contains(s8b)){
        System.out.println("Ans 8: s8b is a substring.");
      } else {
        System.out.println("Ans 8: 8b is not a substring.");
      }


    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int Ls9 = s9.length();
    int count = 0;
    System.out.println("'pampers' count value=" + Ls9);
    for (int i = 0; i < s9.length(); i++){
      if (s9.charAt(i) == c9){
        count++;
      }
    }
    System.out.println("Ans 9: count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('k','x');
      System.out.println(arr10[i].replace ('k','x'));
    }


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int upperCount = 0;
    char character = 0;
    for (int i= 0; i < s11.length(); i++) {
      character = s11.charAt(i);
      if (Character.isUpperCase(character)){
        upperCount++;
       }
      }
      System.out.println("Ans 11: count uppercase=" + upperCount);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    int rows = 3;
    int columns = 5;
    for (int i = 0; i < rows; i++) {  // run 0,1,2
      for (int j = 0; j < columns; j++) {   // run 0,1,2,3,4
        System.out.print("*");
        }
        System.out.println();
      }
      


    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score

    String s13 = "lrlaudbucp";

    int l = 1;
    int r = 3;
    int d = 2;
    int u = 4;
    int result = 0;
    char[] chs = new char[] {'l', 'r', 'd', 'u'};
    int[] counts = new int[26];
    for (int i = 0; i < s13.length(); i++) {
      int index = chs[i] - 'a';
      counts[index]++;
    }
    System.out.println("The total score = " + result);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    System.out.println("Ans 14: long values= " + Arrays.toString(arr14));

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long maxNum = Long.MIN_VALUE;
    long minNum = Long.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] < maxNum) {
        maxNum = arr14[i];
        continue;
      }
      if (arr14[i] > minNum) {
        minNum = arr14[i];
        continue;
      }
    }
    System.out.println("Ans 15: max value=" + maxNum + "and min value=" + minNum);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = new float[] {0.2f, 0.3f, 0.6f};


    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = BigDecimal.valueOf(arr16[i])  //
      .add(BigDecimal.valueOf(0.1))  //
      .floatValue();
    }
    System.out.println(Arrays.toString(arr16));


    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int count2 = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i] == target);
        count2++;
    }
    System.out.println("Ans 18: count name=" + count);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    int[] s19 = new int[] {4, 9, 2, 8, 9};
    int maxDigit = Integer.MIN_VALUE;
    int minDigit = Integer.MAX_VALUE;
    int temp = -1;
    for (int i = 0; i < s19.length; i++) {
      for (int k = 0; k < s19.length - i; k++) {
        if (s19[k + 1] < s19[k]);
          temp = s19[k + 1];
          s19[k + 1] = s19[k];
          s19[k] = temp; 
      }
    }
    for (int i = 0; i < s19.length; i++){
      System.out.println("The max digit = " + s19);
    }

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    int longest = 0;
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    for (int k = 0; k < arr20.length; k++) {
      System.out.println(arr20[k]);
    }


     for (int i = 0; i < arr20.length; i++) {
       if (arr20[i + 1].length() > arr20[i].length()) {
         longest = arr20[i + 1].length();
        } else {
          longest = arr20[i].length();
        }
      }
      System.out.println("Ans 20: longest=" + longest);



  
  }
}