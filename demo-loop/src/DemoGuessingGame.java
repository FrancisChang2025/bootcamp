import java.util.Scanner;

public class DemoGuessingGame {     //GAME： 開口中 （2人玩家）
  public static void main(String[] args) {
    // 1 - 100
    // Bomb = 67

    // User A: 93 (1-100)
    // User B: 49 (1 - 92)
    // User A: 66 (50 - 92)
    // User B: 68 (67 - 92)
    // User A: 67 (67 - 67) -> User B win.

    int bomb = 67;       // random number
    // while loop
    // Scanner (Collect user input)
    // ! User A and B ?   用 counter -> User A / B
    // Adjust the range of numbers
    // Prompt Question: "Please input a number:"
    // continue condition

    int input = -1;
    int min = 1;
    int max = 100;
    Scanner scanner = new Scanner(System.in);
    int round = 0;
    char user = 'A';

    while (input != bomb) {
      if (round % 2 == 0) {   // 設單數，雙數 round, 單是A，雙是B
        user = 'A';
      } else {
        user = 'B';
      }
      System.out.println("User " + user + ", Please input a number between " + min + "-" + max);
      input = scanner.nextInt();
      // Validate input if it is valid  e.g. Input 93 -> compara with Bomb 67
      // Adjust the range of numbers      from 1-100 to 1-92 

      // Approach 1: when user not select range, stop & game try in same user (Checking Input is correct)
      if (input >= min && input <= max) {
        if (input > bomb) {
          max = input - 1;
        } else {
          min = input + 1;
        }
      // Approach 2: change using For Loop + 'continue', same result approach 1
      // 以下 Loop 是 Checking Input 是否正確，如超出範圍，電腦會從新再問同一玩家，直至答中符合範圍內的數字才繼續下一位
      for (int i = 0; i < 101; i++) {
        if (input < min || input > max) {
          continue;            // 此處不能用 break, 因為表示，入錯就跳走 Loop，next 繼續,但實際是要問同一人再答
        }
      }
        round++;      // Users input 正確數字，在範圍內，但不是 💣 ，所以下一位繼續
      }
    }
    // Assume: round 1, User A, Input '67', lose
    if (round % 2 == 1) {
      user = 'B';
    } else {
      user = 'A';
    }
    System.out.println("Game end. User " + user + " win.");
    scanner.close(); // Close the scanner

    // ! How about 3 Users?
  }
}