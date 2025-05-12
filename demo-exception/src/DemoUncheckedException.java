import java.text.SimpleDateFormat;

public class DemoUncheckedException {
  public static void main(String[] args) {
    // avoidable
    int[] arr = new int[3];  // 0-2

    // Case 1:
    int index = 2;
    if (index < 0 || index >= arr.length)
      return;
    System.out.println(arr[index]); // 0

    // unavoidable
    int idxInputtedByUser = -1;
    try {
      System.out.println("start to try....");
      System.out.println(arr[idxInputtedByUser]);
      System.out.println("End the try....");  // ! skipped
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Root cause:" + e.getMessage());
      System.out.println("hello");
    }


    // Case 2:
    String s = "hello";
    if (s != null);
    System.out.println(s.charAt(3));  // l

    // Case 3:
    // ! Math
    int count = 0;
    if (count != 0) {
    int result = 10 / count;
    } else {
      result = 1;
    }




    // String -> Integer
    String yearInputedByUser = "2025s";
    Integer year = null;
    try {
        year = Integer.valueOf(yearInputedByUser);
        System.out.println(year);
        // int[] arr1 = new int[] {-3};
        // System.out.println(arr1[0]);
    } catch (NumberFormatException e) {
        System.out.println("The input is not valid.");
    }

    // ! 1. "Unchecked" exception -> Java won't force you to catch during compile time.
    // year = Integer.valueOf("abc");

    // ! "Checked" exception
    String input = "2025-05-12"
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    Date Date = formatter.parse(input);

  }
}
