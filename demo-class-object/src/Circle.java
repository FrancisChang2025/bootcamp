import java.math.BigDecimal;

public class Circle {
  private double radius;


  // Setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Getter
  public double getRadius() {
    return this.radius;
  }

  // area (presentation)
  // radius * radius * pi
  public double area() {    // '()' 就用家，預計 int, string, byte...etc.
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }


  public static void main(String[] args) {
    System.out.println(Math.PI);   // 3.141592653589793

    Circle c1 = new Circle();
    c1.setRadius(3.0);
    System.out.println(c1.getRadius());  // 3.0
    System.out.println(c1.area());    // 28.274333882308138
  }
}
