import java.util.Scanner;

public class ExeciseGuessingGame {      //GAME： 開口中 （3人玩家）
  public static void main(String[] args) {
    // ! How about 3 Users?
    // 1 - 100
    // Bomb 💣 = 67 💥

    // User A: 93 (1-100)
    // User B: 49 (1 - 92)
    // User C: 66 (50 - 92)
    // User A: 80 (67 - 92)
    // User B: 68 (67 - 79)
    // User C: 67 (67 - 67) -> User C Loser.

    int bomb = 67; // random number
    // while loop  (Consider use tools. e.g. For Loop / While Loop)
    // Scanner (Collect user input)
    // ! User A, B and C ? counter -> User A / B / C
    // Adjust the range of numbers
    // Prompt Question: "Please input a number:" (Asking which User?)
    // continue condition

    int input = -1;
    int min = 1;
    int max = 100;
    Scanner scanner = new Scanner(System.in);
    int round = 0;
    char user = 'A';
    //int userCount = 0;  // Counter for users
    //int maxUsers = 3;   // Maximum number of users

    while (input != bomb) {
      if (round % 3 == 0) {
        user = 'A';
      } else if (round % 3 == 1){
        user = 'B';
      } else if (round % 3 == 2){
        user = 'C';
      }
      System.out.println("User " + user + ", Please input a number between " + min + "-" + max);
      input = scanner.nextInt();
      
      // Validate input if it is valid
      if (input < min || input > max) {
        System.out.println("Invalid Input.");
        continue;
      } 
      // Adjust the range of numbers
      if (input >= min && input <= max) {
        if (input > bomb) {
          max = input - 1;
        } else {
          min = input + 1;
        }
      }
      round++;
    }

    while (input == bomb) {
      if (user == 0) {
        user = 'A';
      } else if (user == 1) {
        user = 'B';
      } else if (user == 2) {
        user = 'C';
      }
    System.out.println("💥 Game end. User " + user + " Loser.");
    scanner.close();
    break;
    }
    
  }
}
