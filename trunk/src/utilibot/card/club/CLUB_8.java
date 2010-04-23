package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_8 extends BaseCard
{
  public CLUB_8() throws Exception
  {
    super(Rank.EIGHT, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/8.bmp")));
  }
}
