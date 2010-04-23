package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_4 extends BaseCard
{
  public CLUB_4() throws Exception
  {
    super(Rank.FOUR, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/4.bmp")));
  }
}
