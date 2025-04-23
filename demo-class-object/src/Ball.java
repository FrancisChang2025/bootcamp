public class Ball {
  // attributes
  private double size;
  private String colour;

  // constructor
  // ! by default, implicityly empty constructor exists
  // ! but once you define a new constructor, the empty constructor will dismiss (disappear)
  public Ball() {
    // this.size = 3;  
  }

  // Can be more than one constructor
  // ! ALL arguements(primitive) constructor
  public Ball(double size){
    this.size = size;
  }

  // setter
  public void setSize(double size) {
    this.size = size;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }


  // getter
  public double getSize() {
    return this.size;
  }

  public String getColour() {
    return this.colour;
  }

  // ! Not display size actual figure.  
  public String getSizeDesc() {
    if (this.size > 5) {
      return "BIG";
    } else {
      return "SMALL";
    }
  }


  // main (create object, set, get)



  public static void main(String[] args) {
    // "new" associate with constructor
    Ball b1 = new Ball(); // call empty constructor
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());  // SMALL

    Ball b2 = new Ball(10); // call the another constructor
    System.out.println(b2.getSize()); // 10.0

    
  }
}
