public class Woman {
  private Direction direction;

  public Woman() {
    this.direction = Direction.NORTH;
  }

  // Similar to Man.java
  public String getDirection() {
    if(this.direction == Direction.EAST)
      return "EAST";
    else if (this.direction == Direction.NORTH)
     return "NORTH";
    else if (this.direction == Direction.SOUTH)
     return "SOUTH";
    else
      return "WEST";
  }

  // NORTH -> turn left -> WEST
  public Direction turnLeft() {
    int result = (this.direction.getValue() - 1 + 4) % 4;
    this.direction = Direction.of(result);
    return this.direction;
  }

  // SOUTH -> turn right -> WEST
  public Direction turnRight() {

  }

}
