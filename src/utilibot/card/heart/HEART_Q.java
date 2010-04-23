package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_Q extends BaseCard
{
  public HEART_Q() throws Exception
  {
    super(Rank.QUEEN, Suit.HEART, ImageIO.read(new File("images/cards/hearts/Q.bmp")));
  }
}
