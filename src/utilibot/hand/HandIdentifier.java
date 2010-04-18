package utilibot.hand;

import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

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
  
  private static final Point POINT_TL = new Point(24, 18);
  private static final Point POINT_TC = new Point(32, 18);
  private static final Point POINT_TR = new Point(40, 18);
  
  private static final Point POINT_MTU = new Point(32, 24);
  private static final Point POINT_MTL = new Point(32, 30);  
  
  private static final Point POINT_MUL = new Point(24, 31);
  private static final Point POINT_MUR = new Point(40, 31);
  
  private static final Point POINT_ML = new Point(24, 37);
  private static final Point POINT_MC = new Point(32, 37);
  private static final Point POINT_MR = new Point(40, 37);
  
  private static final Point POINT_MLL = new Point(24, 43);  
  private static final Point POINT_MLR = new Point(40, 43);
  
  private static final Point POINT_MBU = new Point(32, 45);
  private static final Point POINT_MBL = new Point(32, 50);
  
  private static final Point POINT_BL = new Point(24, 57);
  private static final Point POINT_BC = new Point(32, 57);
  private static final Point POINT_BR = new Point(40, 57);
  
  private static final Point[] RANK_10 = {POINT_TL, POINT_TR, 
                                          POINT_MTU, 
                                          POINT_MUL, POINT_MUR,
                                          POINT_MLL, POINT_MLR,
                                          POINT_MBL, 
                                          POINT_BL, POINT_BR};
  
  private static final Point[] RANK_9 = {POINT_TL, POINT_TR, 
                                         POINT_MUL, POINT_MUR,
                                         POINT_MC,
                                         POINT_MLL, POINT_MLR,
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_8 = {POINT_TL, POINT_TR, 
                                         POINT_MTL, 
                                         POINT_MUL, POINT_MUR,
                                         POINT_MLL, POINT_MLR,
                                         POINT_MBU, 
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_7 = {POINT_TL, POINT_TR, 
                                         POINT_MTL, 
                                         POINT_MUL, POINT_MUR,
                                         POINT_MLL, POINT_MLR,
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_6 = {POINT_TL, POINT_TR, 
                                         POINT_ML, POINT_MR,
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_5 = {POINT_TL, POINT_TR, 
                                         POINT_MC,
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_4 = {POINT_TL, POINT_TR,
                                         POINT_BL, POINT_BR};
  
  private static final Point[] RANK_3 = {POINT_TC, 
                                         POINT_MC,
                                         POINT_BC};
  
  private static final Point[] RANK_2 = {POINT_TC, 
                                         POINT_BC};
  
  private static final Point[][] RANKS = {RANK_10, RANK_9, RANK_8, RANK_7, RANK_6, RANK_5, RANK_4, RANK_3, RANK_2};

  
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
    
    for (int i = 10; i >= 2; i--)
    {   
      matchedCard = true;
      mLogger.info(RANKS[i-2].length);
      for (int j = 0; j < RANKS[i - 2].length; j++)
      {
        mLogger.info("INSIDE");
        if (robot.getPixelColor((int)RANKS[i - 2][j].getX() + aXLocation, 
                                (int)RANKS[i - 2][j].getY() + aYLocation).equals(Color.WHITE))
        {
          mLogger.info("Detected card rank: " + i);
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
