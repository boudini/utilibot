package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_9 extends BaseCard
{
  public DIAMOND_9() throws Exception
  {
    super(Rank.NINE, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/9.bmp")));
  }
}
