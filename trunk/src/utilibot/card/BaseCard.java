package utilibot.card;

import java.awt.image.BufferedImage;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class BaseCard
{
  public static Rank mRank = Rank.UKNOWN;
  public static Suit mSuit = Suit.UNKNOWN;
  public static BufferedImage mCardImage = null;
  
  public BaseCard(Rank aRank, Suit aSuit, BufferedImage aCardImage)
  {
    mRank = aRank;
    mSuit = aSuit;
    mCardImage = aCardImage;
  }

  public static Rank getRank()
  {
    return mRank;
  }

  public static Suit getSuit()
  {
    return mSuit;
  }

  public static BufferedImage getCardImage()
  {
    return mCardImage;
  }  
}
