package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_10 extends BaseCard
{
  public DIAMOND_10() throws Exception
  {
    super(Rank.TEN, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/10.bmp")));
  }
}
