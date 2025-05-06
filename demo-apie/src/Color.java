public enum Color {
  RED(1,'R'), YELLOW(2,'Y'), BLUE(3,'B'),;

  private int value;
  private char ch;

  private Color(int value, char ch) {
    this.value = value;
    this.ch = ch;
  }
}
