// Citizen -> find Library -> find BookShelf -> find Books (one way relatioship)
// book.getBorrower()
public class Citizen implements Borrowable {   // 借書的動作
  // private int borrowId;
  private String name;
  private Library library; // Citizen "has" Library
  private Book[] books;

  public Citizen(String name) {  // membership
    this.name = name;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);
  }

  public boolean search(String bookName) {
    Book book = this.library.search(bookName);
    return this.library.search(bookName) != null;
  }



}
