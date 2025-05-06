public class Man {
  private static final int FIXED_TURN_DEGREE = 30;
  private int degree;
  // private String direction;

  public Man() {
    this.degree = 0;
  }

  // 1 -> EAST
  // 2 -> SOUTH
  // 3 -> WEST
  // 4 -> NORTH
  public String getDirection(){  // EAST, SOUTH, NORTH, WEST
    // 280 / 90 -> 3
    // 280 % 90 -> 10
    // x < 45 -> 0
    // x > 45 -> + 1
    // swith case1 ->

        
    int extra = this.degree % 90 < 45 ? 0 : 1;
    System.out.println(extra);
    int result = this.degree / 90 + extra;
    // 0 - 1 + 0
    // 
    // 350 / 90 + 1 -> 4
    System.out.println(result);

    switch (result) {
      case 0:
        return "North";
      case 1:
        return "EAST";
      case 2:
        return "SOUTH";
      case 3:
        return "WEST";
      case 4:
        return "NORTH";
      default:
        return null;
    }
  }

  //public void setDirection(String direction) {
  //  this.direction = direction;
  // }

  // 0 - 10 -> 350
  // 360 / 350
  public void turnLeft() {  //  10 degree
    this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
    System.out.println(this.degree);   // for checking
    }


  // 350 + 10 -> 0
  public void turnRight(){   // 10 degree
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;
  }

  public static void main(String[] args) {
    Man man = new Man();
    man.turnLeft();
    man.turnLeft();
    man.turnRight();
    System.out.println(man.getDirection());
  }
}
