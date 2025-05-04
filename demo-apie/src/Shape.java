import java.math.BigDecimal;
import javax.swing.event.PopupMenuListener;

public abstract class Shape { 
  // Parent Class - 
  // 1. concrete class - can be "new"
  // 2. abstract class - cannot be "new"

  // Abstract Class:
  // 1. May contain abstract method

  // Parent Class Attributes:
  private String color;
  // Child inherit attributes, instance methods
  // But cannot inherit constructor

  // constructor
  // super("RED")
  public Shape(){

  }
  public Shape(String color){
    this.color = color;
  }
  // getter setter
  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public abstract double area();  // 虚構 -> Circle.java R19-24 write area formula


  public static void main(String[] args) {
    // Shape shape = new Shape();   // keep empty, write R8-9
    Circle circle = new Circle(3.0, "RED");
    System.out.println(circle.getColor());  // RED
    System.out.println(circle.getRadius());  // 3.0

    // Shape[] shapes
    Shape[] shapes = new Shape[3];
    // shapes[0] = new Shape()     -> Can't
    shapes[0] = new Circle(3.5, "RED"); // 38.48
    shapes[1] = new Rectangular("RED", 3.0, 5.0); // 15.0
    shapes[2] = new Circle(4.0, "RED"); // 50.2
    // Circle Rectangular


    // calculate the total area of all shapes.
    // Shape (Parent class) ensures child class has area()
    BigDecimal sum = new BigDecimal(0.0);
    for (int i = 0; i < shapes.length; i++) {
      sum = sum.add(BigDecimal.valueOf(shapes[i].area()));
    }
    System.out.println(sum.doubleValue());;  // 103.74999246391165
  }
}
