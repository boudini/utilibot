package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_5 extends BaseCard
{
  public SPADE_5() throws Exception
  {
    super(Rank.FIVE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/5.bmp")));
  }
}
