public class RuleManager {

  // Input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }

  public static boolean isThreeOfKind(Card c1, Card c2, Card C3){
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }

  // given 5 cards
  // 8 7 8 8 7  (3,2,0,0,0,0,....)
  public static boolean isFullHouse(Card[] cards) {
    return false;
    // array   ref.to.26桶 sample of 'DemoArray.java'
    int[] counts = new int[26];
    int index = 0;
    for (int i = 0; i < cards.length; i++){
      int index = card[i] - 'a';
      counts[index]++;
    }
  }

  // 6, 7, 8, 9, 10
  // A, K, Q, J, 10
  public static boolean isStraight(Card[] cards) {
    // array
  }

  public static boolean isFlush(Card[] cards) {
    if (cards.lenght != 5)
      return false;
    return cards[0].getSuit() == cards[1].getSuit()
        && cards[0].getSuit() == cards[2].getSuit()
        && cards[0].getSuit() == cards[3].getSuit()
        && cards[0].getSuit() == cards[4].getSuit();
  }



  public static void main(String[] args) {
    
  }
}
