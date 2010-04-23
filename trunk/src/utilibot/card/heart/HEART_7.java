package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_7 extends BaseCard
{
  public HEART_7() throws Exception
  {
    super(Rank.SEVEN, Suit.HEART, ImageIO.read(new File("images/cards/hearts/7.bmp")));
  }
}
