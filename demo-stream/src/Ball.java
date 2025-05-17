public class Ball {
  private Color color;
  private int number;

  public Ball(Color color, int number) {
    this.color = color;
    this.number = number;
  }

  public static enum Color {
    RED, BLUE,;
  }
}
