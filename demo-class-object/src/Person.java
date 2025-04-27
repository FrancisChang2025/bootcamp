import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight
  // ! Attributes (Instance Variable)
  // Instance means Object
  private double height;
  private double weight;

  // ! constructor       Purpose: create object
  public Person (){

  }
  // ! all arugment constructor  不可單一加這個，要加埋 Row 11 constructor,else print out problem
  public Person(double height, double weight){    // 👈 這個寫法，意即開 new，即時 Input 寫埋身高，體重。
    this.height = height;
    this.weight = weight;
  }

  // getter   (Java call this 'METHOD (工具)', setter and getter)
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

  // static getBMI  (Ref to 20250423 afternoon notes of R47-53, 68-96 & 112)
  public static double getBMI2(double height, double weight){
    return BigDecimal.valueOf(weight)
        .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
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

  // Assume, this is a calculator, no 'this.' word here,add 'static' to saving memory in Method 2
  // Method 1:
  public static String getWeightStatus(double height, double weight){
    double bmi = BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
        RoundingMode.HALF_UP)
      .doubleValue();
      if (bmi < 18.5) {
        return "Underweight"; // "return" -> exit method
      } else if (bmi >= 18.5 && bmi < 25.0) {
        return "Normal";
      } else if (bmi >= 25.0 && bmi < 30.0) {
        return "Overweight";
      }
      return "Obese";
  }
  // Method 2:
      public static String getWeightStatus2(double height, double weight) {  // 要問人取嘢，所以()內要有指引
      double bmi = getBMI2(height, weight);  // 括弧內要有嘢，因為 static,冇得問 object, 要係 R85取，即他人取。
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
    Person p1 = new Person();  // new object 👈 1️⃣ execute R12 constructor -> create 'Person' object
    System.out.println(p1.getHeight()); // 0.0
    System.out.println(p1.getWeight()); // 0.0

    p1.setHeight(1.76);  // 取 height 參數 👈 2️⃣ execute R31
    p1.setWeight(79);    // 取 weight 參數 👈 3️⃣ execute R35
    System.out.println(p1.getBMI()); // 24.54
    System.out.println(p1.getWeightStatus()); // Overweight

    Person p2 = new Person(1.76, 76);   // 👈 execute R16 constructor 一次過做晒3個參數動作 (new,height,weight)
    System.out.println(p2.getHeight());  // 1.76
    System.out.println(p2.getWeight());  // 76.0
    System.out.println(p2.getBMI());  // 24.54

    System.out.println(Person.getBMI2(1.76, 76));  // 24.54   👈 static 情況下，得出結果 Go to R47
    System.out.println(Person.getWeightStatus(1.76, 79));  // Overweight 👈 Go to R68
    System.out.println(Person.getWeightStatus2(1.76, 76));  // Normal 👈 Go to R68
    

  }
}