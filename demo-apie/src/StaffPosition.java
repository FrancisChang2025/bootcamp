public class StaffPosition {
  private final int id;
  private final int annualLeave;
  private final String title;

  public StaffPosition(int id, int annualLeave, String title) {
    this.id = id;
    this.annualLeave = annualLeave;
    this.title = title;
  }

  public int getId() {
    return this.id;
  }

  public int annualLeave() {
    return this.annualLeave;
  }
}