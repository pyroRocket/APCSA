public class BlackJackTester {

   public static void main(String[] args) {
      BlackJack.buildDeck();
      System.out.println(BlackJack.deck);
      BlackJack.deal();
      System.out.println(BlackJack.deck);
      System.out.println(BlackJack.playerHand);
      System.out.println(BlackJack.dealerHand);

   }
}
