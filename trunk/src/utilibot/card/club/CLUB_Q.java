package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class CLUB_Q extends BaseCard
{
  public CLUB_Q() throws Exception
  {
    super(Rank.QUEEN, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/Q.bmp")));
  }
}
