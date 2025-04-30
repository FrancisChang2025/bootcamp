public class Mage extends Hero {
  // 2D array?
  public static final int[] level1 =
      new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level2 =
      new int[] {220, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level3 =
      new int[] {240, 50, 10, 5, 8, 4, 20, 40, 5};

  public Mage() {
    super(1, level1[0], level1[1]);
  }

  public int getMaxHp() {
    if (super.getLevel() == 1)
      return Mage.level1[0];
    else if (super.getLevel() == 2)
      return Mage.level2[0];
    else if (super.getLevel() == 3)
      return Mage.level3[0];
    return -1;
  }
}