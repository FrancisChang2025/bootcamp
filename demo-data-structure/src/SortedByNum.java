import java.util.Comparator;

// Comparator -> formule
public class SortedByNum implements Comparator<Ball> {
  // -1 -> b1
  // 1 -> b2
  // ascending order
  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.getNum() < b1.getNum() ? 1: -1;
  }
}
