import java.awt.*;
import java.applet.*;

public class Play extends Applet {
	
	private Deck deck;
	private int money;


	public void init() {
		money = 100;

		Deck deck;                 
		BlackjackHand dealerHand;   
		BlackjackHand userHand;     
		
		deck = new Deck();
		dealerHand = new BlackjackHand();
		userHand = new BlackjackHand();

		deck.shuffle();
		// dealerHand.addCard(deck.dealCard());
		// dealerHand.addCard(deck.dealCard());
		// userHand.addCard(deck.dealCard());
		// userHand.addCard(deck.dealCard());
		
		System.out.println();
		System.out.println();
	}

}