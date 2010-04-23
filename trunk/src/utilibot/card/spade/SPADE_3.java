package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_3 extends BaseCard
{
  public SPADE_3() throws Exception
  {
    super(Rank.THREE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/3.bmp")));
  }
}
