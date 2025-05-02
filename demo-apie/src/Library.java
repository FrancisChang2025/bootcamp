// Library, Book, Citizen
// extends, implements

// main: 
// John, Mary (Citizen)  -> want to borrow the same book
// For example, John borrow BookA -> success.
// Mary borrow BookA -> fail
public class Library {
  private BookShelf bookShelf;
  
  public Library(){
    BookShelf bookShelf = new BookShelf();
  }

  public Library(Book book1, Book book2, Book book3){
    BookShelf bookShelf = new BookShelf();
    bookShelf.add(book1);
    bookShelf.add(book2);
    bookShelf.add(book3);
    this.bookShelf = bookShelf;
  }

  public Book search(String bookName) {
    boolean found = false;
    for (int i = 0; i < this.bookShelf.getBooks().length; i++) {
      if(this.bookShelf.getBooks()[i].getName().toLowerCase().contains(bookName.toLowerCase()));
       return this.bookShelf.getBooks()[i];
    }
    return null;
  }

  // ! equals()
  public boolean remove(Book books) {
    return this.bookShelf.remove(books);
  }

  public boolean equals(Book book){
    return this.book == book.getBook();
  }

  public

  public static void main(String[] args) {
    // mary.borrow() -> Fail
    Book book1 = new Book("ABC", 1);
    Book book1 = new Book("ABC", 1);
    Book book1 = new Book("ABC", 1);
    Library library = new Library(book1, book2, book3);
    
    Citizen c1 = new Citizen("John");
    c1.setLibrary("IJ");
    if (c1.search("IJ")){
      c1.borrow(new Book(null, 0))
    }
  }




}
