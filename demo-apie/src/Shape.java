public abstract class Shape { 
  // Parent Class - 
  // 1. concrete class - can be "new"
  // 2. abstract class - cannot be "new"

  // Abstract Class:


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

  public abstract double area();  // 虚構 -> Circle.java R19-24 write formula


  public static void main(String[] args) {
    // Shape shape = new Shape();   // keep empty, write R8-9
    Circle circle = new Circle(3.0, "RED");
    System.out.println(circle.getRadius());
  }

  
}
