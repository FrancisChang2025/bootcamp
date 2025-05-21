package com.bootcamp.demo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Person {
  private String name;
  private int age;
  private LocalDate dob;

  public Person(String name, int age, LocalDate do  )


  public static void main(String[] args) {
    Person p1 = new Person();

  }
  
}
