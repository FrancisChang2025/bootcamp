import java.lang.reflect.AnnotatedArrayType;

public class Zoo {
  private Animal[] animals;
  // private Cat cat;
  // private Dog dog;

  public Zoo() {
    this.animals = new Animal[3];
    this.animals[0] = new Cat("John", 2);
    this.animals[1] = new Dog("Peter");
    // this.cat = new Cat("John", 2);
    // this.dog = new Dog("Peter");
    this.animals[2] = new Panda("Vincent");
  }

  public Animal getPanda() {
    return this.animals[2];
  }

  public Animal getDog() {
    return this.animals[1];
  }

  public Animal getCat() {
    return this.animals[0];
  }

public static void main(String[] args) {
  Zoo zoo1 = new Zoo();
  System.out.println(zoo1.getPanda().getName());  // Vincent
  zoo1.getPanda().setName("Jenny");
  System.out.println(zoo1.getPanda().getName());  // Jenny

  Zoo zoo2 = new Zoo();
  Animal animal = zoo2.getPanda();
  System.out.println(animal.getName());  // Vincent

  zoo2.getDog().sound(); // default sound ....
  zoo2.getCat().sound(); // Meow .....

  
  }
}