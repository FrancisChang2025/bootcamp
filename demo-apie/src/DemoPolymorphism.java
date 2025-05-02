public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation 封裝 (Getter/Setter for private varibale 私有化)

    Animal a1 = new Dog("Peter");  // Java high securities, don't said this line
    // Dog d1 = a1;  // why error?  type unsafe

    // ! Java compile time: Method readability based on the type of "object reference"
    // a1.bark();  // can't run go to R18
    System.out.println(a1.getName());  // Animal.class has getName(), ensures Cat/Dog must contain getName()
    
    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Run-time: Found the object is Dog, so the result "wow wow"
    a1.sound();  // wow wow.....


    // ! how to elimate te risk? we can use 'instanceof' to check the actual type of object.
    if (a1 instanceof Dog) {
       Dog d1 = (Dog) a1;  // force converison (downcast), high risky
       d1.bark();   // barking !!!
     } else if (a1 instanceof Cat) {
       Cat c1 = (Cat) a1;  // force converison (downcast), high risky 
    }
  }
}
