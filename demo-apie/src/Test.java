public class Test {

  public static void main(String[] args) {
    File file = new File("Hello World");
    // file.append("!!!!");
    file.write("!!!");
    System.out.println(file.getContent());
    
    System.err.println(file.read());
  }
}
