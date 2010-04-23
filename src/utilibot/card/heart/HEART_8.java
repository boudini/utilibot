package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_8 extends BaseCard
{
  public HEART_8() throws Exception
  {
    super(Rank.EIGHT, Suit.HEART, ImageIO.read(new File("images/cards/hearts/8.bmp")));
  }
}
