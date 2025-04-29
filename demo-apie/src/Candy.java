public class Candy {
  // Attributes
  private String color;
  private String flavor;
  private double weight; // in grams

  // Constructor
  public Candy(String color, String flavor, double weight) {
      this.color = color;
      this.flavor = flavor;
      this.weight = weight;
  }

  // Getters
  public String getColor() {
      return color;
  }

  public String getFlavor() {
      return flavor;
  }

  public double getWeight() {
      return weight;
  }

  // Method to display candy information
  public void displayInfo() {
      System.out.println("Candy Color: " + color);
      System.out.println("Flavor: " + flavor);
      System.out.println("Weight: " + weight + " grams");
  }

  // Main method for testing
  public static void main(String[] args) {
      Candy candy = new Candy("Red", "Chocolate", 50.0);
      candy.displayInfo();
  }
}
