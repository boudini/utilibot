package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_7 extends BaseCard
{
  public SPADE_7() throws Exception
  {
    super(Rank.SEVEN, Suit.SPADE, ImageIO.read(new File("images/cards/spades/7.bmp")));
  }
}
