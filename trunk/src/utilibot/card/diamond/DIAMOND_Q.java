package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_Q extends BaseCard
{
  public DIAMOND_Q() throws Exception
  {
    super(Rank.QUEEN, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/Q.bmp")));
  }
}
