// ! Advantage of BookShelf
public class BookShelf {
  private static final int MAX_SIZE = 3;  // constant 最多放心本書
  private Book[] books;

  public BookShelf() {
    books = new Book[0];  // add R2 better than add index here
  }
  public boolean isFull() {
    return this.books.length >= MAX_SIZE;
  }

  public boolean add(Book newBook){
    if (newBook == null || isFull()) {

    }
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++){
        this.books[i].equals(newBooks){
          this.books[i] = null;
          return true;
        }
    }
    return false;
  }

  // Passive



  // testing
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.add(new Book("ABC", 1));
    bookShelf.add(new Book("DEF", 2));


  }



}
