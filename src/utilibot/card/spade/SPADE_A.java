package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_A extends BaseCard
{
  public SPADE_A() throws Exception
  {
    super(Rank.ACE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/A.bmp")));
  }
}
