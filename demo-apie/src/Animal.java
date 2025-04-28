public class Animal {  // more sbstract -> Parent Class
  // Cat.java, Dog.java -> Child Class

  // common attributes for Cat, Dog
  private String name;
  private int age;

  // Constructor cannot be inheirted
  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  // method (can be inheirted)
  public String getName(){
    return this.name;
  }
  

  public static void main(String[] args) {
    Animal a1 = new Animal("John", 10);  // John
    Cat c1 = new Cat("Peter", 20);
    System.out.println(c1.getName());

  }
}
