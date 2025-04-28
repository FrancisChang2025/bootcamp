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
  public boolean equals(Photo phone) {
    return this.id == photo.getId();
  }

  // toString
  public long toString() {
    return "Photo(" + "name=" + this.id  + ")";
  }

  public static void main(String[] args) {
    Photo photo1 = new Photo();
    Phone photo2 = new Photo();
    System.out.println(photo2.getId);  // 2
  }
}
