public class Triangle extends Shape{
  private double base;
  private double height;
  private double sideA;
  private double sideB;
  private double sideC;

  // Constructor
  public Triangle(double base, double height, double sideA, double sideB, double sideC) {
      this.base = base;
      this.height = height;
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
  }

  // getter, setter
  public double getBase() {
    return this.base = base;
  }

  // Method to calculate the area
  public double calculateArea() {
      return 0.5 * base * height;
  }

  // Method to calculate the perimeter
  public double calculatePerimeter() {
      return sideA + sideB + sideC;
  }

  // Main method for testing
  public static void main(String[] args) {
      Triangle triangle = new Triangle(5, 10, 5, 6, 7);
      System.out.println("Area: " + triangle.calculateArea());  // Area: 25.0
      System.out.println("Perimeter: " + triangle.calculatePerimeter()); // Perimeter: 18.0
  }
}
