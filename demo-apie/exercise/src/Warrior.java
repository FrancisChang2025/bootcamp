public class Warrior extends Hero {
  // revise to 2D array
  public static final int[] level1 =
      new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level2 =
      new int[] {220, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level3 =
      new int[] {240, 50, 10, 5, 8, 4, 20, 40, 5};

  public Warrior() {
    super(1, level1[0], level1[1]); // All objects should start with level 1
  }

  public int getMaxHp() {
    if (super.getLevel() == 1)
      return Warrior.level1[0];
    else if (super.getLevel() == 2)
      return Warrior.level2[0];
    else if (super.getLevel() == 3)
      return Warrior.level3[0];
    return -1;
  }

  public double getCDPercent() {
    int myCDP = -1;
    if (super.getLevel() == 1)
      myCDP = Warrior.level1[6];
    else if (super.getLevel() == 2)
      myCDP = Warrior.level2[6];
    else if (super.getLevel() == 3)
      myCDP = Warrior.level3[6];
    int extraCDP = isLowHP() ? 20 : 0;
    return (myCDP + extraCDP) / 100.0;
  }

  public boolean isLowHP() {
    int myMaxHP = -1;
    if (super.getLevel() == 1)
      myMaxHP = Warrior.level1[0];
    else if (super.getLevel() == 2)
      myMaxHP = Warrior.level2[0];
    else if (super.getLevel() == 3)
      myMaxHP = Warrior.level3[0];
    return super.getHp() / myMaxHP < 0.2;
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