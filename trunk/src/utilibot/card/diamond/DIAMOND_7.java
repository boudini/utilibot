package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_7 extends BaseCard
{
  public DIAMOND_7() throws Exception
  {
    super(Rank.SEVEN, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/7.bmp")));
  }
}
