package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_10 extends BaseCard
{
  public HEART_10() throws Exception
  {
    super(Rank.TEN, Suit.HEART, ImageIO.read(new File("images/cards/hearts/10.bmp")));
  }
}
