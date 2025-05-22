package com.bootcamp.demo;

// ! static import: load all the static methods from the target class to your local class
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  // ! Hamcrst s mainly for List result checking.
  @Test
  void testFindDogByAge() {
    Dog d1 = new Dog(3.3, "ABC", 3.3, 5);
    Dog d2 = new Dog(3.4, "DEF", 10, 5);
    Dog d3 = new Dog(3.4, "XYZ", 10, 2);
    List<Dog> dogs = new ArrayList<>(Arrays.asList(d1, d2, d3));
    List<Dog> actualResult = Dog.findDogAgeGreaterThan(dogs, 3);

    assertThat(actualResult, hasItem(new Dog(3.3, "ABC", 3.3, 5)));
    assertThat(actualResult, hasItem(new Dog(3.3, "DEF", 3.3, 5)));
    assertThat(actualResult, not(hasItem(new Dog(3.3, "ABC", 3.3, 5))));
    assertThat(actualResult, hasSize(2));
  }

  @Test
  void testBasicSyntax () {
    String s1 = "hello";
    String s2 = "world";

    assertThat(s1.concat(s2), is(equals("helloworld")));
    assertThat(s1.concat(s2), not(equals("hello world")));

    int i1 = 10;
    int i2 = 15;
    assertThat(i1 + i2, not(greaterTan(26)));
    assertThat(i1 + i2, is(greaterTan(23)));

    // lessThanOrEqualto
    // lessThan
  }
}
