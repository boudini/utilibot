package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_3 extends BaseCard
{
  public HEART_3() throws Exception
  {
    super(Rank.THREE, Suit.HEART, ImageIO.read(new File("images/cards/hearts/3.bmp")));
  }
}
