public class SuperString {
  private char[] chs;

  public String getString() {
    return String.valueOf(this.chs);   // from char [] to String
  }

  // You define your own way to store the String value
  public void setString(String str) {
    // this.chs = str.toCharArray();
    this.chs = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      this.chs[i] = str.charAt(i);
    }
  }
  
  public char charAt(int index){
    return this.chs[index];
  }

  // this vs ss
  public boolean equals(SuperString ss) {
    if (this.chs.length != ss.getString().length()) {
      return false;
    }
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] != ss.getString().charAt(i)) {
        return false;
      }
    }
    return true;
  }

  // HW: replace(char x, char y)

  public static void main(String[] args) {
    SuperString ss1 = new SuperString();
    ss1.setString("abc");
    System.out.println(ss1.charAt(0));   //a

    SuperString ss2 = new SuperString();
    ss2.setString("def");
    System.out.println(ss2.charAt(0));  //d

    SuperString ss3 = new SuperString();
    ss3.setString("hello");
    System.out.println(ss3.charAt(0));   //h

    System.out.println(ss1.equals(ss2));  // false

    SuperString ss4 = new SuperString();
    ss4.setString("abcd");
    System.out.println(ss1.equals(ss4));  // false

    SuperString ss5 = new SuperString();
    ss5.setString("abc");
    System.out.println(ss1.equals(ss5));  // true

  }
 }
