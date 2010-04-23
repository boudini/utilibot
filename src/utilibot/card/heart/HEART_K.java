package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class HEART_K extends BaseCard
{
  public HEART_K() throws Exception
  {
    super(Rank.KING, Suit.HEART, ImageIO.read(new File("images/cards/hearts/K.bmp")));
  }
}
