public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x);  // 16

        int base = 2;
        int value = 2;
        for (int i = 0; i < 3; i++) {
            value = value * base;
        }
        System.out.println(value);  // 16
        // Index: 0, Round 1 of i: 2 * 2 = 4
        // Index: 1, Round 2 of i: 4 * 2 = 8
        // Index: 2, Round 3 of i: 8 * 2 = 16


        // int base = 2;
        int value1 = 2;
        for (int i = 0; i < 3; i++) {     // Index: 0,1,2
            value1 *= value1;    //value = value * base;
        }
        System.out.println(value1); // 256  
        // Index: 0, Round 1 of i: 2 * 2 = 4
        // Index: 1, Round 2 of i: 4 * 4 = 16
        // Index: 2, Round 3 of i: 16 * 16 = 256

        // n (base) = ?, + 8 (10 times)

        // Find Max number 
        int num1 = 9;
        int num2 = 17;

        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        System.out.println("the Max number is: " + max);   // 17

        // 0 - 100, Find the largest ODD number, which is < 90
        // using for LOOP to complete

        // Step 1: Data set 1-100 先抽出 ODD number
        // Step 2:  < 90
        // Step 3: consider 現有數是大過現在盒內的數，如果是就取替
        int maxOdd = -1;
        for (int i = 0; i < 101; i++){
            if(i % 2 == 1 && i < 90 && i > maxOdd) {
                maxOdd = i;
            }
        }
        System.out.println("The largest ODD number is: " + maxOdd); // 89


        // 0 - 20, sum up all even numbers
        // 0 + 2 + 4..... + 20
        int sumUpEven = 0;
        for (int i = 0;  i < 21; i++){  // ! for Loop to found out range
            if (i % 2 == 0) {
                sumUpEven += i;
            }
        }
        System.out.println("Sum up all even numbers is " + sumUpEven); // 110

        // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
        // result ?
        int box = 0;
        for (int i = 0; i < 31; i++){
            if (i % 2 == 1 && i < 20){   //  if (i < 20) {  加多個 for loop 分開做都可以
                box += i;
            } else {
                if (i % 2 == 0 && i >= 20){    // if (i % 2 == 0)
                    box += i;
                }
            }
        }
        System.out.println("The sum number is: " + box);  // 250


        // ! Searching
        String s1 = "welcome to bootcamp.";
        // 1. Find the number of 'o'
        // tips: for + charAt()
        int count = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("No. of 'o' are: " + count);  // No. of 'o' are: 4

        // ! break & continue, same result

        // Before filter  (Without use break or contiue)
        for (int i = 0; i < 3; i++){
            System.out.println(i); // 0,1,2
        }

        // ! for + continue
        // Approach 1: continue (simple if) (When touch continue, directly go to i++, ignore next remainder rows)
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(i);  // 0,2 (Ans index are EVEN only)
            }
        }

        // Approach 2: continue  (If ture, 就繼續做 next step, Else, false 見到 continue 回到 for...)
        // After filter, may be more conditions 攔韱條件有多項 (Select this Approach)
        // e.g. Even number ONLY.  (Skip Odd number)
        for (int i = 0; i < 3; i++){
            if (i % 2 == 1){
                continue; // skip the rest 餘下 of code, goes to i++ 'when touch continue will be stop'
            }
            System.out.println(i); // 0,2   (true,才入這裡， false touch continue, skip 這裡，回到 i++)
        }

        // ! for + break
        // Approach 1: break (simple if)  'when touch break will be exit loop'
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(i); // 0,1
            }
        }

        // Approach 2: break    (Target 一出現結果就停止 Loop, 跳離成個 ForLoop (包括 i++), 繼續 next step)
        for (int i = 0; i < 3; i++){
            if (i >= 2) {
                break; // skip the rest of code, goes to i++
            }
            System.out.println(i); // 0,1
        }

     // ! 20250411 after DemoOperator.java, try below
     // Question: sum up 5 - 15 -> result
     // the product of 16 - 20 -> result2  雙乘
     // Single for loop  (可用多個 For Loop, 但這題 要求只能用一個 For Loop 做到)
     int total = 0;
     int product = 1;
     for (int i = 0; i < 21; i++) {
       if (i >= 5 && i <= 15) {
         total += i;
         continue;      // 👈 add 'continue' means result 出現即停 STOP
       }
       if (i >= 16 && i <= 20) {
         product *= i;
       }
     }
     System.out.println("SumUp 5 - 15 = " + total);   // 110
     System.out.println("Product 16-20 = " + product);  // 1860480



     for (int i = 10; i >= 0; i--) {
        System.out.println(i);  // 10,9,8,7,6,5,4,3,2,1,0 (Round 11 次, 除非中間改為 i>0 就 round 10 次)
     }

     // ! Nested Loop  (Loop 包住 Loop) sample Supermarket 購買記錄
     // i=0, j=0,1
     // i=1, j=0,1
     // i=2, j=0,1
     for (int i = 0; i < 3; i++){  // run 0,1,2  (3 times)
        for (int j = 0; j < 2; j++) {   // run 0,1, (2 times)
            System.out.println("hello");  // 6 times
            System.out.println("i=" + i + "j=" + j);
        }
     }


    }
}
