package utilibot.card.rank;

import java.awt.Point;
import utilibot.card.BaseCard;
import utilibot.card.util.Points;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class Deuce implements BaseCard
{  
  public static Rank mRank = Rank.UKNOWN;
  public static Suit mSuit = Suit.UNKNOWN;
  public Point[] mPoints = new Point[0];
  
  public Deuce()
  {      
    mRank = Rank.DEUCE;
    mSuit = Suit.UNKNOWN;
    mPoints = Points.RANK_2;
  }
  
  public Deuce(Suit aSuit)
  {      
    mRank = Rank.DEUCE;
    mSuit = aSuit;
    mPoints = Points.RANK_2;
  }
  
  @Override
  public void setRank(Rank aRank)
  {
    mRank = aRank;    
  }
  
  @Override
  public Rank getRank()
  {
    return mRank;
  }
  
  @Override
  public void setSuit(Suit aSuit)
  {
    mSuit = aSuit;    
  }
  
  @Override
  public Suit getSuit()
  {
    return mSuit;
  }
  
  @Override
  public void setPoints(Point[] aPoints)
  {
    mPoints = aPoints;
  }
  
  @Override
  public Point[] getPoints()
  {
    return mPoints;
  }
}
