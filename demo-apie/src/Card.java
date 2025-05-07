public class Card {
  private Color color;

  public Card(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Card c1 = new Card(Color.YELLOW);
    Card c2 = new Card(Color.YELLOW);
    Card c3 = new Card(Color.RED);

    System.out.println(c1.getColor().toString());  // YELLOW
    System.out.println(c1.getColor().name());  //  YELLOW
    System.out.println(c2.getColor());  // YELLOW
    System.out.println(c3.getColor());  // RED

    // c1 and c2 they are sing same Color object
    System.out.println(c1.getColor() == c2.getColor());  // true

  }
}
