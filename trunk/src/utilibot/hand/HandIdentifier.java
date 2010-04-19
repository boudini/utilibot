package utilibot.hand;

import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;

import org.apache.log4j.Logger;

import utilibot.deck.Deck;

public class HandIdentifier
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(HandIdentifier.class);

  //Pixel locations for detecting a Heart.
  private static final int HEART_X = 5;
  private static final int HEART_Y = 23;
  private static final Color HEART = new Color(200, 6, 6);
  
  //Pixel locations for detecting a Club.
  private static final int CLUB_X = 7;
  private static final int CLUB_Y = 28;
  private static final Color CLUB = new Color(250, 250, 250);

  //Pixel locations for detecting a Diamond.
  private static final int DIAMOND_X = 2;
  private static final int DIAMOND_Y = 27;
  private static final Color DIAMOND = new Color(214, 75, 75);

  //Pixel locations for detecting a Spade.
  private static final int SPADE_X = 7;
  private static final int SPADE_Y = 30;
  private static final Color SPADE = new Color(249, 249, 249);
  
  private static final Deck mDeck = new Deck();
  

  
  /**
   * Obtains the players hole cards.
   * @param aHandPosition The seat the player is sat in.
   * @throws Exception Any exceptions.
   */
  public static void getUserHand(Point aHandPosition) throws Exception
  {   

    int backCardX = (int) aHandPosition.getX();
    int backCardY = (int) aHandPosition.getY();
    
    int frontCardX = backCardX + 15;
    int frontCardY = backCardY + 4;

    mLogger.info("Back Card (" + backCardX + "," + backCardY + ")");
    mLogger.info("Front Card (" + frontCardX + "," + frontCardY + ")");
    
    mLogger.info("Back Card: " + determineRank(backCardX, backCardY) + determineSuit(backCardX, backCardY));
    mLogger.info("Front Card: " + determineRank(frontCardX, frontCardY) + determineSuit(frontCardX, frontCardY));
    
    
  }
  
  /**
   * Determines the Suit of the Card.
   * @param aXLocation Position of the X Pixel to check against.
   * @param aYLocation Position of the Y Pixel to check against.
   * @return Not Sure
   * @throws Exception Throws Exception.
   */
  private static String determineSuit(int aXLocation, int aYLocation) throws Exception
  {
    Robot robot = new Robot();
    
    //Detect for a HEART...
    Color pixelColour = robot.getPixelColor(aXLocation + HEART_X, aYLocation + HEART_Y);
    mLogger.info("Pixel RGB when detecting for a Heart at ("
                 + (aXLocation + HEART_X) + "," + (aYLocation + HEART_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(HEART))
    {
      mLogger.info("Back card is a Heart.");
      return "HEART";
    }
    
    //Detect for a CLUB...
    pixelColour = robot.getPixelColor(aXLocation + CLUB_X, aYLocation + CLUB_Y);
    mLogger.info("Pixel RGB when detecting for a Club at ("
                 + (aXLocation + CLUB_X) + "," + (aYLocation + CLUB_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(CLUB))
    {
      mLogger.info("Back card is a Club.");
      return "CLUB";
    }

    //Detect for a DIAMOND...
    pixelColour = robot.getPixelColor(aXLocation + DIAMOND_X, aYLocation + DIAMOND_Y);
    mLogger.info("Pixel RGB when detecting for a Diamond at ("
                 + (aXLocation + DIAMOND_X) + "," + (aYLocation + DIAMOND_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(DIAMOND))
    {
      mLogger.info("Back card is a Diamond.");
      return "DIAMOND";
    }

    //Detect for a SPADE...
    pixelColour = robot.getPixelColor(aXLocation + SPADE_X, aYLocation + SPADE_Y);
    mLogger.info("Pixel RGB when detecting for a Spade at ("
                 + (aXLocation + SPADE_X) + "," + (aYLocation + SPADE_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(SPADE))
    {
      mLogger.info("Back card is a Spade.");
      return "SPADE";
    }
    
    return "UNKNOWN SUIT";
  }
  
  private static int determineRank(int aXLocation, int aYLocation) throws Exception
  {
    Robot robot = new Robot();
    boolean matchedCard = false;
    
    for (int i = mDeck.getCardsInSuit() - 1; i > 0; i--)
    {   
      matchedCard = true;
      
      for (int j = 0; j < mDeck.getDeck().get(i).getPoints().length; j++)
      {
        if (robot.getPixelColor((int)mDeck.getDeck().get(i).getPoints()[j].getX() + aXLocation, 
                                (int)mDeck.getDeck().get(i).getPoints()[j].getY() + aYLocation).equals(Color.WHITE))
        {
          mLogger.info("Detected card rank: " + mDeck.getDeck().get(i).getRank());
          matchedCard = false;
          break;
        }
      }
      
      if (matchedCard)
      {
        return i;
      }
      
    }

    return -1;
  }
}
