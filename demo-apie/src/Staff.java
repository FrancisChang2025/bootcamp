import java.time.LocalDate;

public class Staff {
  private String staffId;
  private int positionId;
  private LocalDate joinDate;

  public int annualLeave() {
    for (int i = 0; i < SystemDefinition.STAFF_POSITIONS.length; i++) {
      if (SystemDefinition.STAFF_POSITIONS[i].getId() == this.positionId)
        return SystemDefinition.STAFF_POSITIONS[i].annualLeave()
            + SystemDefinition.getExtraAL(this.joinDate);
    }
    return -1;
  }



}