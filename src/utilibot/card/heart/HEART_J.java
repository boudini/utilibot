package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_J extends BaseCard
{
  public HEART_J() throws Exception
  {
    super(Rank.JACK, Suit.HEART, ImageIO.read(new File("images/cards/hearts/J.bmp")));
  }
}
