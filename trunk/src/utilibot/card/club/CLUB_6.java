package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_6 extends BaseCard
{
  public CLUB_6() throws Exception
  {
    super(Rank.SIX, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/6.bmp")));
  }
}
