package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_2 extends BaseCard
{
  public SPADE_2() throws Exception
  {
    super(Rank.DEUCE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/2.bmp")));
  }
}
