public class DemoIf3 {
  public static void main(String[] args) {
    // Question: Counting
    String s5 = "hello";   // index=0,1,2,3,4
    // Count how many character 'o' in s5.
    int counter = 0;
    for (int i = 0; i < s5.length(); i++) {
      if (s5.charAt(i) == 'o') {
        counter++;   // equal to -> counter = i + 1; 
      }
    }
    System.out.println(counter);  // 1

    // ! For loop     
    // 3 statement : for ( ; ; ) {}
    // i) for (initialization) only run first times; can't accept '1' for 'i' for first.
    // ii) continue conditional 'if middle continue is true, will loop again';  
    // iii) i + 1 or i++ or i--  for (+, -, *, /, %)
    
    // Method 1:
    for (int i = 0; i < 3; i = i + 1) { // i=0,1,2  (Ans: Hello Baby !!, Run 3 times and stop)
      System.out.println("Hello Baby !!");
    }
    // Method 1 (Steps):
    // Step 1: int i = 0
    // Step 2: check if i < 3 -> true, next step
    // Step 3: print hello
    // Step 4: i = i + 1 -> 1
    // Step 5: check if i < 3 -> true, next step
    // Step 6: print hello
    // Step 7: i = i + 1 -> 2
    // Step 8: check if i < 3 -> true, next step
    // Step 9: print hello
    // Step 10: i = i + 1 -> 3
    // Step 11: check if i < 3 -> false -> exit the loop

    // Method 2:   (Ans: Hello, goodbye    run 3 times and stop)
    int count = 3;
    for (int i = 0; i < count; i = i + 1) { // i=0,1,2  (Run 3 times)
      System.out.println("Hello");
      System.out.println("goodbye");
    }

  // ! Normal, repect action unlimit without for Loop
    // if (s5.charAt(0) == 'o'){
    // counter = counter + 1;
    // }
    // Ans: 2

    s5 = "hello world";
    counter = 0;
    for (int i = 0; i < s5.length(); i = i + 1){  // 0,1,2,3,4,5,6,7,8,9,10
      System.out.println("i=" + i);
      if (s5.charAt(i) == 'o') {
        System.out.println("hello");
        counter = counter + 1;
        }
      }
     System.out.println("Number of o = " + counter);  // 2


  }
}
