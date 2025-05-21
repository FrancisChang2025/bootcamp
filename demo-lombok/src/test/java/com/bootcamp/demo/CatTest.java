package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {
  @Test
  public void TestCat() {
    Cat c1 = new Cat("John", 13);
    Assertions.assertEquals(13, c1.getAge());
    

  }
}

