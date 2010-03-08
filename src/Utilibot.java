import java.awt.Point;

public class Utilibot
{
  private static int mDelay = 3000;
  
  public static void main(String [] args) throws Exception
  {      
    TableIdentifier ti = new TableIdentifier("PokerStarsTableFrameClass", null);
  
    while(true)
    {
      //Poll Table to see if our go.
      ActPoller.pollTable(ti, mDelay); 
      
      //Locate seat position we are in.
      Point handPosition = HandLocator.locateUserPosition(ti);
      
      //Obtain the suits of the Users cards.
      HandIdentifier.getUserHand(handPosition);
    
      //Get Action Choices available to us.
      ActionChoices actionChoices = ActionChoice.getActionChoices(ti);
      
      //Determine action to take.
      actionChoices = BotEngine.determineAction(actionChoices);
      
      Thread.sleep(mDelay);
      
      //Execute the action.
      ActionExecutor.executeAction(ti, actionChoices);
    }
  }
}
