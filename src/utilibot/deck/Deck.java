package utilibot.deck;

import java.util.ArrayList;
import java.util.List;

import utilibot.card.BaseCard;
import utilibot.card.rank.Deuce;
import utilibot.card.rank.Eight;
import utilibot.card.rank.Five;
import utilibot.card.rank.Four;
import utilibot.card.rank.Nine;
import utilibot.card.rank.Seven;
import utilibot.card.rank.Six;
import utilibot.card.rank.Ten;
import utilibot.card.rank.Three;
import utilibot.card.util.Suit;

public class Deck
{
  private List<BaseCard> mDeck = new ArrayList<BaseCard>();
  private Integer mCardsInSuit;
  
  //Clubs
  public static final BaseCard TWO_C = new Deuce(Suit.CLUB); 
  public static final BaseCard THREE_C = new Three(Suit.CLUB); 
  public static final BaseCard FOUR_C = new Four(Suit.CLUB); 
  public static final BaseCard FIVE_C = new Five(Suit.CLUB); 
  public static final BaseCard SIX_C = new Six(Suit.CLUB); 
  public static final BaseCard SEVEN_C = new Seven(Suit.CLUB); 
  public static final BaseCard EIGHT_C = new Eight(Suit.CLUB); 
  public static final BaseCard NINE_C = new Nine(Suit.CLUB); 
  public static final BaseCard TEN_C = new Ten(Suit.CLUB); 
  
  //Diamonds
  public static final BaseCard TWO_D = new Deuce(Suit.DIAMOND); 
  public static final BaseCard THREE_D = new Three(Suit.DIAMOND); 
  public static final BaseCard FOUR_D = new Four(Suit.DIAMOND); 
  public static final BaseCard FIVE_D = new Five(Suit.DIAMOND); 
  public static final BaseCard SIX_D = new Six(Suit.DIAMOND); 
  public static final BaseCard SEVEN_D = new Seven(Suit.DIAMOND); 
  public static final BaseCard EIGHT_D = new Eight(Suit.DIAMOND); 
  public static final BaseCard NINE_D = new Nine(Suit.DIAMOND); 
  public static final BaseCard TEN_D = new Ten(Suit.DIAMOND); 
  
  //Hearts
  public static final BaseCard TWO_H = new Deuce(Suit.HEART); 
  public static final BaseCard THREE_H = new Three(Suit.HEART); 
  public static final BaseCard FOUR_H = new Four(Suit.HEART); 
  public static final BaseCard FIVE_H = new Five(Suit.HEART); 
  public static final BaseCard SIX_H = new Six(Suit.HEART); 
  public static final BaseCard SEVEN_H = new Seven(Suit.HEART); 
  public static final BaseCard EIGHT_H = new Eight(Suit.HEART); 
  public static final BaseCard NINE_H = new Nine(Suit.HEART); 
  public static final BaseCard TEN_H = new Ten(Suit.HEART); 
  
  //Spades
  public static final BaseCard TWO_S = new Deuce(Suit.SPADE); 
  public static final BaseCard THREE_S = new Three(Suit.SPADE); 
  public static final BaseCard FOUR_S = new Four(Suit.SPADE); 
  public static final BaseCard FIVE_S = new Five(Suit.SPADE); 
  public static final BaseCard SIX_S = new Six(Suit.SPADE); 
  public static final BaseCard SEVEN_S = new Seven(Suit.SPADE); 
  public static final BaseCard EIGHT_S = new Eight(Suit.SPADE); 
  public static final BaseCard NINE_S = new Nine(Suit.SPADE); 
  public static final BaseCard TEN_S = new Ten(Suit.SPADE); 
  
  public Deck()
  {
    //Clubs
    mDeck.add(TWO_C);
    mDeck.add(THREE_C);
    mDeck.add(FOUR_C);
    mDeck.add(FIVE_C);
    mDeck.add(SIX_C);
    mDeck.add(SEVEN_C);
    mDeck.add(EIGHT_C);
    mDeck.add(NINE_C);
    mDeck.add(TEN_C);
    
    mCardsInSuit = mDeck.size();
    
    //Diamonds
    mDeck.add(TWO_D);
    mDeck.add(THREE_D);
    mDeck.add(FOUR_D);
    mDeck.add(FIVE_D);
    mDeck.add(SIX_D);
    mDeck.add(SEVEN_D);
    mDeck.add(EIGHT_D);
    mDeck.add(NINE_D);
    mDeck.add(TEN_D);
    
    //Hearts
    mDeck.add(TWO_H);
    mDeck.add(THREE_H);
    mDeck.add(FOUR_H);
    mDeck.add(FIVE_H);
    mDeck.add(SIX_H);
    mDeck.add(SEVEN_H);
    mDeck.add(EIGHT_H);
    mDeck.add(NINE_H);
    mDeck.add(TEN_H);
    
    //Spades
    mDeck.add(TWO_S);
    mDeck.add(THREE_S);
    mDeck.add(FOUR_S);
    mDeck.add(FIVE_S);
    mDeck.add(SIX_S);
    mDeck.add(SEVEN_S);
    mDeck.add(EIGHT_S);
    mDeck.add(NINE_S);
    mDeck.add(TEN_S);
  }
  
  public List<BaseCard> getDeck()
  {
    return mDeck;
  }
  
  public Integer getCardsInSuit()
  {
    return mCardsInSuit;
  }
}
