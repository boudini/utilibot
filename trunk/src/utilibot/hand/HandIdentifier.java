package utilibot.hand;

import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import utilibot.card.BaseCard;
import utilibot.card.util.CardComparer;
import utilibot.table.TableIdentifier;

public class HandIdentifier
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(HandIdentifier.class);
  
  private static int X_OFFSET = 15;
  private static int Y_OFFSET = 4;
  
  //Points on the Table that relate to a white pixel of the Cards.
  private static final Point FLOP_EXISTS = new Point(315, 186);
  private static final Point TURN_EXISTS = new Point(475, 186);
  private static final Point RIVER_EXISTS = new Point(530, 186);
  
  private static final Point FLOP_1_LOC = new Point(272, 182);
  private static final Point FLOP_2_LOC = new Point(326, 182);
  private static final Point FLOP_3_LOC = new Point(380, 182);
  
  private static final Point TURN_LOC = new Point(434, 182);
  
  private static final Point RIVER_LOC = new Point(488, 182);
  
  /**
   * Obtains the players hole cards.
   * @param aHandPosition The seat the player is sat in.
   * @throws Exception Any exceptions.
   */
  public static void getUserHand(TableIdentifier aTi, Point aBackCardPosition) throws Exception
  {     
    Point frontCardPosition = new Point((int) aBackCardPosition.getX() + X_OFFSET, (int) aBackCardPosition.getY() + Y_OFFSET);

    BaseCard backCard = CardComparer.compareCard(aBackCardPosition); 
    mLogger.info(backCard.toString());
    
    BaseCard frontCard = CardComparer.compareCard(frontCardPosition);
    mLogger.info(frontCard.toString());    
    
    ArrayList<BaseCard> communityCards = getCommunityCards(aTi);
    
    if (communityCards.isEmpty())
    {
      mLogger.info("There are no Community Cards yet.");
    }
    else
    {
      mLogger.info("Community Cards...");
      
      for (BaseCard card : communityCards)
      {
        mLogger.info(card.getRank() + " of " + card.getSuit() + "'s");
      }
    }
  }  
  
  /**
   * Creates a List of BaseCards of all the Community cards on the Table.
   * @return
   */
  private static ArrayList<BaseCard> getCommunityCards(TableIdentifier aTi) throws Exception
  {
    ArrayList<BaseCard> communityCards = new ArrayList<BaseCard>();
    
    for (BaseCard card : getFlop(aTi))
    {
      communityCards.add(card);
    }
    
    if (getTurn(aTi) != null)
    {
      communityCards.add(getTurn(aTi));
    }
    
    if (getRiver(aTi) != null)
    {
      communityCards.add(getRiver(aTi));
    }
    
    return communityCards;
  }
  
  /**
   * If the 3 Flop Cards are on the Table then it returns it, otherwise it returns an empty list.
   * @return
   */
  private static ArrayList<BaseCard> getFlop(TableIdentifier aTi) throws Exception
  {
    Robot robot = new Robot();
    
    ArrayList<BaseCard> flopCards = new ArrayList<BaseCard>();
    
    if (robot.getPixelColor((int) FLOP_EXISTS.getX() + (int) aTi.getWindowRectangle().getX(), 
                            (int) FLOP_EXISTS.getY() + (int) aTi.getWindowRectangle().getY()).equals(Color.WHITE))
    {
      Point currentCardPoint = new Point((int) (FLOP_1_LOC.getX() + aTi.getWindowRectangle().getX()),
                                         (int) (FLOP_1_LOC.getY() + aTi.getWindowRectangle().getY()));      
      flopCards.add(CardComparer.compareCard(currentCardPoint));
      
      currentCardPoint.setLocation((int) (FLOP_2_LOC.getX() + aTi.getWindowRectangle().getX()),
                                   (int) (FLOP_2_LOC.getY() + aTi.getWindowRectangle().getY()));      
      flopCards.add(CardComparer.compareCard(currentCardPoint));
      
      currentCardPoint.setLocation((int) (FLOP_3_LOC.getX() + aTi.getWindowRectangle().getX()),
                                   (int) (FLOP_3_LOC.getY() + aTi.getWindowRectangle().getY()));
      flopCards.add(CardComparer.compareCard(currentCardPoint));
      
      return flopCards;
    }
    
    return flopCards;
  }
  
  /**
   * If there is a Turn Card on the Table then it returns it, otherwise it returns null.
   * @return
   */
  private static BaseCard getTurn(TableIdentifier aTi) throws Exception
  {
    Robot robot = new Robot();
    
    BaseCard turnCard = null;
    
    if (robot.getPixelColor((int) TURN_EXISTS.getX() + (int) aTi.getWindowRectangle().getX(),  
                            (int) TURN_EXISTS.getY() + (int) aTi.getWindowRectangle().getY()).equals(Color.WHITE))
    {
      Point turnPoint = new Point((int) (TURN_LOC.getX() + aTi.getWindowRectangle().getX()),
                                  (int) (TURN_LOC.getY() + aTi.getWindowRectangle().getY()));
      
      return CardComparer.compareCard(turnPoint);
    }
    
    return turnCard; 
  }
  
  /**
   * If there is a River Card on the Table then it returns it, otherwise it returns null.
   * @return
   */
  private static BaseCard getRiver(TableIdentifier aTi) throws Exception
  {
    Robot robot = new Robot();
    
    BaseCard riverCard = null;
    
    if (robot.getPixelColor((int) RIVER_EXISTS.getX() + (int) aTi.getWindowRectangle().getX(), 
                            (int) RIVER_EXISTS.getY() + (int) aTi.getWindowRectangle().getY()).equals(Color.WHITE))
    {
      Point riverPoint = new Point((int) (RIVER_LOC.getX() + aTi.getWindowRectangle().getX()),
                                   (int) (RIVER_LOC.getY() + aTi.getWindowRectangle().getY()));
      
      return CardComparer.compareCard(riverPoint);
    }
    
    return riverCard;
  }
}
