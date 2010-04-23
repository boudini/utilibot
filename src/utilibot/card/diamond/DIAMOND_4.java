package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_4 extends BaseCard
{
  public DIAMOND_4() throws Exception
  {
    super(Rank.FOUR, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/4.bmp")));
  }
}
