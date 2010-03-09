package utilibot.action;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;

import utilibot.table.TableIdentifier;
import utilibot.type.ActionChoices;


public class ActionExecutor
{
  private static int BUTTON_ONE_X = 475;
  private static int BUTTON_ONE_Y = 545;
  
  private static int BUTTON_TWO_X = 583;
  private static int BUTTON_TWO_Y = 537;
  
  private static int BUTTON_THREE_X = 696;
  private static int BUTTON_THREE_Y = 529;  
  
  public static void executeAction(TableIdentifier aTi, 
                                   ActionChoices aActionChoices) throws Exception
  {
    Rectangle windowRectangle = aTi.getWindowRectangle();
    
    int windowX = (int) windowRectangle.getX();
    int windowY = (int) windowRectangle.getY();
    
    if (aActionChoices.isFold())
    {
      click(windowX + BUTTON_ONE_X, windowY + BUTTON_ONE_Y);
    }
    else if (aActionChoices.isCheck())
    {
      click(windowX + BUTTON_TWO_X, windowY + BUTTON_TWO_Y);
    }
    else if (aActionChoices.isCall() && aActionChoices.getCallButton() == 2)
    {
      click(windowX + BUTTON_TWO_X, windowY + BUTTON_TWO_Y);
    }  
    else if (aActionChoices.isCall() && aActionChoices.getCallButton() == 3)
    {
      click(windowX + BUTTON_THREE_X, windowY + BUTTON_THREE_Y);
    }  
    else if (aActionChoices.isRaise())
    {
      //TODO set raise amount before click button
      click(windowX + BUTTON_THREE_Y, windowY + BUTTON_THREE_Y);
    }
    else
    {
      throw new Exception("ERROR - Nothing to click");
    }
  }
  
  private static void click(int aWindowX, int aWindowY) throws Exception
  {
    Robot robot = new Robot();
    robot.mouseMove(aWindowX, aWindowY);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.mouseMove(aWindowX, aWindowY - 80);
  }
}
