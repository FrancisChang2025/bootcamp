public class Bag {
  private Ball[] balls;  // many balls using array[]

  public Bag() {
    this.balls = new Ball[5];
  }

  public int getSize() {
    return this.balls.length;
  }
  // ! Presentation & Checking isEmpty() & isFull()
  public boolean isEmpty() {
    for (int i = 0; i < this.balls.length; i++){
      if (this.balls[i] != null) {   // one ball not empty
        return false;
      }
    }
    return true;
  }

  public boolean isFull() {
    for (int i = 0; i < this.balls.length; i++){
      if (this.balls[i] == null) {         // 👈 'null'
        return false;
      }
    }
    return true;
  }

  public boolean add(Ball newBall) {  // Using boolean, checking 成功與否
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        this.balls[i] = newBall;
        return true;
      }
    }
      return false;
  }

  public Ball pick(int index) { // student thinking // 要清空，否則有問題 R46-48  "remove(int index)"
    if (index < 0 || index >= this.balls.length)
     return null;
    // return this.balls[index];
    Ball target = this.balls[index];
    this.balls[index] = null;
    return target;      // R49-51 抄底 & 清空變回 null
  }

  public static void main(String[] args) {
    // Primitive (default values)
    // Class (Java: String, BigDecimal....    Our: Ball, Cat..etc) -> (default: null)
    String s = null; 
    System.out.println(s.length()); // s is not abble to find the string object.
  }
}
