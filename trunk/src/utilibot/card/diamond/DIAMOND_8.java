package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_8 extends BaseCard
{
  public DIAMOND_8() throws Exception
  {
    super(Rank.EIGHT, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/8.bmp")));
  }
}
