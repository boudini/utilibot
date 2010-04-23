package utilibot.card.club;

import java.io.File;
import javax.imageio.ImageIO;

import utilibot.card.BaseCard;
import utilibot.card.util.Rank;
import utilibot.card.util.Suit;

public class CLUB_J extends BaseCard
{
  public CLUB_J() throws Exception
  {
    super(Rank.JACK, Suit.CLUB, ImageIO.read(new File("images/cards/clubs/J.bmp")));
  }
}
