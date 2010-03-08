
public class ActionChoices
{
  private boolean mFold = true;
  private boolean mCheck = false; 
  private boolean mCall = false;
  private boolean mRaise = false;
  
  private int mCallButton = 2;
  
  public int getCallButton()
  {
    return mCallButton;
  }
  public void setCallButton(int aCallButton)
  {
    mCallButton = aCallButton;
  }
  
  public boolean isFold()
  {
    return mFold;
  }
  public void setFold(boolean aFold)
  {
    mFold = aFold;
  }
  public boolean isCheck()
  {
    return mCheck;
  }
  public void setCheck(boolean aCheck)
  {
    mCheck = aCheck;
  }
  public boolean isCall()
  {
    return mCall;
  }
  public void setCall(boolean aCall)
  {
    mCall = aCall;
  }
  public boolean isRaise()
  {
    return mRaise;
  }
  public void setRaise(boolean aRaise)
  {
    mRaise = aRaise;
  }
  
  public void setAllFalse()
  {
    mFold = false;
    mCheck = false;
    mCall = false;
    mRaise = false;
  }
  
  @Override
  public String toString()
  {
    return "Fold: " + mFold + ", Check: " + mCheck 
           + ", Call: " + mCall + ", Raise: " + mRaise 
           + "; Call Button: " + mCallButton; 
  }
}
