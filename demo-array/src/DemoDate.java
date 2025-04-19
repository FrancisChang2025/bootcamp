import java.lang.reflect.AccessFlag.Location;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 17
    int year = 2025;
    int month = 4;
    int day = 17;

    // For Date Value, we should not use int variable for storage. -> How to operation?!
    // because it is hard to perform operation on "date", i.e. comparison?

    LocalDate today = LocalDate.of(2025, 4, 17);  // Not accept '04', int '4' eg. month/day
    System.out.println(today);   //    2025-04-17

    LocalDate day2 = today.plusDays(14);
    System.out.println(day2);   // 2025-05-01

    LocalDate day3 = today.plusMonths(2);   // 2025-06-17
    System.out.println(day3);

    LocalDate day4 = today.plusWeeks(50);
    System.out.println(day4);  // 2026-04-02

    // minusDays
    LocalDate day5 = today.minusDays(90);
    System.out.println(day5);  // 2025-01-17

    // ! isAfter, isBefore, isEqual (Comparsion setting 'LocalDate')
    if (today.isAfter(LocalDate.of(2025, 4, 16))) {  // Yes or No, comparsion, this answer is Yes.
      System.out.println("today > 2025.4.17");
    }

    if (today.isBefore(LocalDate.of(2025, 5, 1))) {
      System.out.println("today < 2025.5.1");
    }

    // ! 左 是否等如 右 （作比較），不是用'＝＝'     true or false
    if (today.isEqual(LocalDate.of(2025, 4, 17))) {
      System.out.println("todday = 2025.4.17");
    }

    System.out.println(today.isLeapYear()); // false 不是潤年
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear());  // false
    System.out.println(LocalDate.of(2400, 1, 1).isLeapYear());  // true
    System.out.println(LocalDate.of(2000, 1, 1).isLeapYear());  // true
    System.out.println(LocalDate.of(2016, 1, 1).isLeapYear());  // true

    System.out.println(LocalDate.of(2016, 2, 28).plusDays(1));   // 2016-02-29

    System.out.println(LocalDate.of(2016, 1, 1).getDayOfYear());  // 2016
    System.out.println(LocalDate.of(2016, 1, 1).getDayOfWeek());  // 1

    // ! Technically OK, not suitable
    String dayOfWeek = "Monday"; // "MONDAY" "monday" "Monday"

    DayOfWeek dow = LocalDate.of(2016, 1, 1).getDayOfWeek(); 
    System.out.println(dow.toString());  // FRIDAY

    DayOfWeek dow2 = DayOfWeek.of(3);
    System.out.println(dow2);   // WEDNESDAY

    DayOfWeek dow3 = DayOfWeek.of(3).plus(2);
    System.out.println(dow3);  // FRIDAY

    System.out.println(LocalDate.now());  // 2025-04-17 答案顯示即時日期，追返部機的地區時間而每時每刻會變動

    

  }
}
