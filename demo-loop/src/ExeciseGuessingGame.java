import java.util.Scanner;

public class ExeciseGuessingGame {
  public static void main(String[] args) {
    // ! How about 3 Users?
    // 1 - 100
    // Bomb = 67

    // User A: 93 (1-100)
    // User B: 49 (1 - 92)
    // User C: 66 (50 - 92)
    // User A: 80 (67 - 92)
    // User B: 68 (67 - 79)
    // User C: 67 (67 - 67) -> User C Loser.

    int bomb = 67; // random number
    // while loop
    // Scanner (Collect user input)
    // Adjust the range of numbers
    // Prompt Question: "Please input a number:"
    // continue condition

    int input = -1;
    int min = 1;
    int max = 100;
    Scanner scanner = new Scanner(System.in);
    int round = 0;
    char user = 'A';
    int userCount = 0;  // Counter for users
    int maxUsers = 3;   // Maximum number of users

    while (input != bomb) {
      if (round % 2 == 0) {
        user = 'A';
      } else if (round % 2 == 1){
        user = 'B';
      } else {
        user = 'C';
      }
      System.out.println("User " + user + ", Please input a number between " + min + "-" + max);
      input = scanner.nextInt();
      // Validate input if it is valid
      // Adjust the range of numbers
      for (int i = 0; i < 101; i++) {
        if (input < min || input > max) {
          continue;
        }
      }
        round++;
      }
    }
    // User A, round 1, lose
    if (round % 2 == 1) {
      user = 'B';
    } else {
      user = 'A';
    }
    System.out.println("Game end. User " + user + " Loser.");
    scanner.close();



  }
}
