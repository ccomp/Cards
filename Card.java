public class Blackjack {
    
       public static void main(String[] args) {
       
          int money;
          int bet;
          boolean userWins;
          
          // System.out.println("Welcome to the game of blackjack.");
          System.out.println();
          
          money = 100;
       
          while (true) {
              // System.out.println("You have " + money + " dollars.");
              do {
                 // System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
                 System.out.print("? ");
                 bet = TextIO.getlnInt();
                 if (bet < 0 || bet > money)
                     // System.out.println("Your answer must be between 0 and " + money + '.');
              } while (bet < 0 || bet > money);
              if (bet == 0)
                 break;
              userWins = playBlackjack();
              if (userWins)
                 money = money + bet;
              else
                 money = money - bet;
              System.out.println();
              if (money == 0) {
                 // System.out.println("Looks like you've are out of money!");
                 break;
              }
          }
          
          System.out.println();
          // System.out.println("You leave with $" + money + '.');
       
       } // end main()
       
       
       static boolean playBlackjack() {
            
    
          Deck deck;                 
          BlackjackHand dealerHand;   
          BlackjackHand userHand;     
          
          deck = new Deck();
          dealerHand = new BlackjackHand();
          userHand = new BlackjackHand();
    
          /*  Shuffle the deck, then deal two cards to each player. */
          
          deck.shuffle();
          dealerHand.addCard(deck.dealCard());
          dealerHand.addCard(deck.dealCard());
          userHand.addCard(deck.dealCard());
          userHand.addCard(deck.dealCard());
          
          System.out.println();
          System.out.println();
          
          /* Check if one of the players has Blackjack (two cards totaling to 21).
             The player with Blackjack wins the game.  Dealer wins ties.
          */
          
          if (dealerHand.getBlackjackValue() == 21) {
               // System.out.println("Dealer has the " + dealerHand.getCard(0)
               //                         + " and the " + dealerHand.getCard(1) + ".");
               // System.out.println("User has the " + userHand.getCard(0)
               //                           + " and the " + userHand.getCard(1) + ".");
               // System.out.println();
               // System.out.println("Dealer has Blackjack.  Dealer wins.");
               return false;
          }
          
          if (userHand.getBlackjackValue() == 21) {
               // System.out.println("Dealer has the " + dealerHand.getCard(0)
               //                         + " and the " + dealerHand.getCard(1) + ".");
               // System.out.println("User has the " + userHand.getCard(0)
               //                           + " and the " + userHand.getCard(1) + ".");
               // System.out.println();
               // System.out.println("You have Blackjack.  You win.");
               return true;
          }
   
    
       }  // end playBlackjack()
    
    
}