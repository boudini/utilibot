package utilibot.type;

public class ActionChoices
{
  private boolean mFold = true;
  private boolean mCheck = false;
  private boolean mCall = false;
  private boolean mRaise = false;
  private boolean mBet = false;
  private int mCallButton, mCallAmount, mRaiseAmount;

  public ActionChoices()
  {
	  mFold = false;
	  mCheck = false;
	  mCall = false;
	  mRaise = false;
	  mCallButton =-1;
	  mCallAmount = -1;
	  mRaiseAmount = -1;
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

  public int getCallButton()
  {
    return mCallButton;
  }

  public void setCallButton(int aCallButton)
  {
    mCallButton = aCallButton;
  }

  public int getCallAmount()
  {
    return mCallAmount;
  }

  public void setCallAmount(int aCallAmount)
  {
    mCallAmount = aCallAmount;
  }

  public int getRaiseAmount()
  {
    return mRaiseAmount;
  }

  public void setRaiseAmount(int aRaiseAmount)
  {
    mRaiseAmount = aRaiseAmount;
  }  
  
  public boolean isBet()
  {
    return mBet;
  }

  public void setBet(boolean aBet)
  {
    mBet = aBet;
  }

  @Override
  public String toString()
  {
    return "Fold: " + mFold
           + ", Check: " + mCheck
           + ", Call: " + mCall
           + ", Raise: " + mRaise
           + ", Bet: " + mBet
           + ", Call Button: " + mCallButton
           + ", Call Amount: " + mCallAmount;
  }
}
