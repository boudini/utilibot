package utilibot.engine;
import org.apache.log4j.Logger;
import utilibot.type.ActionChoices;


public class BotEngine
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(BotEngine.class);

  /**
   * Calculates what action to take.
   * @param aActionChoices The available actions that can be taken.
   * @return An ActionChoice with a single action set to true.
   */
  public static ActionChoices determineAction(ActionChoices aActionChoices)
  {
    ActionChoices determinedChoice = new ActionChoices();

    if (aActionChoices.isRaise())
    {
      mLogger.info("Action Decided: RAISE");
      determinedChoice.setRaise(true);
    }
    else
    if (aActionChoices.isCall())
    {
      mLogger.info("Action Decided: CALL");
      determinedChoice.setCall(true);
    }
    else
    if (aActionChoices.isCheck())
    {
      mLogger.info("Action Decided: CHECK");
      determinedChoice.setCheck(true);
    }
    else
    {
      mLogger.info("Action Decided: FOLD");
      determinedChoice.setFold(true);
    }

    return determinedChoice;
  }
}
