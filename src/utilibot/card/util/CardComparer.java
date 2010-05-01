package utilibot.card.util;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;
import utilibot.deck.Deck;

public class CardComparer
{  
  private static final int X_DISPLACEMENT = 14;
  private static final int Y_DISPLACEMENT = 35;  
  
  public static BaseCard compareCard(Point aPointOfCard) throws Exception
  {    
    Robot robot = new Robot();    
    Rectangle screenRect = new Rectangle((int) aPointOfCard.getX(), (int) aPointOfCard.getY(), X_DISPLACEMENT, Y_DISPLACEMENT);
    
    BufferedImage cardOne = robot.createScreenCapture(screenRect);
    
    Deck deckOfCards = new Deck();
    
    for (BaseCard card : deckOfCards.getDeck())
    {
      card.setMatchValue(pixelComparer(cardOne, card.getCardImage()));      
    }   
    
    int matchValue = 0;
    BaseCard matchedCard = new BaseCard(Rank.UKNOWN, Suit.UNKNOWN, null);
    
    for (BaseCard card : deckOfCards.getDeck())
    {
      if (card.getMatchValue() > matchValue)
      {
        matchValue = card.getMatchValue();
        matchedCard = card;
      }       
    } 
    
    return matchedCard;
  } 
  
  public static int pixelComparer(BufferedImage aCapturedCard, BufferedImage aComparingCard)
  {
    int numberMatched = 0;
    
    for (int i = 0; i < X_DISPLACEMENT; i++)
    {
      for (int j = 0; j < Y_DISPLACEMENT; j++)
      {
        if (aCapturedCard.getRGB(i, j) == aComparingCard.getRGB(i, j))
        {
          numberMatched ++;
        }        
      }
    }
    
    return numberMatched;
  }
  
}
