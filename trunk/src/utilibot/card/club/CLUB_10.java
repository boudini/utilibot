package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_10 extends BaseCard
{
  public CLUB_10() throws Exception
  {
    super(Rank.TEN, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/10.bmp")));
  }
}
