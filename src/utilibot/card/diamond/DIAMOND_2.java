package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_2 extends BaseCard
{
  public DIAMOND_2() throws Exception
  {
    super(Rank.DEUCE, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/2.bmp")));
  }
}
