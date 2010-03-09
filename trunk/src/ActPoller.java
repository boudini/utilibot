import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;

public class ActPoller 
{    
  public static void pollTable(TableIdentifier aTi, int aDelay) throws Exception
  {
    Rectangle windowRect = null;
    Color pixelColour = null;
    Robot robot = new Robot();
    
    while(true)
    {      
      Thread.sleep(aDelay);
      windowRect = aTi.getWindowRectangle();
      pixelColour = robot.getPixelColor((int) (windowRect.getX() + 440), (int) (windowRect.getY() + 540));
      
      if (pixelColour.getRed() == 147 
          && pixelColour.getGreen() == 66
          && pixelColour.getBlue() == 15)
      {       
          break;
      }       
    }
  }
}
