import java.math.BigDecimal;

// ! array -> int[] + String[]
// 1. Finite length

// ! Class is going to solve a problem of "set of different values", Array做唔到，改用 Class解決
public class Circle {
  private double radius; // 7
  private String color; // Yellow       (新特徴 入 class)

  public void setColor(String color) {
    this.color = color;    // this 代表第一人稱
  }

  // c1.setColor("RED");
  // c1.getColor();
  // c2.getColor();
  public String getColor() {
    return this.color;
  }

  public char getColor2() {
    return this.color.charAt(0);  // 取 color 的第一個字母
  }

  public int getColor3() {
    if (this.color.equals("RED")) {
      return 1;
    } else if (this.color.equals("YELLOW")) {
      return 2;
    }
    return 3;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  // area (presentation)
  // radius * radius * pi
  public double area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }


  // return "BIG" (>= 5.0) or "SMALL"
  public String getSizeStatus() {  //唔好用🚫 isSize (Boolean),雖則這問是否大過，公司有系統才考慮用
    return this.area() >= 5.0 ? "BIG" : "SMALL";  // 新寫法，如果>5，print'BIG',else'SMALL'
                         // ! 👆🏻'?' = else
  }

  public static void main(String[] args) {
    System.out.println(Math.PI); // 3.14159....
    Circle c1 = new Circle();
    c1.setRadius(3.0);
    System.out.println(c1.getRadius());
    System.out.println(c1.area());

    System.out.println(c1.getSizeStatus()); // BIG   （See R52 class)

    Circle c2 = new Circle();
    c2.setRadius(1.0);
    System.out.println(c2.getSizeStatus()); // SMALL

    Circle c3 = new Circle();
    c3.setColor("YELLOW");
    System.out.println(c3.getColor()); // YELLOW
    System.out.println(c3.getColor2()); // Y     (See R22 class)

    c2.setColor("RED");
    System.out.println(c2.getColor()); // RED
    System.out.println(c2.getColor2()); // R
  }
}