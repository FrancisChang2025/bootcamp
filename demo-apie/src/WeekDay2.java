public class WeekDay2 {
  private String value; // "MON", "TUE", "WED", "THU", "FRI"

  public static WeekDay2 ofMonday() {
    return new WeekDay2("MON");
  }

  private WeekDay2(String value) {
    this.value = value;
  }

  public static void main(String[] args) {
    WeekDay2 monday = WeekDay2.ofMonday(); // readability
  }


}
