package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_4 extends BaseCard
{
  public HEART_4() throws Exception
  {
    super(Rank.FOUR, Suit.HEART, ImageIO.read(new File("images/cards/hearts/4.bmp")));
  }
}
