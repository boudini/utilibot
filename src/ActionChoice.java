import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;

public class ActionChoice
{  
  //BUTTON 2.
  private static final int CHECK_CALL_X = 582;
  private static final int CHECK_CALL_Y = 535;
  
  //If its a CALL on BUTTON 2.
  private static final int CHECK_CALL_BUTTON_RED = 143;
  private static final int CHECK_CALL_BUTTON_GREEN = 63;
  private static final int CHECK_CALL_BUTTON_BLUE = 14;
  
  //If its a CHECK on BUTTON 2.
  private static final int CHECK_CALL_NUMBER_RED = 225;
  private static final int CHECK_CALL_NUMBER_GREEN = 175;
  private static final int CHECK_CALL_NUMBER_BLUE = 52;

  //BUTTON 3.
  private static final int RAISE_CALL_X = 696;
  private static final int RAISE_CALL_Y = 529;  
  
  //If its a CALL on BUTTON 3.
  private static final int RAISE_CALL_BUTTON_RED = 134;
  private static final int RAISE_CALL_BUTTON_GREEN = 58;
  private static final int RAISE_CALL_BUTTON_BLUE = 11;
  
  //If its a RAISE on BUTTON 3.
  private static final int RAISE_CALL_NUMBER_RED = 250;
  private static final int RAISE_CALL_NUMBER_GREEN = 207;
  private static final int RAISE_CALL_NUMBER_BLUE = 63;  
    
  public static ActionChoices getActionChoices(TableIdentifier aTi) throws Exception
  {
    ActionChoices actionChoices = new ActionChoices();    
    Rectangle rect = aTi.getWindowRectangle();
    Robot robot = new Robot();
    
    int rectX = (int) rect.getX();
    int rectY = (int) rect.getY();
    
    Color checkCallColour = robot.getPixelColor(rectX + CHECK_CALL_X, rectY + CHECK_CALL_Y);
    
    System.out.println(checkCallColour.getRed() + "," + checkCallColour.getGreen() + "," + checkCallColour.getBlue());
        
    //If its CHECK on BUTTON 2.
    if (checkCallColour.getRed() == CHECK_CALL_NUMBER_RED
        && checkCallColour.getGreen() == CHECK_CALL_NUMBER_GREEN
        && checkCallColour.getBlue() == CHECK_CALL_NUMBER_BLUE)
    {      
      actionChoices.setCheck(true);
    }
    else
    //If its CALL on BUTTON 2.
    if (checkCallColour.getRed() == CHECK_CALL_BUTTON_RED
        && checkCallColour.getGreen() == CHECK_CALL_BUTTON_GREEN
        && checkCallColour.getBlue() == CHECK_CALL_BUTTON_BLUE)
    {
      actionChoices.setCall(true);
      actionChoices.setCallButton(2);
    }
    
    
    Color raiseCallColour = robot.getPixelColor(rectX + RAISE_CALL_X, rectY + RAISE_CALL_Y);
    
    System.out.println(raiseCallColour.getRed() + "," + raiseCallColour.getGreen() + "," + raiseCallColour.getBlue());
        
    //If its RAISE on BUTTON 3.
    if (raiseCallColour.getRed() == RAISE_CALL_NUMBER_RED
        && raiseCallColour.getGreen() == RAISE_CALL_NUMBER_GREEN
        && raiseCallColour.getBlue() == RAISE_CALL_NUMBER_BLUE)
    {      
      actionChoices.setRaise(true);
    }
    else
    //If its CALL on BUTTON 3.
    if (raiseCallColour.getRed() == RAISE_CALL_BUTTON_RED
        && raiseCallColour.getGreen() == RAISE_CALL_BUTTON_GREEN
        && raiseCallColour.getBlue() == RAISE_CALL_BUTTON_BLUE)
    {
      actionChoices.setCall(true);
      actionChoices.setCallButton(3);
    }
    
    System.out.println(actionChoices.toString());
    
    return actionChoices;
  }

}
