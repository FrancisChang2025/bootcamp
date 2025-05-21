package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  public void testSum() {
    int actualResult = Calculator.sum(3, 5);
    Assertions.assertEquals(8, actualResult);

    Assertions.assertEquals(6, Calculator.sum(2, 4));
    Assertions.assertEquals(0, Calculator.sum(0, 0));
    Assertions.assertEquals(-1, Calculator.sum(-1, 0));
    
  }
}
