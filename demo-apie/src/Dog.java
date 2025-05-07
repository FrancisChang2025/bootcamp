public class Dog extends Animal {
  // private String name;
  // private int age;
  
  public Dog(String name) {
    super(name);
  }

  @Override
  public void sound(){
    System.out.println("wow wow...");
  }

  public void bark(){
      System.out.println("barking!!!");
  }

  @Override
  public boolean equals(Object Obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Dog));
      return false;
    Dog dog = (Dog) obj;
      return dog.getName().equals(super.getName());
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Steven");
    System.out.println(d1.toString()); // Dog@6d06d69c
    Dog d2 = new Dog("Lucas");
    System.out.println(d1.equals(d2)); // false
  }
}
