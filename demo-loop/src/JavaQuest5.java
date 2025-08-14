public class JavaQuest5 {
  public static void main(String[] args) {
    /**
   * Expected output:
   * The index of the last character of c is 11
   */
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // Approach 1:
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == target) {
        System.out.println("Approach 1: the last character of c = " + i);
        break;  // To stop searching once the last 'c' is found
      }
    }
    // Approach 2:
    int lastIndex = str.lastIndexOf('c');
    if (lastIndex != -1) {
      System.out.println("Approach 2: the last character of c = " + lastIndex);
    }

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        System.out.println("Found.");
      } else {
        System.out.println("Not Found.");
      }
      break;
    }
  }
}
