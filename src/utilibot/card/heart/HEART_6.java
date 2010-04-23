package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_6 extends BaseCard
{
  public HEART_6() throws Exception
  {
    super(Rank.SIX, Suit.HEART, ImageIO.read(new File("images/cards/hearts/6.bmp")));
  }
}
