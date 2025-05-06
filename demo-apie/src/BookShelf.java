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

  public Book[] getBooks() {
    return this.books;
  }

  public boolean remove(Book book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(book)) {
        this.books[i] = null;
        return true;
      }
    }
    return false;
  }

  // Passive
  public boolean add(Book newBook) {
    if (newBook == null || isFull()) {
      return false;
    }
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = newBook;
    this.books = newBooks;
    return true;
  }

  // testing
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.add(new Book(1, "ABC"));
    bookShelf.add(new Book(2, "DEF"));
    System.out.println(bookShelf.isFull()); // false
    bookShelf.add(new Book(3, "IJK"));
    System.out.println(bookShelf.isFull()); // true

    System.out.println(bookShelf.add(new Book(4, "XYZ"))); // false
  }
}
