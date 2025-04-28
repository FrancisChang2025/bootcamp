public class Cat extends Animal {
  // Attributes -> inherited (name)
  private int age;

  public Cat(String name, int age) {
    // super (parent)
    super(name); // calling parent class's constructor
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // ! inherit all instance method: getName()
  public String getName() {
    return super.getName();
  }
}