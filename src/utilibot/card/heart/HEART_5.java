package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_5 extends BaseCard
{
  public HEART_5() throws Exception
  {
    super(Rank.FIVE, Suit.HEART, ImageIO.read(new File("images/cards/hearts/5.bmp")));
  }
}
