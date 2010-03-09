
public class BotEngine
{
  public static ActionChoices determineAction(ActionChoices aActionChoices)
  {
    ActionChoices determinedChoice = new ActionChoices();
    if (aActionChoices.isCheck())
    {
      determinedChoice.setCheck(true);
    }
    else
    {
      determinedChoice.setFold(true);
    }
    return determinedChoice;
  }
}
