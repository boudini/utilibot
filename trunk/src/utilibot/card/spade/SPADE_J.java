package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_J extends BaseCard
{
  public SPADE_J() throws Exception
  {
    super(Rank.JACK, Suit.SPADE, ImageIO.read(new File("images/cards/spades/J.bmp")));
  }
}
