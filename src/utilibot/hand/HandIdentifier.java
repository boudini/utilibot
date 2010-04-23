package utilibot.hand;

import java.awt.Point;
import org.apache.log4j.Logger;

import utilibot.card.BaseCard;
import utilibot.card.util.CardComparer;

public class HandIdentifier
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(HandIdentifier.class);
  
  private static int X_OFFSET = 15;
  private static int Y_OFFSET = 4;
  
  /**
   * Obtains the players hole cards.
   * @param aHandPosition The seat the player is sat in.
   * @throws Exception Any exceptions.
   */
  public static void getUserHand(Point aBackCardPosition) throws Exception
  {   
    Point frontCardPosition = new Point((int) aBackCardPosition.getX() + X_OFFSET, (int) aBackCardPosition.getY() + Y_OFFSET);

    mLogger.info("Back Card (" + (int) aBackCardPosition.getX() + "," + (int) aBackCardPosition.getY() + ")");
    mLogger.info("Front Card (" + (int) frontCardPosition.getX() + "," + (int) frontCardPosition.getY() + ")");
    
    BaseCard backCard = CardComparer.compareCard(aBackCardPosition); 
    mLogger.info(backCard.getRank() + " of " + backCard.getSuit() + "'s");
    
    BaseCard frontCard = CardComparer.compareCard(frontCardPosition);
    mLogger.info(frontCard.getRank() + " of " + frontCard.getSuit() + "'s");
    
  }  
}
