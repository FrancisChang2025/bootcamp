public class Photo {
  private static long counter = 0;
  private long id;

  public Photo() {
    this.id = ++counter;
  }

  public long getId() {
    return this.id;
  }

  // equals()
  public boolean equals(Photo photo) {
    return this.id == photo.getId();
  }
  // toString()

  public static void main(String[] args) {
    Photo photo1 = new Photo();
    Photo photo2 = new Photo();
    System.out.println(photo2.getId()); // 2
  }
}