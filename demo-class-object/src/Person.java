import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight
  // ! Attributes (Instance Variable)
  // Instance means Object
  private double height;
  private double weight;

  // ! constructor
  public Person (){

  }
  // ! all arugment constructor  不可單一加這個，要加埋 Row 9 constructor,else print out problem
  public Person(double height, double weight){
    this.height = height;
    this.weight = weight;
  }

  // getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // getBMI (weight / height^2)
  public double getBMI() { // presentation
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  // getWeightStatus (presentation)
  public String getWeightStatus() {
    double bmi = this.getBMI();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static void main(String[] args) {
    Person p1 = new Person();  // new object
    System.out.println(p1.getHeight()); // 0.0
    System.out.println(p1.getWeight()); // 0.0

    p1.setHeight(1.76);
    p1.setWeight(79);
    System.out.println(p1.getBMI()); // 24.54
    System.out.println(p1.getWeightStatus()); // Overweight

    Person p2 = new Person(1.76, 76);
    System.out.println(p2.getHeight());  // 1.76
    System.out.println(p2.getWeight());  // 76.0
    System.out.println(p2.getBMI());  // 24.54
    



  }
}