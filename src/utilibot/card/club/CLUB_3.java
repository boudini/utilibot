package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_3 extends BaseCard
{
  public CLUB_3() throws Exception
  {
    super(Rank.THREE, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/3.bmp")));
  }
}
