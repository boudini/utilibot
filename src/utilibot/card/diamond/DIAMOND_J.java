package utilibot.card.diamond;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class DIAMOND_J extends BaseCard
{
  public DIAMOND_J() throws Exception
  {
    super(Rank.JACK, Suit.DIAMOND, ImageIO.read(new File("images/cards/diamonds/J.bmp")));
  }
}
