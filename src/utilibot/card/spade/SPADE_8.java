package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_8 extends BaseCard
{
  public SPADE_8() throws Exception
  {
    super(Rank.EIGHT, Suit.SPADE, ImageIO.read(new File("images/cards/spades/8.bmp")));
  }
}
