import java.awt.Color;
import java.awt.SystemTray;
import java.nio.file.SecureDirectoryStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private int num;
  private Color color;

  // constructor
  public Ball (int num, Color color) {
    this.num = num;
    this.color = color;
  }

    // BLUE -> YELLOW -> RED
  @Override
  public int compareTo(Ball ball) {
    // -1 -> this go first
    // 1 -> ball go first
    if (this.color == Color.BLUE)
      return -1;
    if (ball.getColor() == Color.BLUE)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    return 1;
    // if (ball.getColor() == Color.YELLOW)
    //   return 1;
    // return 1;
  }

  @Override
  public int compareTo(Ball ball) {
    // -1 -> return this
    if (this.num > ball.getNum())
      return -1;
    return 1;
    }

  // getter
  public int getNum(){
    return this.num;
  }

  public Color getColor() {
    return this.color;
  }

  public void setNum(int num){
    this.num = num;
  }

  public static enum color {
    RED, BLUE, YELLOW;
  }

  @Override
  public String toString() {
    return "Ball(" + "num=" + this.num + ",color=" + this.color.name() + ")";
  }

  public static void main(String[] args) {
    // 3 Balls in ArrayList (diff in color and value)
    List<Ball> balls = new ArrayList<>();
    Ball b1 = new Ball(3, Color.BLUE);
    balls.add(b1);
    balls.add(new Ball(-10, Color.YELLOW));  //  from 1 change to -10
    balls.add(new Ball(-5, Color.RED));

    b1.setNum(7);
    System.out.println(b1.getNum());  // 7
    System.out.println(balls.get(0).getNum());   // 7, not 3

    balls.get(0).setNum(9);
    System.out.println(b1.getNum());   // 7, not 9

    // for-each print balls
    for (Ball ball : balls) {
      System.out.println(ball);
    }

    // Java default Sorting Usage:  由細至大排列
    Collections.sort(balls);  // Collections.sort() requires a class fulfill Comparable Interface.
    System.out.println(balls);
   // Sorted by num descending order:
    // [Ball(num=9,color=BLUE), Ball(num=-5,color=RED), Ball(num=-10,color=YELLOW)]
    // Sorted by color: BLUE -> YELLOW -> RED
    // [Ball(num=9,color=BLUE), Ball(num=-10,color=YELLOW), Ball(num=-5,color=RED)]

    Collections.sort(balls, new SortedByNum());
    System.out.println(balls);
    // [Ball(num=-10,color=YELLOW), Ball(num=-5,color=RED), Ball(num=9,color=BLUE)]
  }
}
