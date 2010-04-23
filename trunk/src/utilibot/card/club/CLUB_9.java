package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class CLUB_9 extends BaseCard
{
  public CLUB_9() throws Exception
  {
    super(Rank.NINE, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/9.bmp")));
  }
}
