package utilibot.poller;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import org.apache.log4j.Logger;
import utilibot.table.TableIdentifier;

public class ActPoller
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(ActPoller.class);

  /**
   * Polls the Poker Table at certain intervals.
   * @param aTi The Table Identifier.
   * @param aDelay The delay to wait before polling the Table again.
   * @throws Exception Any exception.
   */
  public static void pollTable(TableIdentifier aTi, int aDelay) throws Exception
  {
    Rectangle windowRect = null;
    Color pixelColour = null;
    Robot robot = new Robot();

    while(true)
    {
      mLogger.info("Detecting if players turn to act...");
      Thread.sleep(aDelay);
      windowRect = aTi.getWindowRectangle();
      pixelColour = robot.getPixelColor((int) (windowRect.getX() + 440), (int) (windowRect.getY() + 540));

      if (pixelColour.getRed() == 147
          && pixelColour.getGreen() == 66
          && pixelColour.getBlue() == 15)
      {
        mLogger.info("Detected player's turn to act.");
        break;
      }
    }
  }
}
