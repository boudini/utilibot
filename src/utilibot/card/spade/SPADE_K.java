package utilibot.card.spade;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class SPADE_K extends BaseCard
{
  public SPADE_K() throws Exception
  {
    super(Rank.KING, Suit.SPADE, ImageIO.read(new File("images/cards/spades/K.bmp")));
  }
}
