public class Man extends Direction {
  
  public String getDirection();
    super.direction

  public String toString() {
    return "Man go to..." + getDirection();
  }


  public static void main(String[] args) {
    Man p1 = "EAST";
    System.out.println(p1.getDirection());
  }
}
