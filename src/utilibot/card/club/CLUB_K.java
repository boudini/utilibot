package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.value.Rank;
import utilibot.card.value.Suit;

public class CLUB_K extends BaseCard
{
  public CLUB_K() throws Exception
  {
    super(Rank.KING, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/K.bmp")));
  }
}
