package utilibot;
import java.awt.Point;
import java.util.Random;

import org.apache.log4j.Logger;

import utilibot.action.ActionChoice;
import utilibot.action.ActionExecutor;
import utilibot.engine.BotEngine;
import utilibot.hand.HandIdentifier;
import utilibot.hand.HandLocator;
import utilibot.poller.ActPoller;
import utilibot.table.TableIdentifier;
import utilibot.type.ActionChoices;

public class Utilibot
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(Utilibot.class);

  private static final String WINDOW_CLASS_NAME = "PokerStarsTableFrameClass";
  private static final int POLL_DELAY = 3000;
  private static final int EXECUTOR_DELAY = 2000;

  public static void main(String [] args) throws Exception
  {
    TableIdentifier ti = new TableIdentifier(WINDOW_CLASS_NAME, null);
    Random randomDelay = new Random();
    int executorDelay = EXECUTOR_DELAY;

    while(true)
    {
      //Poll Table to see if our go.
      mLogger.info("Running ActPoller with 'Delay'=" + POLL_DELAY);
      ActPoller.pollTable(ti, POLL_DELAY);

      //Locate seat position we are in.
      mLogger.info("Running HandLocator");
      Point handPosition = HandLocator.locateUserPosition(ti);

      //Obtain the suits of the Users cards.
      mLogger.info("Running HandIdentifier");
      HandIdentifier.getUserHand(handPosition);

      /**
      //Get Action Choices available to us.
      mLogger.info("Running ActionChoice");
      ActionChoices actionChoices = ActionChoice.getActionChoices(ti);

      //Determine action to take.
      mLogger.info("Running BotEngine");
      actionChoices = BotEngine.determineAction(actionChoices);

      //Delay executing the action (so Utilibot is not discovered).
      executorDelay = EXECUTOR_DELAY + randomDelay.nextInt(2000);
      mLogger.info("Delaying ActionExecutor by "
                   + ((double) executorDelay) / 1000.0 + " seconds.");
      Thread.sleep(executorDelay);

      //Execute the action.
      mLogger.info("Running ActionExecutor");
      ActionExecutor.executeAction(ti, actionChoices);
      **/
    }
  }
}
