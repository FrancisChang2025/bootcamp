public class Warrior extends Hero {
  public static final int[] level1 =
      new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level2 =
      new int[] {220, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level3 =
      new int[] {240, 50, 10, 5, 8, 4, 20, 40, 5};

  public Warrior() {
    super(1, level1[0], level1[0]); 
  }

  public int getMaxHp() {
    if (super.getLevel() == 1)
      return level1[0];
    else if (super.getLevel() == 2)
      return level2[0];
    else if (super.getLevel() == 3)
      return level3[0];
    return -1;
  }

  public static void main(String[] args) {
    Warrior w1 = new Warrior();
    System.out.println(w1.getMaxHp()); // 200
    System.out.println(w1.getHp()); // 200
    w1.levelUp();
    System.out.println(w1.getMaxHp()); // 220
    System.out.println(w1.getHp()); // 220
  }

}