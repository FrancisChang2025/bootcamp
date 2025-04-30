public class RuleManager {

  // Input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }

  public static boolean isThreeOfKind(Card c1, Card c2, Card c3){
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }

  // given 5 cards  『葫蘆』，由三張相同數字＋任何兩張相同數字組成
  // 8 7 8 8 7  (counting 3,2,0,0,0,0,....每人13張牌)
  public static boolean isFullHouse(Card[] cards) {
    if (cards == null || cards.length != 5)
    return false;
    int[] chs = new int[13];
    for (int i = 0; i < cards.length; i++){
      if (cards[i] == null)
      return false;
      chs[cards[i].getRank() - 'A']++;  // M - A = 25   統計filter 3只8，2只7
    }
    // 5
    // 1 1 1 1 1 0 0 0 0 0 0 0 0
    // 0 2 0 0 0 0 0 0 0 0 3 0 0
    boolean withThreeKing = false;
    boolean withPair = false;
    for (int i = 0; i < chs.length; i++){
      if (chs[i] == 2){
        withPair = true;
      }
      if (chs[i] == 3){
        withThreeKing = true;
      }
    }
    return withPair && withThreeKing;

    //return false;
    // array   ref.to.26桶 sample of 'DemoArray.java'
    //int[] counts = new int[26];
    //int index = 0;
    //for (int i = 0; i < cards.length; i++){
     // int index = card[i] - 'a';
      //counts[index]++;
    //}
  }

  // 6, 7, 8, 9, 10 (Snake 順子 Straight -> 做統計，亂序)
  // A, K, Q, J, 10
  // ! A,2,3,4,5 -> special handle  (5 + 13 times for Loop)
  public static boolean isStraight(Card[] cards) {
    if (cards == null || cards.length != 5)
      return false;
    int[] chs = new int[13];
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null)
        return false;
      chs[cards[i].getRank() - 'A']++;
    }

   // ! A,2,3,4,5 -> special handle
   if (chs[12] == 1 && chs[0] == 1 && chs[1] == 1 && chs[2] == 1 && chs[3] == 1) {
    return true;
   }
   boolean checkup = false;
   for (int i = 0; i < chs.length; i++){
    if (chs[i] > 1)
      return false;
    if (checkup == true && chs[i] == 0)
      return false;
    if (chs[i] == 1)
      checkup = true;
   }
   return true;
  }

  public static boolean isFlush(Card[] cards) {
    if (cards.length != 5)
      return false;
    return cards[0].getSuit() == cards[1].getSuit()
        && cards[0].getSuit() == cards[2].getSuit()
        && cards[0].getSuit() == cards[3].getSuit()
        && cards[0].getSuit() == cards[4].getSuit();
  }


  public static void main(String[] args) {
    Card c1 = new Card(Card.TWO, Card.DIAMOND);
    Card c2 = new Card(Card.THREE, Card.DIAMOND);
    Card c3 = new Card(Card.FOUR, Card.DIAMOND);
    Card c4 = new Card(Card.JACK, Card.DIAMOND);
    Card c5 = new Card(Card.KING, Card.DIAMOND);
    System.out.println(RuleManager.isFlush(new Card[] {c1, c2, c3, c4, c5})); // true
    Card c6 = new Card(Card.KING, Card.SPADE);
    System.out.println(RuleManager.isFlush(new Card[] {c1, c2, c3, c4, c6})); // false
    System.out
      .println(RuleManager.isFlush(new Card[] {c1, c2, c3, c4, c5, c6})); // false


    Card card1 = new Card(Card.ACE, Card.SPADE);
    Card card2 = new Card(Card.ACE, Card.DIAMOND);
    Card card3 = new Card(Card.ACE, Card.CLUB);
    Card card4 = new Card(Card.TWO, Card.CLUB);
    Card card5 = new Card(Card.TWO, Card.SPADE);
    Card[] cards = new Card[] {card1, card2, card3, card4, card5};// card array
    // int[] nums = new int[] {2,3,4,5};   // int array

    Card card6 = new Card(Card.THREE, Card.SPADE);
    cards = new Card[] {card1, card2, card3, card4, card6};
    System.out.println(RuleManager.isFullHouse(cards)); // false

    Card card10 = new Card(Card.ACE, Card.SPADE);
    Card card11 = new Card(Card.KING, Card.DIAMOND);
    Card card12 = new Card(Card.QUEEN, Card.CLUB);
    Card card13 = new Card(Card.JACK, Card.CLUB);
    Card card14 = new Card(Card.TEN, Card.SPADE);
    cards = new Card[] {card10, card11, card12, card13, card14};
    System.out.println(RuleManager.isStraight(cards)); // true

    Card card15 = new Card(Card.KING, Card.DIAMOND);
    cards = new Card[] {card10, card11, card12, card13, card15};
    System.out.println(RuleManager.isStraight(cards)); // false

    Card card16 = new Card(Card.NINE, Card.DIAMOND);
    cards = new Card[] {card10, card11, card12, card13, card16};
    System.out.println(RuleManager.isStraight(cards)); // false

    Card card17 = new Card(Card.ACE, Card.SPADE);
    Card card18 = new Card(Card.TWO, Card.DIAMOND);
    Card card19 = new Card(Card.THREE, Card.CLUB);
    Card card20 = new Card(Card.FOUR, Card.CLUB);
    Card card21 = new Card(Card.FIVE, Card.SPADE);
    cards = new Card[] {card17, card18, card19, card20, card21};
    System.out.println(RuleManager.isStraight(cards)); // true

  }
}
