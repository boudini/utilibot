package utilibot.type;

public class ActionChoices
{
  private boolean mFold = true;
  private boolean mCheck = false;
  private boolean mCall = false;
  private boolean mRaise = false;
  private boolean mBet = false;
  private int mCallButton, mButton2Amount, mButton3Amount;

  public ActionChoices()
  {
	  mFold = false;
	  mCheck = false;
	  mCall = false;
	  mRaise = false;
	  mCallButton =-1;
	  mButton2Amount = 0;
	  mButton3Amount = 0;
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

  public int getButton2Amount()
  {
    return mButton2Amount;
  }

  public void setButton2Amount(int aButton2Amount)
  {
    mButton2Amount = aButton2Amount;
  }

  public int getButton3Amount()
  {
    return mButton3Amount;
  }

  public void setButton3Amount(int aButton3Amount)
  {
    mButton3Amount = aButton3Amount;
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
           + ", Button 2 Amount: " + mButton2Amount
           + ", Button 3 Amount: " + mButton3Amount;
  }
}
