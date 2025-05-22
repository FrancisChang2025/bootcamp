package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  void testSum() {
    int actualResult = new Calculator().sum(3, 5);
    Assertions.assertEquals(8, actualResult);

    Assertions.assertEquals(6, new Calculator().sum(2, 4));
    Assertions.assertEquals(0, new Calculator().sum(0, 0));
    Assertions.assertEquals(-1, new Calculator().sum(-1, 0));
  }

  @Test
  void testFindDog() {
    Dog d1 = new Dog(3.3, "John", 1.76, 13);
    Dog d2 = new Dog(3.3, "John", 1.76, 13);
    List<Dog> dogs = new ArrayList<>(Arrays.asList(d1, d2));
    Optional<Dog> actualResult =
        Calculator.findTargetDog(dogs, 3.3, "John", 1.76, 13);
    Assertions.assertEquals(true, actualResult.isPresent());
  }

  @Test
  void testSumAll() { // Testing sumAll()
    // Prepare data
    List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
    // Call methods
    int actualResult = new IntegerOwner(new Calculator(), integers).sumAll();
    // compare result
    Assertions.assertEquals(6, actualResult);
  }

  @Test
  void testSum2() { // Testing sum()
    // Assertions.assertEquals(3, Calculator.sum(1, 2));
    // Assertions.assertEquals(7, Calculator.sum(3, 4));
  }
}