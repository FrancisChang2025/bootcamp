public class Zoo {
  private Animal[] animals;
  // private Cat cat;
  // private Dog dog;

  public Zoo() {
    this.animals = new Animal[2];
    this.animals[0] = new Cat("John", 2);
    this.animals[1] = new Dog("Peter");
    // this.cat = new Cat("John", 2);
    // this.dog = new Dog("Peter");
  }
}