// ! Interface
// APIE -> "A" -> Abstraction
// Class Signature
public class File implements Readable, Writable { // functions, skills
  // ! implements "interface"
  private String content;

  public File(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }

  // Once you "@Override", Java checks if the parent class/ interface has this method
  // if exists, this child class override the parent/interface method
  @Override
  public String read() {
    // System.out.println("I am reading the file: " + this.content);
    return this.content;
  }

  // Method Signature: method name + input parameters
  @Override
  public void write(String content) {
    this.append(content);
  }

  private void append(String newContent) {
    this.content += newContent;
  }
}