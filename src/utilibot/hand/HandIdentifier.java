package utilibot.hand;

import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;
import org.apache.log4j.Logger;

public class HandIdentifier
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(HandIdentifier.class);

  //Pixel locations for detecting a Heart.
  private static final int HEART_X = 4;
  private static final int HEART_Y = 23;

  //Pixel locations for detecting a Club.
  private static final int CLUB_X = 6;
  private static final int CLUB_Y = 25;

  //Pixel locations for detecting a Diamond.
  private static final int DIAMOND_X = 8;
  private static final int DIAMOND_Y = 26;

  //Pixel locations for detecting a Spade.
  private static final int SPADE_X = 8;
  private static final int SPADE_Y = 26;

  /**
   * Obtains the players hole cards.
   * @param aHandPosition The seat the player is sat in.
   * @throws Exception Any exceptions.
   */
  public static void getUserHand(Point aHandPosition) throws Exception
  {
    Robot robot = new Robot();

    int handX = (int) aHandPosition.getX();
    int handY = (int) aHandPosition.getY();

    mLogger.info("Back Card (" + handX + "," + handY + ")");

    //Detect for a HEART...
    Color pixelColour = robot.getPixelColor(handX + HEART_X, handY + HEART_Y);
    mLogger.info("Pixel RGB when detecting for a Heart at ("
                 + (handX + HEART_X) + "," + (handX + HEART_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (!pixelColour.equals(Color.WHITE))
    {
      mLogger.info("Back card is a Heart.");
      return;
    }

    //Detect for a CLUB...
    pixelColour = robot.getPixelColor(handX + 6, handY + 25);
    mLogger.info("Pixel RGB when detecting for a Club at ("
                 + (handX + CLUB_X) + "," + (handX + CLUB_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(Color.WHITE))
    {
      mLogger.info("Back card is a Club.");
      return;
    }

    //Detect for a DIAMOND...
    pixelColour = robot.getPixelColor(handX + 8, handY + 26);
    mLogger.info("Pixel RGB when detecting for a Diamond at ("
                 + (handX + DIAMOND_X) + "," + (handX + DIAMOND_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(Color.RED))
    {
      mLogger.info("Back card is a Diamond.");
      return;
    }

    pixelColour = robot.getPixelColor(handX + 8, handY + 26);
    mLogger.info("Pixel RGB when detecting for a Spade at ("
                 + (handX + SPADE_X) + "," + (handX + SPADE_Y) + ") is ("
                 + pixelColour.getRed() + ","
                 + pixelColour.getGreen() + ","
                 + pixelColour.getBlue() + ")");

    if (pixelColour.equals(Color.BLACK))
    {
      mLogger.info("Back card is a Spade.");
      return;
    }

    mLogger.error("ERROR OBTAINING SUIT OF BACK CARD.");
  }
}
