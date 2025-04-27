public class Name {
  // attributes 特徵
  private String firstName;
  private String lastName;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  // Similar to 'getBMI',  Visit class file 'Person.java'
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public static void main(String[] args) {
    String name = "John";
    Name name1 = new Name();
    name1.setFirstName("John");
    name1.setLastName("Wong");
    System.out.println(name1.getFullName()); // John Wong
  }
}