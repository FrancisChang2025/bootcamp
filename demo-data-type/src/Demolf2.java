public class Demolf2 {
  public static void main(String[] args) {
    // Question: Find the middle char of the string
     // i.e. abcde -> c
     String s3 = "abcde";
     // abcde -> c (5 / 2 -> 2)
     // a -> a (1 / 2 -> 0)
 
     // abcd -> b (4 / 2 -> 2)
     // ab -> a (2 / 2 -> 1)
 
     String s3 = "abcd";
     if (s3.length() % 2 == 1) { // odd length
       System.out.println(s3.charAt(s3.length() / 2));
     } else { // even length
       System.out.println(s3.charAt(s3.length() / 2 - 1));
     }
 
     // odd number
     int x5 = 10;
     // Assignment (right to left)
     boolean isOdd = x5 % 2 == 1;
     System.out.println(isOdd); // true
 
     boolean isLargerThan5 = x5 > 5;
     System.out.println(isLargerThan5); // true
 
     // && -> AND
     if (isOdd && isLargerThan5) {
       System.out.println("It is an odd number and larger than 5.");
     }
 
     // even number and larger than 5
     if (!isOdd && isLargerThan5) {
       System.out.println("It is an even number and larger than 5.");
     }
 
     // Basic approach
     // if (x5 % 2 == 1 && x5 > 5) {
       // System.out.println("basic approach");
     
 
     // || -> or
     if (isOdd || isLargerThan5) {
       System.out.println("It is an odd number OR larger than 5.");
  }
  
}
