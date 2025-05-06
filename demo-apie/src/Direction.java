import java.security.PrivateKey;

// ! someone help you call Direction(int value) to create Direction Object

public enum Direction {
  EAST(1), //
  SOUTH(2), //
  WEST(3), //
  NORTH(4), //
  ;

  private int value;

  // Man.java
  // p1.getDirection(); -> return String
  // 

  // enum constructor -> private
  private Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Direction of(int value) {
    // for loop
    for (Direction d : Direction.values()) {
      if (d.getValue() == value)
        return d;
    }
    return null;
  }




}
