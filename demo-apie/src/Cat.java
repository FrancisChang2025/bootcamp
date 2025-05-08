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

  // Child Class can override the parent class method
  @Override
  public void sound(){
    System.out.println("Meow ....");
  }

  // equals()
  // if doesn't write R32-40, DemoObject.java R11 // false
  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
      return this.getName().equals(cat.getName());
  }

  // toString()
  @Override
  public String toString() {
    return "Cat(" //
        + "name=" + super.getName() //
        + ",age=" + this.age //
        + ")";
  }
}