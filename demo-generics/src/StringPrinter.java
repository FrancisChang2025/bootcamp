public class StringPrinter {
  private String value;
  private Integer value2;

  public StringPrinter(String value) {
    this.value = value;
  }

  public StringPrinter(Integer value) {
    this.value2 = value;
  }

  public void print() {
    System.out.println("The value is " + this.value);
  }

  public void printInteger() {
    System.out.println("The value is " + this.value2);
  }

  public static void main(String[] args) {
    StringPrinter p1 = new StringPrinter("hello");
    p1.print();
  }
}
