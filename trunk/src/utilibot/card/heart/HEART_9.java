package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_9 extends BaseCard
{
  public HEART_9() throws Exception
  {
    super(Rank.NINE, Suit.HEART, ImageIO.read(new File("images/cards/hearts/9.bmp")));
  }
}
