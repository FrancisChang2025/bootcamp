public class Dog extends Animal {
  
  public Dog(String name) {
    super(name);
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Steven");
    System.out.println(d1.toString()); // Dog@6d06d69c
    Dog d2 = new Dog("Lucas");
    System.out.println(d1.equals(d2)); // false
  }
}
