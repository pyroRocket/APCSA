import java.util.ArrayList;

public class BlackJack
{
   static ArrayList<Card> deck = new ArrayList<>(52);

   static int rand = (int)(Math.random() * deck.size());

   public static ArrayList<Card> playerHand = new ArrayList<>(2);
   public static ArrayList<Card> dealerHand = new ArrayList<>(2);



   public BlackJack(){
      buildDeck();
   }

   public static void deal(){
      for(int i=0; i < 6; i++){
         shuffle();
      }
      playerHand.add(deck.get(0));
      deck.remove(0);
      playerHand.add(deck.get(0));
      deck.remove(0);

      dealerHand.add(deck.get(0));
      deck.remove(0);
      dealerHand.add(deck.get(0));
      deck.remove(0);
   }

   public static void hitPlayer() {
      playerHand.add(deck.get(0));
      deck.remove(0);
   }

   public static void hitDealer() {
      dealerHand.add(deck.get(0));
      deck.remove(0);
   }


   public static void shuffle(){
      ArrayList<Card> temp = new ArrayList<Card>();
      while(!deck.isEmpty()) {
         int loc=(int)(Math.random()*deck.size());
         temp.add(deck.get(loc));
         deck.remove(loc);
      }
      deck=temp;
   }


   //DONE: Build out a 52 card deck
   public static void buildDeck(){

      for(int decks=0; decks < 6; decks++) {
         for (int v = 0; v < Card.getValuesArray().length; v++) {
            for (int i = 0; i < 4; i++) {
               deck.add(new Card(v));
            }
         }
      }
   }

   //TODO: Implement Win condition
   //TODO: Implement Hit method; Stay goes to next move
}
