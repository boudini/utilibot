import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class ActionExecutor
{
  private static int FOLD_X = 475;
  private static int FOLD_Y = 545;
  
  private static int CHECK_CALL_X = 583;
  private static int CHECK_CALL_Y = 537;
  
  private static int RAISE_CALL_X = 696;
  private static int RAISE_CALL_Y = 529;  
  
  public static void executeAction(TableIdentifier aTi, 
                                   ActionChoices aActionChoices)
                                      throws Exception
  {
    Rectangle windowRectangle = aTi.getWindowRectangle();
    
    int windowX = (int) windowRectangle.getX();
    int windowY = (int) windowRectangle.getY();
    
    if (aActionChoices.isFold())
    {
      click(windowX + FOLD_X, windowY + FOLD_Y);
    }
    else
    if (aActionChoices.isCheck())
    {
      click(windowX + CHECK_CALL_X, windowY + CHECK_CALL_Y);
    }
    else
    if (aActionChoices.isCall() && aActionChoices.getCallButton() == 2)
    {
      click(windowX + CHECK_CALL_X, windowY + CHECK_CALL_Y);
    }  
    else
    if (aActionChoices.isCall() && aActionChoices.getCallButton() == 3)
    {
      click(windowX + RAISE_CALL_X, windowY + RAISE_CALL_Y);
    }  
    else      
    if (aActionChoices.isRaise())
    {
      click(windowX + RAISE_CALL_X, windowY + RAISE_CALL_Y);
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
