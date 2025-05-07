// ! 1. Finite values （世界唔會有變化的事，有限值，有限數量，有盡頭）
// ! 2. Not usually changes （不會經常改動，尤其是 Program)
public enum Color {
  RED(1,'R'), YELLOW(2,'Y'), BLUE(3,'B'),;

  private int value;
  private char ch;

  private Color(int value, char ch) {
    this.value = value;
    this.ch = ch;
  }
}
