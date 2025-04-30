public class Candy {
  // How to distinguish 2 RED color of candies.
  // Attributes
  private String color;

  // Constructor
  public Candy(String color) {
    this.color = color;
  }
  // getter
  public String getColor() {
    return this.color;
  }
  // to String
  public String toString() {
    return "Candy(" //
        + "color=" + this.color //
        + ")";

  }
}
