import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBySample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice","Bee", "Eve", "David", "Bob", "Charlie", "Frank");

    // Group names by their first letter
    Map<Character, List<String>> groupByFirstLetter = names.stream()
       .collect(Collectors.groupingBy(name -> name.charAt(0)));
    System.out.println(groupByFirstLetter);
    // {A=[Alice], B=[Bee, Bob], C=[Charlie], D=[David], E=[Eve], F=[Frank]}


    // 按首字母分组并计数
    Map<Character, Long> countByFirstLetter = names.stream()
       .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
    System.out.println(countByFirstLetter);
    // {A=1, B=2, C=1, D=1, E=1, F=1}
  }
}
