public enum WeekDay {
  MONDAY("Vincent"), TUESDAY("Oscar"), WEDNESDAY("Lucas"), THURSDAY("Jacky"), FRIDAY("Steven"),;

  private String name;

  private WeekDay(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
  public static void main(String[] args) {
    // Loop enum values -> xxx. value()
    for (WeekDay day : WeekDay.values()) {
      System.out.println(day); // MONDAY.... FRIDAY
      System.out.println(day.getName());  // Vincent....Steven
    }

    System.out.println(WeekDay.WEDNESDAY.getName());  // Lucas
  }
}
