public class Ball {
  private double size;
  private String colour;

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
    Ball b1 = new Ball();
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());


    b1.getSize();   // SMALL
    
  }
}
