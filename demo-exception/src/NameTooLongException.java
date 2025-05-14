// ! Once you "extends" in the class, then the object of this class can be created for "throw"
// ! Unchecked Exception -> "extends RuntimeException"
public class NameTooLongException extends RuntimeException {
  public static void main(String[] args) {
    int x = 1;
    int x2 = 2;
    System.out.println(x + x2);  // 3

    Cat c1 = new Cat(10);
    Cat c2 = new Cat(12);
    Cat c3 = c1;
    NameTooLongException.eat(c1);
    NameTooLongException.eat(new Cat(13));

  }


}
