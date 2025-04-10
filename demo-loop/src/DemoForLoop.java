public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x);  // 16

        // int base = 2;
        int value = 2;
        for (int i = 0; i < 3; i++) {
            value *= value;    //value = value * base;
        }
        System.out.println(value); // 256

        // n = ?, + 8 (10 times)

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
        // result
        int box = 0;
        for (int i = 0; i < 31; i++){
            if (i % 2 == 1 && i < 21){   //  if (i < 20) {  
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
        // tips: charAt()
        int count = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == 'o') {  // adding range location (length), then count
                count++;
            }
        }
        System.out.println("No. of 'o' are: " + count);  // 4

        // ! break & continue, same result

        // ! for + continue'
        // Approach 1: break (simple if)  'when touch break will be exit loop'
        // Before filter
        for (int i = 0; i < 3; i++){
            System.out.println(i); // 0,1,2
        }

        // Approach 2: continue
        // After filter, may be more conditions
        for (int i = 0; i < 3; i++){
            if (i % 2 == 1){
                continue; // skip the rest of code, goes to i++ 'when touch continue will be stop'
            }
            System.out.println(i); // 0,2
        }

        // ! for + break
        // Approach 1: simple if
        for (int i = 0; i < 3; i++){
            System.out.println(i); // 0,1
        }

        // Approach 2: break
        for (int i = 0; i < 3; i++){
            if (i >= 2){
                break; // skip the rest of code, goes to i++
            }
            System.out.println(i); // 0,1
        }


    }
}
