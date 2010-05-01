package utilibot.number;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import org.apache.log4j.Logger;

import utilibot.table.TableIdentifier;

import javax.imageio.ImageIO;

public class NumberRecognition
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(NumberRecognition.class);
  
  //Button Locations
  private final static Point THIRD_BUTTON = new Point(669, 515);
  private final static Point SECOND_BUTTON = new Point(542, 515);
  private final static Point FIRST_BUTTON = new Point(415, 515);
  
  //Button Offsets
  private final static int X_OFFSET = 6;
  private final static int Y_OFFSET = 30;
  
  //Button Details
  private final static int BUTTON_WIDTH = 100;
  private final static int NUMBER_WIDTH = 7;
  private final static int NUMBER_HEIGHT = 12;
  
  //As a percentage for detecting cards (eg. 80 = 80%)
  private final static int TOLLERANCE_LEVEL = 100;
  
  //Calculates the number on the second button.
  public static int getSecondButtonAmount(TableIdentifier aTi) throws Exception
  {    
    int windowX = (int) aTi.getWindowRectangle().getX();
    int windowY = (int) aTi.getWindowRectangle().getY();
    
    mLogger.info("Calculating Second Button Amount...");
    int secondButtonAmount = calculateFigure(new Point(windowX + (int) SECOND_BUTTON.getX() + X_OFFSET, 
                                                       windowY + (int) SECOND_BUTTON.getY() + Y_OFFSET));
    mLogger.info("Second Button Amount = " + secondButtonAmount);
    return secondButtonAmount;
  }
  
  //Calculates the number on the third button.
  public static int getThirdButtonAmount(TableIdentifier aTi) throws Exception
  {    
    int windowX = (int) aTi.getWindowRectangle().getX();
    int windowY = (int) aTi.getWindowRectangle().getY();
    
    mLogger.info("Calculating Third Button Amount...");
    int thirdButtonAmount = calculateFigure(new Point(windowX + (int) THIRD_BUTTON.getX() + X_OFFSET, 
                                                      windowY + (int) THIRD_BUTTON.getY() + Y_OFFSET));
    mLogger.info("Third Button Amount = " + thirdButtonAmount);
    return thirdButtonAmount;
  }
  
  public static int calculateFigure(Point aButtonLocation) throws Exception
  {
    Robot robot = new Robot();    
    Rectangle screenRect = new Rectangle((int) aButtonLocation.getX(), (int) aButtonLocation.getY(), BUTTON_WIDTH + NUMBER_WIDTH, NUMBER_HEIGHT);
    BufferedImage buttonImage = robot.createScreenCapture(screenRect);
    
    ArrayList<BufferedImage> numberList = new ArrayList<BufferedImage>();
    numberList.add(ImageIO.read(new File("images/numbers/0.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/1.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/2.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/3.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/4.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/5.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/6.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/7.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/8.bmp")));
    numberList.add(ImageIO.read(new File("images/numbers/9.bmp")));
    
    ArrayList<String> listOfNumberLocations = new ArrayList<String>();
    
    int matches = 0;
    
    //For each number in the list...
    for (int i = 0; i < numberList.size(); i++)
    {
      //For each pixel starting on the left most of the button and moving horizontally right...
      for (int j = 0; j < BUTTON_WIDTH; j ++)
      {
        matches = 0;
        
        //For the pixel that we're currently at, scan right and down and compare against the current number...
        for (int k = 0; k < NUMBER_WIDTH; k++)
        {
          for (int l = 0; l < NUMBER_HEIGHT; l++)
          {
            //If the pixel matches the numbers pixel say its a match...
            if (buttonImage.getRGB(j + k, l) == numberList.get(i).getRGB(k, l))
            {
              matches ++;
            }
          }
        }
        
        //For that current location on the button, if the current number is matched - add it to the list of 
        //numbers detected and assign it a horizontal location. 
        if (matches >= ((double)(NUMBER_WIDTH * NUMBER_HEIGHT) / 100) * TOLLERANCE_LEVEL)
        {
          listOfNumberLocations.add(i + "@" + j);
        }
      }
    }
    
    //Sort the numbers into the order they appear on screen...
    for (int i = 0; i < listOfNumberLocations.size() - 1; i++)
    {
      for (int j = 0; j < listOfNumberLocations.size() - i - 1; j++)
      {
        if (Integer.parseInt(listOfNumberLocations.get(j).substring(2)) >
            Integer.parseInt(listOfNumberLocations.get(j + 1).substring(2)))
        {
          String tempI = listOfNumberLocations.get(j);
          listOfNumberLocations.remove(j);
          listOfNumberLocations.add(j + 1, tempI);
        }
      }
    }

    //Create the figure string...
    String figure = "";
    for (String s : listOfNumberLocations)
    {
      figure = figure + s.substring(0, 1);
    }
    
    //Check to see if a number has been detected...
    if (figure.compareTo("") == 0)
    {
      mLogger.info("No number could be detected.");
      return 0;
    }
    
    //Return the figure as an integer...
    return Integer.parseInt(figure);
  }
}
