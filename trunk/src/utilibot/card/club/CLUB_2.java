package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class CLUB_2 extends BaseCard
{
  public CLUB_2() throws Exception
  {
    super(Rank.DEUCE, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/2.bmp")));
  }
}
