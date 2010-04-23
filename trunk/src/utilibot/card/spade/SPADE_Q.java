package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_Q extends BaseCard
{
  public SPADE_Q() throws Exception
  {
    super(Rank.QUEEN, Suit.SPADE, ImageIO.read(new File("images/cards/spades/Q.bmp")));
  }
}
