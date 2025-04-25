public class text1 {
  public static void main(String[] args) {
    int scoreOfString(string s) {
      int sum = 0;
      for (int i = 0; i < s.length; i++){
          if (s.charAt(i) == 's')
              sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
      }
      return sum;
  }

  }
}
