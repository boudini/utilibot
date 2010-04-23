package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_2 extends BaseCard
{
  public HEART_2() throws Exception
  {
    super(Rank.DEUCE, Suit.HEART, ImageIO.read(new File("images/cards/hearts/2.bmp")));
  }
}
