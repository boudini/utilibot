package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class DIAMOND_6 extends BaseCard
{
  public DIAMOND_6() throws Exception
  {
    super(Rank.SIX, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/6.bmp")));
  }
}