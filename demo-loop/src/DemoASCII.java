public class DemoASCII {
  public static void main(String[] args) {
    char x = 'a';
    System.out.println(x);  // a

    // char: 0 - 6xxxx（可儲存的位置，由'0'開始至6萬幾，不用睇負數量，不會用到，因為儲字串）
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
    System.out.println(tutor);  // 25105
    
    char u = '%';
    int q = u;
    System.out.println(q);  // 37

    // char (Math operation) 數學運算 👈 
    // char using Single quotes '' 原因, char 自動升級為 int 值, 透過 ASCII
    // char - char -> int - int    [char must change to int then math operation]
    // ! Converted Method     👈 當 char 值 執行數學運算時，它們會自動轉換為 int 值。
    System.out.println('b' - 'a');  // 1 👈 (98 - 97) or (2 - 1)

    // given a-z, convert to 1-26
    // how ot convert?
    char v = 'z';
    int converted = v - 'a' + 1;   // v - 97 + 1  Assume a-a+1 = 1 / 97-97+1 = 1 for 'a'
    System.out.println(converted);  // 26 👈 (in ASCII = 97 + 26 - 1 = 122)
  }
}
