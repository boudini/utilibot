package utilibot.hand;
import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;

public class HandIdentifier
{
  public static void getUserHand(Point aHandPosition) throws Exception
  {
    Robot robot = new Robot();
    
    int handX = (int) aHandPosition.getX();
    int handY = (int) aHandPosition.getY();
    
    System.out.println("Back Card: X=" + handX + ", Y=" + handY);
    
    Color pixelColour = robot.getPixelColor(handX + 4, handY + 23);   
    System.out.println(pixelColour.getRed() + "," + pixelColour.getGreen() + "," + pixelColour.getBlue());
    if (!pixelColour.equals(Color.WHITE))
    {
      System.out.println("HEART");
      return;
    }
      
    pixelColour = robot.getPixelColor(handX + 6, handY + 25);
    System.out.println(pixelColour.getRed() + "," + pixelColour.getGreen() + "," + pixelColour.getBlue());
    if (pixelColour.equals(Color.WHITE))
    {
      System.out.println("CLUB");
      return;
    }  
    
    pixelColour = robot.getPixelColor(handX + 8, handY + 26);
    System.out.println(pixelColour.getRed() + "," + pixelColour.getGreen() + "," + pixelColour.getBlue());
    if (pixelColour.equals(Color.RED))
    {
      System.out.println("DIAMOND");
      return;
    } 
    
    pixelColour = robot.getPixelColor(handX + 8, handY + 26);
    System.out.println(pixelColour.getRed() + "," + pixelColour.getGreen() + "," + pixelColour.getBlue());
    if (pixelColour.equals(Color.BLACK))
    {
      System.out.println("SPADE");
      return;
    } 
    
    System.out.println("ERROR OBTAINING SUITS");
  }
}
