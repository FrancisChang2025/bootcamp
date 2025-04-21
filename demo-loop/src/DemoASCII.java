public class DemoASCII {
  public static void main(String[] args) {
    char x = 'a';
    System.out.println(x);  // a

    // char: 0 - 6xxxx   （可儲存的位置，由'0'開始至6萬幾，不是負數起，因為儲字串）
    // int: 2.1b
    int ascii = x;
    System.out.println(ascii);  // 97

    // b
    ascii = 'b';
    System.out.println(ascii); // 98  (97+1)

    // z
    System.out.println(ascii = 'z'); // 122  (97+26-1)

    // "" -> String value
    // '' -> char value   Converted Method-> char可以運算，所以用''放value 找出背後代表數字 char to int進行運算
    char k = '我';
    int tutor = k;
    System.out.println(tutor);   // 25105
    
    char u = '%';
    int q = u;
    System.out.println(q);  // 37

    // char (Math operation)
    // char - char -> int - int      "char must change to int then math operation"
    // ! Converted Method
    System.out.println('b' - 'a');  // Ans: 1 (98 - 97)  or (2 - 1)

    // given a-z, convert to 1-26
    // how ot convert?
    char v = 'z';
    int converted = v - 'a' + 1;   // v - 97 + 1  Assume a-a+1 = 1 / 97-97+1 = 1 for 'a'
    System.out.println(converted);  // 26    (in ASCII = 97 + 26 - 1 = 122)
  }
}
