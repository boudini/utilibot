package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_9 extends BaseCard
{
  public SPADE_9() throws Exception
  {
    super(Rank.NINE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/9.bmp")));
  }
}
