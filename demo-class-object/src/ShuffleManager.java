import java.util.Arrays;
import java.util.Random;

public class ShuffleManager {

  // shuffle once 洗牌一次
  public static Card[] shuffle(Card[] cards) {
    if (cards.length <= 2)
      return cards;
      // random (1-50), skip 0 and 51 扣起最面及最底2張牌，中間抽出放上面洗牌
      // int index = new Random().nextInt();  // 0 - 51
      int idx = new Random().nextInt(cards.length - 2) + 1;   // (0 - 49) + 1 -> 50
      Card backup1 = cards[idx];
      Card backup2 = cards[idx + 1];
      for (int i = idx - 1; i >= 0; i--){
        cards[i + 2] = cards[i];
      }
      cards[0] = backup1;
      cards[1] = backup2;
      return cards;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
    // random -> 4
    // number of cards = 2
    // [5, 6, 1, 2, 3, 4, 7]

    // Case 1: 3 Cards
     Card[] cards = new Card[] {new Card(Card.ACE, Card.CLUB),
        new Card(Card.TEN, Card.CLUB), new Card(Card.ACE, Card.HEART)};
     Card[] newCards = ShuffleManager.shuffle(cards);
     System.out.println(Arrays.toString(newCards));

     // Case 2: 52 Cards
     Deck deck = new Deck();

     Card[] newCards2 = deck.getCards();
     for (int i = 0; i < 1000; i++) {
       newCards2 = ShuffleManager.shuffle(newCards2);
     }
     System.out.println(Arrays.toString(newCards2));
    
  }
}
