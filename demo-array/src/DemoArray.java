import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class DemoArray {
  public static void main(String[] args) {
    // assign int value 3 into int varibale
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;

    // ! array []
    // right hand side -> creating an array with size 3. (values)
    // left hand side -> assign int array object to int array (varibale)
    int[] arr = new int[3];   // now, we got 3 int boxes able to store 3 int values.

    // write.
    // First box (index)  0,1,2...for store
    arr[0] = 3;
    // second box
    arr[1] = 4;
    // third box
    arr[2] = -7;

    for (int i = 0; i < arr.length; i++){   // 0,1,2
      System.out.println(arr[i]); // 3,4,-7
    }

    // Question: int array with size 5.
    // 10, 7, 4, -100, 6
    int[] arr2 = new int[5];  // 0,1,2,3,4  (No 5 Flat)  arr 代表 '樓'；[] 代表 '室';
    arr2[0] = 10;
    arr2[1] = 7;
    arr2[2] = 4;
    arr2[3] = -100;
    arr2[4] = 6;

    // Question: double array with size 4.
    // assign 4 double values into the array
    double[] arr3 = new double[4];
    arr3[0] = 11.5;
    arr3[1] = 20.2;
    arr3[2] = 5.3;
    arr3[3] = -100.4;


    // read
    System.out.println(arr3[0]); // 11.5
    System.out.println(arr[0]);  // 3
    System.out.println(arr2[0]);  // 10

    double amount = 99.9;
    arr3[0] = amount;  // assign double value into a double variable
    System.out.println(arr3[0]);  //99.9

    // String array
    // size 3, with 3 string value
    String[] arr4 = new String[3];
    arr4[0] = "hello";
    arr4[1] = "goodbye";
    arr4[2] = "Bye Bye!!!";
    System.out.println(arr4[0]); // hello


    // double array, for loop + sysout print out values

    double[] arr8 = new double[6];
    arr8[0] = 10.9;
    arr8[3] = 14.1;
    arr8[5] = 99.9;
    for (int i = 0; i < arr8.length; i++){
      System.out.println(arr8[i]);  // 10.9, 0.0, 0.0, 14.1, 0.0, 99.9
    }


    // add 1.5 to all array values
    for (int i = 0; i < arr8.length; i++){
      arr8 [i] =arr8[i] + 1.5;  // arr8[i] += 1.5;
      System.out.println(arr8[i]);  // 12.4, 1.5, 1.5, 15.6, 1.5, 101.4
    }


    // ! for + if
    // print out those values > 100
    for (int i = 0; i < arr8.length; i++){
      if (arr8[i] <= 100){
        continue;
      }
      System.out.println(arr8[i]);  // 101.4
    }


    // int array
    // Find even number, and then print out "Age = x"
    int[] ages = new int[4];
    ages[0] = 80;
    ages[1] = 14;
    ages[2] = 19;
    ages[3] = 65;
    for (int i = 0; i < ages.length; i++){
      if (ages[i] % 2 == 0) {
        System.out.println("Age=" + ages[i]);  // 80, 14
      }
    }

    // ! array + for + if
    // find the max value in the array
    int[] numbers = new int[6];
    numbers[0] = 3;
    numbers[1] = 10;
    numbers[2] = -5;
    numbers[3] = 25;
    numbers[4] = 0;
    numbers[5] = 30;
    int maxNumber = 0;  // int maxNumber = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > maxNumber) {
        maxNumber = numbers[i];
      }
    }
    System.out.println("Max.value=" + maxNumber);  // 30
 

    // find min. salary
    int[] salaries = new int[4];
    salaries[0] = 14000;
    salaries[1] = 19000;
    salaries[2] = 21000;
    salaries[3] = 34000;
    int minBox = Integer.MAX_VALUE;
    for (int i = 0; i < salaries.length; i++){
      if (salaries[i] < minBox){
        minBox = salaries[i];
      } 
    }
    System.out.println("Min.value=" + minBox); // 14000

    //  John, Steven, Eric
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Steven";
    names[2] = "Eric";
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // Find the longest name in the array      // String length
    String longestName = "";   // ⭐️ empty String 容許暫時無內容   有機會人名字數相同，所以 "" 
    for (int i = 0; i < names.length; i++){  // int Vs String 不可以❌，names 是String,要把右邊轉 int
      if (names[i].length() > longestName.length()){ // String str 字串
        longestName = names[i];
      }
    }
    System.out.println("Longest name = " + longestName);  // Steven
    
    // nums is an array, a set of int values  一堆數字
    // Print out the first even number -> break
    int[] nums = new int[4];
    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    int firstEven = 0;
    for (int i = 0; i < nums.length; i++){    // array length,  index=0,1,2,3
      if (nums[i] % 2 == 0){
        firstEven = nums[i];  // without 'break', Ans should be 10 (array lenght -> 4)
        break; //  ** Exit for loop
      }
    }
    System.out.println("First even number=" + firstEven); // 8   唔加 break, result is 10


    // String directions = 
    char [] directions = new char[5];     // char = character 英文字母/符號
    // l -> left
    // r -> right
    directions[0] = 'l';
    directions[1] = 'l';
    directions[2] = 'r';
    directions[3] = 'l';
    directions[4] = 'r';
    // l -> score + 3
    // r -> score - 2
    // find the final score ?

    int scoreAmt = 0;
    for (int i = 0; i < directions.length; i++){
      if (directions[i] == 'l'){
        scoreAmt += 3;
      } else {
        scoreAmt -= 2;
      }
    }
    System.out.println("Score amount=" + scoreAmt);  // 5  (3+3-2+3-2)

    // ! Swapping 交換位置
    int w1 = 2;
    int w2 = 3;

    int backup = w1;   // open more one box to store w1 first
    w1 = w2;
    w2 = backup;
    System.out.println("w1=" + w1);  // 3
    System.out.println("w2=" + w2);  // 2

    // ! Ranking Logical  排序
    int[] marksix = new int[6];
    marksix[0] = 5;
    marksix[1] = 20;
    marksix[2] = 47;
    marksix[3] = 43;
    marksix[4] = 39;
    marksix[5] = 2;
    for (int i= 0; i < marksix.length; i++){
      System.out.println(marksix[i]);
    }
    // 5 20 47 43 39 2

    // !i = 0, j = 0,1,2,3,4,5
    // round 1: 5 vs 20 (20 > 5, no swap)   -> 5 20 47 43 39 2 (run 6)
    // round 2: 20 vs 47 (20 > 47, no swap) -> 5 20 47 43 39 2
    // round 3: 47 vs 43 (47 > 43, swap)    -> 5 20 43 47 39 2
    // round 4: 47 vs 39 (47 > 39, swap)    -> 5 20 43 39 47 2
    // round 5: 47 vs 2 (47 > 2, swap)      -> 5 20 43 39 2 47
 
    // ! i = 1, j = 0,1,2,3,4 (marksix[4+1] > marksix[4])
    // round 1: 5 vs 20 (20 > 5, no swap)   -> 5 20 43 39 2 47 (run 5,skip last 47)
    // round 2: 20 vs 43 (43 > 20, no swap) -> 5 20 43 39 2 47
    // round 3: 43 vs 39 (43 > 39, swap)    -> 5 20 39 43 2 47
    // round 4: 43 vs 2  (43 > 2, swap)     -> 5 20 39 2 43 47

    
    // Finally -> 2 5 20 39 43 47
    // ! Sorting  (把最大數字，搬到最尾) (5 x 5) -> Bubble sort
    // Swapping   (與 if 無關)
    int temp = -1;   // -1 是有問題，但這題暫時可用
    for (int i = 0; i < marksix.length - 1; i++){  // i = 0(how many numbers I need to swap)
      for (int j = 0; j < marksix.length - i - 1; j++){  // j = 0,1,2,3,4 | 0,1,2,3
        if (marksix[j + 1] < marksix[j]) {    // 👈🏻 這個不是比較大小，而是決定是否做 swapping
          temp = marksix[j + 1];
          marksix[j + 1] = marksix[j];
          marksix[j] = temp;
        }
      }
     }
     for (int i = 0; i < marksix.length; i++) {
      System.out.println(marksix[i]);
     }

    // 2 5 20 39 43 47


    // ! counting
    char[] chs = new char[] {'o','p','a','p'};    // char array
    // count the number of 'p'
    int count = 0;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'p') {
        count++;
      }
    }
    System.out.println(count + "=count the number of P");  // 2 = count the number of P



    // ! 最優勝方法比起Loop for Loop, n+n, -> n * n 次，亂序;  可數數
    char[] chs2 = new char[] {'o','p','a','p','o'};
    // Unknown how many character, which Qty > 1 -> o and p
    // 2
    int[] counts = new int[26];  // 0-25 先開26個箱，每個箱default '0' = a - a
    for (int i = 0; i < chs2.length; i++){
      int index = chs2[i] - 'a';
      counts[index]++;  // or counts(index) = counts[index] + 1;
      // counts[chs2[i] - 'a']++; -> equals to above 2 rows into 1
    }

    int result = 0;
    for (int i = 0; i < counts.length; i++) {  // start input 'o,p,a,p,o'
      if (counts[i] > 1){
        result++;
      }
     }
     System.out.println(result);  // 2 （即有2個倉大過'1'）


     // Homework:
     // 0 9 1 9 2 0 9 9
     // is there any number appear 3 times or more? 出現3次或以上?
     // true
     int[] countNum = new int[] {0,9,1,9,2,0,9,9};
     result = 0;
     count = 0;
     for (int i = 0; i < countNum.length; i++) {
      if (countNum[i] >= 3){
        count++;
      }
     }
     System.out.println(count); // 4


     //System.out.println(count.charAt(2));

     //System.out.println("the number of " + maxNum + " was appear 3 times or more");
     



     // String[] lastNames = new String[]{"Lau", "Wong", "Chan"};
     // 8 primitives + String







   }
 }
