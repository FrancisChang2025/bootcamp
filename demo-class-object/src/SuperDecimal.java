public class SuperDecimal {
  private double value;

  public SuperDecimal(String value) {    // String value to double value, using 'valueOf' method
    this.value = Double.valueOf(value);
  }

  public double getValue() {
    return this.value;
  }

  public SuperDecimal add(SuperDecimal sd) {   // "(SuperDecimal sd) 問他人取 R24 = (double value) to R5 value"
    // this.vale (3.3) + sd.getValue() (3.5)
    double result = this.value + sd.getValue();   // "+" = add, using BigDemical method
    return new SuperDecimal(String.valueOf(result));  // return double to String
  }

  public void add2(SuperDecimal sd) {         // No communication between object to object,So settler add2 to ask R35
    this.value = this.value + sd.getValue();  // 修改 BigDecimal 直接用 this.value = .... 巳經知道自己的地址
                                              //  if 開新 Address, 就要用 double result = .... 起頭
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal("3.3");
    System.out.println(sd.getValue());   // 3.3

    SuperDecimal vincent = new SuperDecimal("3.5");  // 代入 R12 to run
    SuperDecimal sd2 = sd.add(vincent);
    System.out.println(sd2.getValue());  // 6.8

    SuperDecimal sd3 = sd.add(new SuperDecimal("3.5")); // R23 + R25 into ONE
    System.out.println(sd3.getValue());  // 6.8


    sd.add2(new SuperDecimal("4.2"));    // 巳經有地址存在，睇番地址內容 3.3 object, 再加新 4.2 object
    System.out.println(sd.getValue());   // 7.5    go to R18 to run

    System.out.println(sd2);  // SuperDecimal@42a57993, it is a agent address, not our answer. So, must use 'getValue()'



  }
}
