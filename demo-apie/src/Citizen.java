// Citizen -> find Library -> find BookShelf -> find Books (one way relatioship)
// book.getBorrower()

import java.util.Objects;

public class Citizen implements Borrowable {   // 借書的動作
  // private int borrowId;
  private String name;
  private Library library; // Citizen "has" Library
  private Book[] books;
  private String hkid;

  public Citizen(String name) {  // membership
    this.name = name;
  }

  public Citizen(String name, String hkid) {
    this.name = name;
    this.hkid = hkid;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public String getHKID() {
    return this.hkid;
  }

  @Override  // hkid
  public boolean equals(Object obj) {
    if (this == obj)
     return true;
    if (!(obj instanceof Citizen))
      return false;
    Citizen citizen = (Citizen) obj;
    return this.hkid.equals(citizen.getHKID());
  }

  @Override   // Double gurantee
  public int hashCode() {
    return Objects.hash(this.hkid);   // HKID
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
