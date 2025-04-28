import java.time.LocalDate;

public class SystemDefinition {

  public static final StaffPosition[] STAFF_POSITIONS = new StaffPosition[] {
    new StaffPosition(1, 17, "IT Director"),
    new StaffPosition(2, 12, "Programmer"),
    new StaffPosition(3, 15, "IT Manager"),
  };

  public static int getExtraAL(LocalDate joinDate) {
    return -1;
  }
}