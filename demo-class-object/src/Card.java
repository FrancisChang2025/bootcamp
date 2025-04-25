public class Card {
  // ! static -> common values for all objects (Not belongs to objects)
  // ! static -> Cannot modify the value after initialization
  // Non-static and Non-Final
  // Static and Non-Final
  // Non-static and Final
  // Static and Final
  private static final char DIAMOND = 'D';   // constant 全大寫      static = dictionery
  private static final char CLUB = 'C';   // constant 
  private static final char HEART = 'H';   // constant 
  private static final char SPADE = 'S';   // constant 

  private static final char TWO = '2';   // constant
  private static final char ACE = 'Z';   // constant     'ACE' 是最大
  private static final char THREE = '3';   // constant
  private static final char FOUR = '4';   // constant
  private static final char FIVE = '5';   // constant
  private static final char SIX = '6';   // constant
  private static final char SEVEN = '7';   // constant
  private static final char EIGHT = '8';   // constant
  private static final char NINE = '9';   // constant
  private static final char TEN = 'A';   // constant
  private static final char JACK = 'J';   // constant
  private static final char QUEEN = 'X';   // constant
  private static final char KING = 'Y';   // constant
  // rank 數字(number)
  // Don't use "String", "1", "J", "Q"
  // 1. Readability 閲讀性
  // 2. Data Type Range ()
  private char rank;  // 1,2,3,4,5,6,7,8,9,T,J,Q,K     '10'replace by 'T',char only accept 1個位

  // suit 花式圖型 (DIAMOND, CLUB, HEART, SPADE)
  private char suit;  // D,C,H,S

  // material 有其他變化才考慮
  // Constructor
  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }


  // Setter, Getter
  public void setRank(char rank){
    this.rank = rank;
  }
  public void setSuit(char suit){
    this.suit = suit;
  }


  public char getRank() {
    return this.rank;
  }
  public char getSuit() {
    return this.suit;
  }



  // color
  public boolean isRed() {
    if (suit == DIAMOND || suit == HEART);
      return true;
    return false;
  }

  // this (self 自己)    👇 代表 input
  public boolean equals(Card card) {
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  // 10.compareTo(3) -> 1
  // 3.compare(10) -> -1   // 可以唔用 to 不正統寫法

  // 0, -1, 1
  public int compareTo(Card card) {
    if (this.rank == card.getRank()) {
      if (this.suit > card.getSuit()) {
        return 1;
      } else if (this.suit < card.getSuit()){
        return -1;
      }
      return 0;
    }
    // different ranks
    return this.rank > card.getRank() ? 1 : -1;
  }

  public static void main(String[] args) {
    Card c1 = new Card(TWO, CLUB);
    Card c2 = new Card(TWO, CLUB);
    System.out.println(c1.equals(c2));   // true   Go to R68 run
    Card c3 = new Card(THREE, CLUB);
    System.out.println(c1.equals(c3));  // false
    Card c4 = new Card(TWO, HEART);
    System.out.println(c1.equals(c4));  // false
    Card c5 = new Card(ACE, CLUB);
    System.out.println(c1.equals(c5));  // false   (把所有可能發生 case to test)

    System.out.println(c1.compareTo(c2));  // 0
    System.out.println(c1.compareTo(c3));  // -1
    System.out.println(c5.compareTo(c1));  // 1

    Card c6 = new Card(ACE, DIAMOND);
    System.out.println(c5.compareTo(c6));  // -1
  }
}
