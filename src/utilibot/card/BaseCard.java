package utilibot.card;

import java.awt.image.BufferedImage;

import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class BaseCard
{
  private Rank mRank = Rank.UKNOWN;
  private Suit mSuit = Suit.UNKNOWN;
  private BufferedImage mCardImage = null;
  private int mMatchValue = 0;
  
  public BaseCard(Rank aRank, Suit aSuit, BufferedImage aCardImage)
  {
    mRank = aRank;
    mSuit = aSuit;
    mCardImage = aCardImage;
  }

  public Rank getRank()
  {
    return mRank;
  }

  public Suit getSuit()
  {
    return mSuit;
  }

  public BufferedImage getCardImage()
  {
    return mCardImage;
  }

  public int getMatchValue()
  {
    return mMatchValue;
  }

  public void setMatchValue(int aMatchValue)
  {
    mMatchValue = aMatchValue;
  }  
  
  public String toString()
  {
    return mRank + " of " + mSuit + "'s";
  }  
}
