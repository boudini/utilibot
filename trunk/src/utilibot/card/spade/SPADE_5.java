package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_5 extends BaseCard
{
  public SPADE_5() throws Exception
  {
    super(Rank.FIVE, Suit.SPADE, ImageIO.read(new File("images/cards/spades/5.bmp")));
  }
}
