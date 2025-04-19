import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.function.BiConsumer;
import javax.swing.plaf.synth.SynthStyleFactory;

public class Person {
  // height weight -> bmi
  private double height;
  private double weight;


  // settler
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // getter 
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // getBMI  (weight / height^2)
  public double getBMI() {
    // or type -> Math.pow(this.height,0.2);  to replace below
    return BigDecimal.valueOf(this.weight)
       .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)),2,
          RoundingMode.HALF_UP)
        .doubleValue();
  } 

  // ! Normal set rounding in result, because not me to decide, 
  // ! Java generate 原汁原味 提供給問者，問者自己決定用 double/byte/...how many decimal，不同人，有不同要求

  // getWeightStatus  (Determine BMI category)
  public String getWeightStatus() {
    double bmi = this.getBMI();
  if (bmi < 18.5) {
      return "You are underweight.";  // "return"-> exit method (define string and break)
  } else if (bmi >= 18.5 && bmi < 25) {
     return "You have a normal weight.";
  } else if (bmi >= 25.0 && bmi  < 30) {
      return "You are overweight.";
  } 
  return "You are obese.";
  }


  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.getHeight());  // 0.0
    System.out.println(p1.getWeight());  // 0.0

    p1.setHeight(1.76);
    p1.setWeight(76);
    System.out.println(p1.getBMI());   // 24.54
    System.out.println(p1.getWeightStatus()); // You have a normal weight.

    Person p2 = new Person();
    p2.setHeight(1.76);
    p2.setWeight(79);
    System.out.println(p2.getBMI());   // 25.5
    System.out.println(p2.getWeightStatus()); // You are overweight.


    
  } 
}
