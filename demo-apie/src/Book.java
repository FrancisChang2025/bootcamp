import java.util.Objects;

public class Book extends Library {
  private String title;
  private int bookId;
  private Library library; // book -> library object address

  public Book(String title, int bookId){
    this.title = title;
    this.bookId = bookId;
  }

  public String getbookId(){
    return this.bookId;
  }

  public boolean isAvailable = false;
  public void setTitle(String title){
    while (true) {
      
  // ! equals()
  // this.book vs book
  public boolean equals(Object obj) {
    if (this == obj)   //  object address
      return true;
    if (!(obj instanceof Book))  //! check if obj is an object of Book Class
      return false;
    Book book = (Book) obj;
    // return this.bookId == obj.getbookId() && this.name.equals(book.getName());
    return Objects.equals(this.bookId, book.getbookId())
      && Object.equals(this.name,book.getName());
  }
    }
  }


  public static void main(String[] args) {
    // ! In Java, all class implicitly extends Object
    Human h1 = new Superman("John");  // upgrade
    Object o1 = new Superman("John");  // upgrade

    Superman sm = (Superman) h1;

    Book b1 = new Book("ABC", 1):
    System.out.println(b1.equals(b2));  // false 不理會書名，只認barcode


    Animal a1 = new Cat("Steven",10);
    System.out.println(a1 instanceof Cat); // true
    System.out.println(a1 instanceof Animal); // true
    a1 = new Dog("Peter");
    // a1 is a dog or cat?
    System.out.println(a1 instanceof Animal); // true
    System.out.println(a1 instanceof Cat); // false
    System.out.println(a1 instanceof Dog); // true

    Cat a2 = new Cat("Mary", 12);
    System.out.println(a2 instanceof Cat); // ! doesn't make sense



      
    };
  }


}
