package com.bootcamp.demo;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK -> has no lombok
// pom.xml -> add dependency (lombok framework) -> load into your Java (Maven) project
// So, your project is able to use JDK + lombok

// ! Compile time: java -> class
// JAVA compiler -> convert Annottion(i.e. @Getter) to normal java code
// JVM executes class files (include generatd code by lombok)

// ! Why we can call set/get in VSCode before compilation.
// VSCode -> implicitly compile your java code.

// Special Cases:
// 1. Field level anottion (i.e. Getter, Setter, EqualsAndHashCode)
// 2. callSuper (Parent Class)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Dog extends SuperAnimal{
  private String name;
  // @ToString.Exclude
  private double weight;
  private int age;

  public Dog(double superpower, String name, double weight, int age) {
    super(superpower);
    this.age = age;
    this.name = name;
    this.weight = weight;
  }

// All args constructor
// getter, setter
// equals, toString, hashCode

 public static List<Dog> findDogAgeGreaterThan(List<Dog> dogs, int age) {
    return dogs.stream().filter(d -> d.getAge() > age).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setAge(13);
    d1.setName("Peter");
    System.err.println(d1);  // Dog(name=Peter, weight=0.0, age=13)
    Dog d2 = new Dog("John", 3.76, 10);
    System.out.println(d2);  // Dog(name=John, weight=3.76, age=10)
    Dog d3 = new Dog("John", 3.76, 10);  // generated
    System.out.println(d2.equals(d3));  // true (Reason is R56 generated)
    System.out.println(d3.getName());  // John
    System.out.println(d3.getAge());  // 10

    Dog d4 = new Dog(9.99, "John", 3.76, 10);
    Dog d5 = new Dog(100, "John", 3.76, 10);
    System.out.println(d4.equals(d5)); // false, View R29 added Parent() 👉 default true
    System.out.println(d4);  // Dog(name=John, weight=3.76, age=10)
    // R29 & R 30 👉 add (callSuper = Call) 
    // R63 Ans from true 👉 false (Reason: 跟自己比 d4 = d5 ✅ match name & age ONLY, 加埋 super 比，must false❌)
    // R64 Ans from 以上👉Dog(super=SuperAnimal(superpower=9.99), name=John, weight=3.76, age=10)

    Dog d6 = new Dog(100, "John", 3.76, 10);
    System.out.println(d5.equals(d6)); // true
  }
}
