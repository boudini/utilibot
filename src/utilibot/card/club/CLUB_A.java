package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_A extends BaseCard
{
  public CLUB_A() throws Exception
  {
    super(Rank.ACE, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/A.bmp")));
  }
}
