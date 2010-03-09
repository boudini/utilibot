import java.awt.Point;

public class Utilibot
{
  private static final String WINDOW_CLASS_NAME = "PokerStarsTableFrameClass";
  private static final int DELAY = 3000;
  
  public static void main(String [] args) throws Exception
  {      
    TableIdentifier ti = new TableIdentifier(WINDOW_CLASS_NAME, null);
  
    while(true)
    {
      //Poll Table to see if our go.
      ActPoller.pollTable(ti, DELAY); 
      
      //Locate seat position we are in.
      Point handPosition = HandLocator.locateUserPosition(ti);
      
      //Obtain the suits of the Users cards.
      HandIdentifier.getUserHand(handPosition);
    
      //Get Action Choices available to us.
      ActionChoices actionChoices = ActionChoice.getActionChoices(ti);
      
      //Determine action to take.
      actionChoices = BotEngine.determineAction(actionChoices);
      
      Thread.sleep(DELAY);
      
      //Execute the action.
      ActionExecutor.executeAction(ti, actionChoices);
    }
  }
}
