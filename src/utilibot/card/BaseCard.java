package utilibot.card;

import java.awt.Point;

import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public interface BaseCard
{
  public static Rank mRank = Rank.UKNOWN;
  public static Suit mSuit = Suit.UNKNOWN;
  public Point[] mPoints = new Point[0];
  
  public void setRank(Rank aRank);
  
  public Rank getRank();
  
  public void setSuit(Suit aSuit);
  
  public Suit getSuit();
  
  public void setPoints(Point[] aPoints);
  
  public Point[] getPoints();
}
