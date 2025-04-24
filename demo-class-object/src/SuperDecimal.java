public class SuperDecimal {
  private double value;

  public SuperDecimal(String value) {
    this.value = Double.valueOf(value);
  }

  public double getValue() {
    return this.value;
  }

  public SuperDecimal add(SuperDecimal sd) {   // "(SuperDecimal sd) 問他人取 R23 = (double value) to R2 value"
    // this.vale (3.3) + sd.getValue() (3.5)
    double result = this.value + sd.getValue();
    return new SuperDecimal(String.valueOf(result));
  }

  public void add2(SuperDecimal sd) {
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


    sd.add2(new SuperDecimal("4.2"));
    System.out.println(sd.getValue());   // 7.5    go to R18 to run

    System.out.println(sd2);  // SuperDecimal@42a57993, it is a agent address, not our answer. So, must use 'getValue()'



  }
}
