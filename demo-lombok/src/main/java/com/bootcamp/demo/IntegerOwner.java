package com.bootcamp.demo;

import java.util.List;

// Helper, Owner, Holder, Manager
public class IntegerOwner {
  private List<Integer> integers;
  private Calculator calculator;

  // Dependency Injection
  public IntegerOwner(Calculator calculator, List<Integer> integers) {
    this.calculator = calculator;
    this.integers = integers;
  }

  // Presentation (bmi, area)
  public int sumAll() {
    int total = 0;
    for (Integer integer : this.integers) {
      total = this.calculator.sum(total, integer);
    }
    return total;
  }
}