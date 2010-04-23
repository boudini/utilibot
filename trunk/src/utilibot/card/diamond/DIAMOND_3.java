package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_3 extends BaseCard
{
  public DIAMOND_3() throws Exception
  {
    super(Rank.THREE, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/3.bmp")));
  }
}
