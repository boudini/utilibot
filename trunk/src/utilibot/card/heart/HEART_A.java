package utilibot.card.heart;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class HEART_A extends BaseCard
{
  public HEART_A() throws Exception
  {
    super(Rank.ACE, Suit.HEART, ImageIO.read(new File("images/cards/hearts/A.bmp")));
  }
}
