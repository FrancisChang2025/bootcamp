public class DemoInteger {
  public static void main(String[] args) {
    Integer x = 3;  // autobox
    Integer y = 128;  // autobox

    // check if y > x?  不是 Primitive
    System.out.println(y.compareTo(x) > 0);  // true
    System.out.println(y > x);  // true  (Not suggestion use this write)

    Integer y2 = 128;
    System.out.println(y.compareTo(y2));  // 0  👈 比較2者的值，'0'是正確
    System.out.println(y == y2);   // false, because y and y2 are different objects

    Integer x2 = 3;
    System.out.println(x == x2);  // true (why not is false?) 睇 book 'Internal Cache' & see notes picture

    Integer x3 = new Integer(3);  // 強行 object, add 'new' -> auto convert to Integer
    System.out.println(x == x3);  // false

    Integer x4 = Integer.valueOf(3);  // use 'valueOf' 好過用強行 new 方法去做
    System.out.println(x == x4);  // true

    // how about < -128 or > 127 ?  out of range  -> Java 只預咗那 256個數字，超出就話錯
    Integer y3 = Integer.valueOf(128);
    System.out.println(y2 == y3);  // false   // 128 超出範圍，JAVA視為new object,不可強行用現有 '128'object.

  }
}
