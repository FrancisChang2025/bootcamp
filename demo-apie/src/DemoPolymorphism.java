public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence 繼承 (extends)
    // A -> Abstraction 抽象 (implements)
    // P -> Polymorphism 多態牲 (Parent Class / Interface)
    // E -> Encapsulation 封裝 (Getter/Setter for private varibale 私有化)

    // 1. Parent Class
    Animal a1 = new Dog("Peter");  // Java high securities, don't see this line... final error
    // Dog d1 = a1;  // why error?  type unsafe，not gurantee.   Not OKAY.

    // ! Java compile time: Method readability based on the type of "object reference"
    // a1.bark();  // can't run go to R18
    System.out.println(a1.getName());  // Animal.class has getName(), ensures Cat/Dog must contain getName()
    
    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Run-time: Found the object is Dog, so the result "wow wow"
    a1.sound();  // wow wow.....


    // ! how to eliminate the risk? we can use 'instanceof' to check the actual type of object.
    if (a1 instanceof Dog) {
       Dog d1 = (Dog) a1;  // force converison (downcast), high risky
       d1.bark();   // barking !!!
     } else if (a1 instanceof Cat) {
       Cat c1 = (Cat) a1;  // force converison (downcast), high risky 
    }
    
    // 2. Interface
    Flyable superman = new Superman("John");   // One object ONLY, no parent class
    // System.out.println(superman.fly());  Not OKAY.
    superman.fly();  // OK, I am flying...
    // superman.drink();  // Not OKAY  to view R12 reanson
    // superman.eat();  // Not OKAY
    // superman.sleep();  // Not OKAY

    // Example (Account)
    // Use Polymorphism to create objects
    Account acc1 = new PersonalAccount();
    Account acc2 = new CommericalAccount();

    // Parent (Account)
    acc1.getSavingAccount().credit(300.0);
    System.out.println(acc1.getSavingAccount().getBalance());
    acc2.getSavingAccount().credit(400.0);
    System.out.println(acc2.getSavingAccount().getBalance());
    
    // SubAccount subAcc1 = new SavingAccount();
    SubAccount subAcc1 = SavingAccount.ofHKD();
    SubAccount subAcc2 = new CurrentAccount();
    subAcc1.credit(900.0);
    subAcc2.credit(100.0);

    // Example (Shape)
    // Polymorphism   左邊放 Parent, 右邊放 Class
    int x = 100;
    Shape shape;
    if (x > 50) {
      shape = new Circle(3.5, "WHITE");
    // } else if {  // ! A new Shape comes...

    // }
    } else {
      shape = new Rectangular("BLUE", 4.5, 7.8);
    }
    // ! area() is a common method for Circle and Rectangular
    double area = shape.area();
    if (area > 10) {
      System.out.println("Area=" + area);
    } else {
      System.out.println("It is a samll shape.");
    }

    // get radius
    // get Length/Width
    // get Length();  // ! unsafe type, so we have to use "instanceOf" and downcasting
    if (shape instanceof Circle){
      Circle circle = (Circle) shape;
      System.out.println(circle.getRadius());
    } else if (shape instanceof Rectangular){
      Rectangular rectangular = (Rectangular) shape;
      System.out.println(rectangular.getLength());
      System.out.println(rectangular.getWidth());
    }

    // Number
    Number number = Long.valueOf(3);
    number = Integer.valueOf(10);
    number = Byte.valueOf("7");
    number = Short.valueOf("8");
    // System.out.println(value); // error

    number = Double.valueOf(3.9);
    number = Float.valueOf("8.4");

    long value = number.longValue(); // 8.4 -> 8
    System.out.println(value);  // 8
    double value2 = number.doubleValue();
    System.out.println(value2);

    // floating point issue
    double d1 = 8.4f;
    System.out.println(d1);

    // Real world: Use int for Integer and double for deciaml place
    int y = 3;
    double h = 3.3;

  }
}
