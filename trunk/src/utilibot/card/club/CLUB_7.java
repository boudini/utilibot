package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_7 extends BaseCard
{
  public CLUB_7() throws Exception
  {
    super(Rank.SEVEN, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/7.bmp")));
  }
}
