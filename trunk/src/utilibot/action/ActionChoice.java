package utilibot.action;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;

import org.apache.log4j.Logger;

import utilibot.table.TableIdentifier;
import utilibot.type.ActionChoices;

public class ActionChoice
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(ActionChoice.class);

  // Button 2 Colour Pixel Test Location.
  private static final int BUTTON_TWO_X = 582;
  private static final int BUTTON_TWO_Y = 535;
  // Button 2 Colour of Pixel.
  private static final Color BUTTON_TWO_CALL = new Color(143, 63, 14);
  private static final Color BUTTON_TWO_CHECK = new Color(225, 175, 52);

  // Button 3 Colour Pixel Test Location.
  private static final int BUTTON_THREE_X = 696;
  private static final int BUTTON_THREE_Y = 529;
  // Button 3 Colour of Pixel.
  private static final Color BUTTON_THREE_CALL = new Color(134, 58, 11);
  private static final Color BUTTON_THREE_RAISE = new Color(250, 207, 63);


  /**
   * Gets the action choices that are available to the player.
   * @param aTi The Table Identifier.
   * @return ActionChoices which contains all the actions available.
   * @throws Exception Any exceptions.
   */
  public static ActionChoices getActionChoices(TableIdentifier aTi) throws Exception
  {
    ActionChoices actionChoices = new ActionChoices();
    Rectangle rect = aTi.getWindowRectangle();
    Robot robot = new Robot();

    int rectX = (int) rect.getX();
    int rectY = (int) rect.getY();

    // Button 1
    actionChoices.setFold(true);

    // Button 2
    Color buttonTwoColour = robot.getPixelColor(rectX + BUTTON_TWO_X, rectY + BUTTON_TWO_Y);
    processButtonTwo(actionChoices, buttonTwoColour);
    mLogger.info("Button Two Colour: "
                 + buttonTwoColour.getRed() + ","
                 + buttonTwoColour.getGreen() + ","
                 + buttonTwoColour.getBlue());

    // Button 3
    Color buttonThreeColour = robot.getPixelColor(rectX + BUTTON_THREE_X, rectY + BUTTON_THREE_Y);
    processButtonThree(actionChoices, buttonThreeColour);
    mLogger.info("Button Three Colour: "
                 + buttonThreeColour.getRed() + ","
                 + buttonThreeColour.getGreen() + ","
                 + buttonThreeColour.getBlue());

    //Print out available actions.
    mLogger.info("Actions Available: " + actionChoices.toString());

    return actionChoices;
  }

  /**
   * Determines what Button 2 is; Not Available, Check or Call.
   * @param aChoices The ActionChoices object.
   * @param aColor The colour of the pixel at the set point of Button 2.
   */
  private static void processButtonTwo(ActionChoices aChoices, Color aColor)
  {
    int red = aColor.getRed();
    int green = aColor.getGreen();
    int blue = aColor.getBlue();

    if (red == BUTTON_TWO_CHECK.getRed()
        && green == BUTTON_TWO_CHECK.getGreen()
        && blue == BUTTON_TWO_CHECK.getBlue()) // Check
    {
      aChoices.setCheck(true);
    }
    else if (red == BUTTON_TWO_CALL.getRed()
             && green == BUTTON_TWO_CALL.getGreen()
             && blue == BUTTON_TWO_CALL.getBlue()) // Call
    {
      aChoices.setCall(true);
      aChoices.setCallButton(2);
      processCallAmount(aChoices, 2);
    }
  }

  /**
   * Determines what Button 3 is; Not Available, Call or Raise.
   * @param aChoices The ActionChoices object.
   * @param aColor The colour of the pixel at the set point of Button 3.
   */
  private static void processButtonThree(ActionChoices aChoices, Color aColor)
  {
    int red = aColor.getRed();
    int green = aColor.getGreen();
    int blue = aColor.getBlue();

    if (red == BUTTON_THREE_RAISE.getRed()
        && green == BUTTON_THREE_RAISE.getGreen()
        && blue == BUTTON_THREE_RAISE.getBlue()) // Raise
    {
      aChoices.setRaise(true);
    }
    else if (red == BUTTON_THREE_CALL.getRed()
             && green == BUTTON_THREE_CALL.getGreen()
             && blue == BUTTON_THREE_CALL.getBlue()) // Call
    {
      aChoices.setCall(true);
      aChoices.setCallButton(3);
      processCallAmount(aChoices, 3);
    }
  }

  private static void processCallAmount(ActionChoices aChoices, int aButtonNumber)
  {
    //TODO get the call amount and set here
  }
}
