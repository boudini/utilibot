package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_K extends BaseCard
{
  public DIAMOND_K() throws Exception
  {
    super(Rank.KING, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/K.bmp")));
  }
}
