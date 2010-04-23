package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class SPADE_6 extends BaseCard
{
  public SPADE_6() throws Exception
  {
    super(Rank.SIX, Suit.SPADE, ImageIO.read(new File("images/cards/spades/6.bmp")));
  }
}
