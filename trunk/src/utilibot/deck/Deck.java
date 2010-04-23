package utilibot.deck;

import java.util.ArrayList;
import java.util.List;
import utilibot.card.BaseCard;
import utilibot.card.club.CLUB_10;
import utilibot.card.club.CLUB_2;
import utilibot.card.club.CLUB_3;
import utilibot.card.club.CLUB_4;
import utilibot.card.club.CLUB_5;
import utilibot.card.club.CLUB_6;
import utilibot.card.club.CLUB_7;
import utilibot.card.club.CLUB_8;
import utilibot.card.club.CLUB_9;
import utilibot.card.club.CLUB_A;
import utilibot.card.club.CLUB_J;
import utilibot.card.club.CLUB_K;
import utilibot.card.club.CLUB_Q;
import utilibot.card.diamond.DIAMOND_10;
import utilibot.card.diamond.DIAMOND_2;
import utilibot.card.diamond.DIAMOND_3;
import utilibot.card.diamond.DIAMOND_4;
import utilibot.card.diamond.DIAMOND_5;
import utilibot.card.diamond.DIAMOND_6;
import utilibot.card.diamond.DIAMOND_7;
import utilibot.card.diamond.DIAMOND_8;
import utilibot.card.diamond.DIAMOND_9;
import utilibot.card.diamond.DIAMOND_A;
import utilibot.card.diamond.DIAMOND_J;
import utilibot.card.diamond.DIAMOND_K;
import utilibot.card.diamond.DIAMOND_Q;
import utilibot.card.heart.HEART_10;
import utilibot.card.heart.HEART_2;
import utilibot.card.heart.HEART_3;
import utilibot.card.heart.HEART_4;
import utilibot.card.heart.HEART_5;
import utilibot.card.heart.HEART_6;import utilibot.card.heart.HEART_A;
import utilibot.card.heart.HEART_J;
import utilibot.card.heart.HEART_K;
import utilibot.card.heart.HEART_Q;

import utilibot.card.heart.HEART_7;
import utilibot.card.heart.HEART_9;
import utilibot.card.heart.HEART_8;
import utilibot.card.spade.SPADE_10;
import utilibot.card.spade.SPADE_2;
import utilibot.card.spade.SPADE_3;
import utilibot.card.spade.SPADE_4;
import utilibot.card.spade.SPADE_5;
import utilibot.card.spade.SPADE_6;
import utilibot.card.spade.SPADE_7;
import utilibot.card.spade.SPADE_8;
import utilibot.card.spade.SPADE_9;
import utilibot.card.spade.SPADE_A;
import utilibot.card.spade.SPADE_J;
import utilibot.card.spade.SPADE_K;
import utilibot.card.spade.SPADE_Q;


public class Deck
{
  private List<BaseCard> mDeck = new ArrayList<BaseCard>();

  public Deck() throws Exception
  {
    //Clubs
    mDeck.add(new CLUB_2()); 
    mDeck.add(new CLUB_3()); 
    mDeck.add(new CLUB_4());
    mDeck.add(new CLUB_5());
    mDeck.add(new CLUB_6());
    mDeck.add(new CLUB_7()); 
    mDeck.add(new CLUB_8());
    mDeck.add(new CLUB_9());
    mDeck.add(new CLUB_10());
    mDeck.add(new CLUB_J());
    mDeck.add(new CLUB_Q());
    mDeck.add(new CLUB_K());
    mDeck.add(new CLUB_A());
    
    //Diamonds
    mDeck.add(new DIAMOND_2()); 
    mDeck.add(new DIAMOND_3()); 
    mDeck.add(new DIAMOND_4());
    mDeck.add(new DIAMOND_5());
    mDeck.add(new DIAMOND_6());
    mDeck.add(new DIAMOND_7()); 
    mDeck.add(new DIAMOND_8());
    mDeck.add(new DIAMOND_9());
    mDeck.add(new DIAMOND_10());
    mDeck.add(new DIAMOND_J());
    mDeck.add(new DIAMOND_Q());
    mDeck.add(new DIAMOND_K());
    mDeck.add(new DIAMOND_A());
    
    //Hearts
    mDeck.add(new HEART_2()); 
    mDeck.add(new HEART_3()); 
    mDeck.add(new HEART_4());
    mDeck.add(new HEART_5());
    mDeck.add(new HEART_6());
    mDeck.add(new HEART_7()); 
    mDeck.add(new HEART_8());
    mDeck.add(new HEART_9());
    mDeck.add(new HEART_10());
    mDeck.add(new HEART_J());
    mDeck.add(new HEART_Q());
    mDeck.add(new HEART_K());
    mDeck.add(new HEART_A());
    
    //Spades
    mDeck.add(new SPADE_2()); 
    mDeck.add(new SPADE_3()); 
    mDeck.add(new SPADE_4());
    mDeck.add(new SPADE_5());
    mDeck.add(new SPADE_6());
    mDeck.add(new SPADE_7()); 
    mDeck.add(new SPADE_8());
    mDeck.add(new SPADE_9());
    mDeck.add(new SPADE_10());
    mDeck.add(new SPADE_J());
    mDeck.add(new SPADE_Q());
    mDeck.add(new SPADE_K());
    mDeck.add(new SPADE_A());
  }
  
  public List<BaseCard> getDeck()
  {
    return mDeck;
  }
}
