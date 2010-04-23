package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class CLUB_5 extends BaseCard
{
  public CLUB_5() throws Exception
  {
    super(Rank.FIVE, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/5.bmp")));
  }
}