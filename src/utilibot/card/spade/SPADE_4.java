package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_4 extends BaseCard
{
  public SPADE_4() throws Exception
  {
    super(Rank.FOUR, Suit.SPADE, ImageIO.read(new File("images/cards/spades/4.bmp")));
  }
}
