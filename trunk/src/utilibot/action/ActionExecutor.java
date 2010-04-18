package utilibot.action;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.apache.log4j.Logger;

import utilibot.table.TableIdentifier;
import utilibot.type.ActionChoices;


public class ActionExecutor
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(ActionExecutor.class);

  //Pixel locations of the Three Buttons.
  private static int BUTTON_ONE_X = 475;
  private static int BUTTON_ONE_Y = 545;

  private static int BUTTON_TWO_X = 583;
  private static int BUTTON_TWO_Y = 537;

  private static int BUTTON_THREE_X = 696;
  private static int BUTTON_THREE_Y = 529;

  /**
   * Executes the Action based on the choice passed in.
   * @param aTi The Table Identifier.
   * @param aActionChoices The ActionChoices which contains the chosen action.
   * @throws Exception Any exceptions.
   */
  public static void executeAction(TableIdentifier aTi,
                                   ActionChoices aActionChoices) throws Exception
  {
    Rectangle windowRectangle = aTi.getWindowRectangle();

    int windowX = (int) windowRectangle.getX();
    int windowY = (int) windowRectangle.getY();

    if (aActionChoices.isFold())
    {
      mLogger.info("Executing Action: FOLD");
      click(windowX + BUTTON_ONE_X, windowY + BUTTON_ONE_Y);
    }
    else if (aActionChoices.isCheck())
    {
      mLogger.info("Executing Action: CHECK");
      click(windowX + BUTTON_TWO_X, windowY + BUTTON_TWO_Y);
    }
    else if (aActionChoices.isCall() && aActionChoices.getCallButton() == 2)
    {
      mLogger.info("Executing Action: CALL (Button 2)");
      click(windowX + BUTTON_TWO_X, windowY + BUTTON_TWO_Y);
    }
    else if (aActionChoices.isCall() && aActionChoices.getCallButton() == 3)
    {
      mLogger.info("Executing Action: CALL (Button 3)");
      click(windowX + BUTTON_THREE_X, windowY + BUTTON_THREE_Y);
    }
    else if (aActionChoices.isRaise())
    {
      //TODO set raise amount before click button
      mLogger.info("Executing Action: RAISE");
      click(windowX + BUTTON_THREE_X, windowY + BUTTON_THREE_Y);
    }
    else if (aActionChoices.isBet())
    {
      //TODO set raise amount before click button
      mLogger.info("Executing Action: BET");
      click(windowX + BUTTON_THREE_X, windowY + BUTTON_THREE_Y);
    }
    else
    {
      mLogger.error("NO ACTION HAS BEEN SET.");
      throw new Exception("ERROR - Nothing to click");
    }
  }

  /**
   * Clicks with the left mouse button.
   * @param aWindowX X-Coordinate
   * @param aWindowY Y-Coordinate
   * @throws Exception Any exceptions.
   */
  private static void click(int aWindowX, int aWindowY) throws Exception
  {
    mLogger.info("Clicking (" + aWindowX + "," + aWindowY + ")");
    Robot robot = new Robot();
    robot.mouseMove(aWindowX, aWindowY);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.mouseMove(aWindowX, aWindowY - 80);
  }
}
