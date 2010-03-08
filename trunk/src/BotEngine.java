
public class BotEngine
{
  public static ActionChoices determineAction(ActionChoices aActionChoices)
  {
    if (aActionChoices.isCheck())
    {
      aActionChoices.setAllFalse();
      aActionChoices.setCheck(true);      
    }
    else
    {
      aActionChoices.setAllFalse();
      aActionChoices.setFold(true);
    }
    
    return aActionChoices;
  }
}
