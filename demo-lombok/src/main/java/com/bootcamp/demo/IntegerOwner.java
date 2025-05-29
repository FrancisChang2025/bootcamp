package com.bootcamp.demo;

import java.util.List;

// Helper, Owner, Holder, Manager
public class IntegerOwner {    // (developer A)
  private List<Integer> integers;  // static input
  private Calculator calculator;   // helper 水泡  (developer B)

  // Dependency Injection
  public IntegerOwner(Calculator calculator, List<Integer> integers) {
    this.calculator = calculator;
    this.integers = integers;
  }

  // Presentation (bmi, area) 在此要請外援 calculator 幫手完成
  public int sumAll() {
    int total = 0;
    for (Integer integer : this.integers) {
      total = this.calculator.sum(total, integer); // R8 出世，就不用 new
    }
    return total;
  }
}