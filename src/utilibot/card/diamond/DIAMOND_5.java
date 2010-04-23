package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_5 extends BaseCard
{
  public DIAMOND_5() throws Exception
  {
    super(Rank.FIVE, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/5.bmp")));
  }
}
