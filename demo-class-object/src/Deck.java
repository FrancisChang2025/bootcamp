import java.util.Arrays;

public class Deck {
  private static final char[] SUITS = 
    new char[] {Card.DIAMOND, Card.CLUB, Card.HEART, Card.SPADE};
  private static final char[] RANKS =
    new char[] {Card.ACE, Card.TWO, Card.THREE, Card.FOUR, Card.FIVE, Card.SIX, Card.SEVEN,
    Card.EIGHT, Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING};

  private Card[] cards; // null  表示幅圖冇指針

  // constructor
  public Deck(){
    this.cards = new Card[SUITS.length * RANKS.length];
    int idx = 0;
    for (int i = 0; i < SUITS.length; i++){
      for (int k = 0; k < RANKS.length; k++){
        this.cards[idx++] = new Card(RANKS[k], SUITS[i]);
      }
    }
  }

  // getter
  public Card[] getCards() {
    return this.cards;
  }

  // setter


  public static void main(String[] args) {
    Deck d1 = new Deck();      // saw 'new' go to constructor R13 to R21 For Loop to filter diff card
    System.out.println(Arrays.toString(d1.getCards()));

  }
}
