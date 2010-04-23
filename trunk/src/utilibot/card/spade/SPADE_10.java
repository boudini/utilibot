package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_10 extends BaseCard
{
  public SPADE_10() throws Exception
  {
    super(Rank.TEN, Suit.SPADE, ImageIO.read(new File("images/cards/spades/10.bmp")));
  }
}
