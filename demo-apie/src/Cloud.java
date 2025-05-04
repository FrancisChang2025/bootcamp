public class Cloud extends Shape {
  private double radius;  // 假設雲的半徑

  // Abstract class
  public Cloud(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius; // 假設雲的面積為圓形，使用公式 A = πr²
  }
 
}
