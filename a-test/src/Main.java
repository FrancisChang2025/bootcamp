public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);  // 55
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
