public class Dog extends Animal {
  // private String name;
  // private int age;

  public Dog(String name, int age){
    super(name, age);
  }


  
  public static void main(String[] args) {
    Dog d1 = new Dog("Steven", 2);
    System.out.println(d1.toString());  // Dog@6d06d69c
    Dog d2 = new Dog("Locus", 3);
    System.out.println(d1.equals(d2));  // fasle
  }
}
