package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_A extends BaseCard
{
  public DIAMOND_A() throws Exception
  {
    super(Rank.ACE, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/A.bmp")));
  }
}
