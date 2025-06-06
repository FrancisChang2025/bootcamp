import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Class 👉 Object (row), Attribute (Column of a row)

// List<Person>

public class DemoOptional {
  // ! SHOULD NOT use Optional as attribute type
  private Optional<String> name; // ! For attribute, always use null to present "no value", instead of Optional

  // ! SHOULD NOT use Optional for getter
  public Optional<String> getName() {
    return this.name;
  }

  // ! SHOULD NOT use Optional for constructor
  public DemoOptional(Optional<String> name) {
    this.name = name;
  }

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "Lucas"));
    String target = "Mary";
    Optional<String> result = findTargetString(names, target);
    if (result.isPresent()) {
      System.out.println("Target is found: " + target);
    } else {
      System.out.println("Target is not found.");
    }  // Target is found: Mary

    // findTarget(null, 'c'); // NPE  (canbe Call, but 即💥)

    // ! The ways to create Optional Object
    Optional<Ball> ball1 = Optional.of(new Ball(Ball.Color.RED, 13));
    Optional<Ball> ball2 = Optional.empty();

    // Use ofNullable when you don't know if the object is null
    Ball b1 = null;
    Optional<Ball> ball3 = Optional.ofNullable(b1);  // 👈 "Optional.of Null" 不一定找到

    // Optional.of(null);  // ! You must put on-null object int of()
  }

  // ! Optional.class is ONLY for return type.
  public static Optional<String> findTargetString(List<String> strings, String target) {
    if (strings != null && strings.contains(target))
      return Optional.of(target);
    return Optional.of(target);
  }

  // ! SHOULD NOT use Optional as type of parameter
  // because you still cannot avoid null pointer exception.
  public static boolean findTarget(Optional<String> str, char target) {
    if (!str.isPresent())
      return false;
    return str.get().contains(String.valueOf(target));
  }
}
