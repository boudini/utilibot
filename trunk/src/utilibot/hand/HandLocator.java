package utilibot.hand;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import utilibot.table.TableIdentifier;

public class HandLocator
{
  //Log4J
  private static Logger mLogger = Logger.getLogger(HandLocator.class);

  // Points where cards are shown if player is sat in that position.
  private static final Point SEAT_1 = new Point(559, 53);
  private static final Point SEAT_2 = new Point(697, 110);
  private static final Point SEAT_3 = new Point(770, 238);
  private static final Point SEAT_4 = new Point(637, 354);
  private static final Point SEAT_5 = new Point(430, 378);
  private static final Point SEAT_6 = new Point(226, 354);
  private static final Point SEAT_7 = new Point(92, 238);
  private static final Point SEAT_8 = new Point(155, 110);
  private static final Point SEAT_9 = new Point(301, 53);

  // Top-Left point of the players back card.
  private static final Point SEAT_1_BACK = new Point(502, 43);
  private static final Point SEAT_2_BACK = new Point(639, 100);
  private static final Point SEAT_3_BACK = new Point(712, 228);
  private static final Point SEAT_4_BACK = new Point(580, 344);
  private static final Point SEAT_5_BACK = new Point(372, 368);
  private static final Point SEAT_6_BACK = new Point(168, 344);
  private static final Point SEAT_7_BACK = new Point(34, 228);
  private static final Point SEAT_8_BACK = new Point(98, 100);
  private static final Point SEAT_9_BACK = new Point(244, 43);

  /**
   * Locates the seat that the player is sat in.
   * @param aTi The Table Identifier.
   * @return Top-Left point of the players back card.
   * @throws Exception Any Exception.
   */
  public static Point locateUserPosition(TableIdentifier aTi) throws Exception
  {
    //List to hold all the seat location points.
    List<Point> listOfSeats = new ArrayList<Point>();
    listOfSeats.add(SEAT_1);
    listOfSeats.add(SEAT_2);
    listOfSeats.add(SEAT_3);
    listOfSeats.add(SEAT_4);
    listOfSeats.add(SEAT_5);
    listOfSeats.add(SEAT_6);
    listOfSeats.add(SEAT_7);
    listOfSeats.add(SEAT_8);
    listOfSeats.add(SEAT_9);

    //List to hold the Top-Left points of the back cards for each seat position.
    List<Point> listOfSeatBack = new ArrayList<Point>();
    listOfSeatBack.add(SEAT_1_BACK);
    listOfSeatBack.add(SEAT_2_BACK);
    listOfSeatBack.add(SEAT_3_BACK);
    listOfSeatBack.add(SEAT_4_BACK);
    listOfSeatBack.add(SEAT_5_BACK);
    listOfSeatBack.add(SEAT_6_BACK);
    listOfSeatBack.add(SEAT_7_BACK);
    listOfSeatBack.add(SEAT_8_BACK);
    listOfSeatBack.add(SEAT_9_BACK);

    Rectangle windowRectangle = aTi.getWindowRectangle();
    Robot robot = new Robot();

    int windowX = (int) windowRectangle.getX();
    int windowY = (int) windowRectangle.getY();

    Color pixelColour;

    for (int seatPosition = 0;
             seatPosition < listOfSeats.size();
             seatPosition ++)
    {
      pixelColour = robot.getPixelColor(windowX + (int) listOfSeats.get(seatPosition).getX(), windowY + (int) listOfSeats.get(seatPosition).getY());

      if (pixelColour.equals(Color.WHITE))
      {
        mLogger.info("User is sat in seat: " + (seatPosition + 1));
        Point seatPoint = new Point((int) listOfSeatBack.get(seatPosition).getX() + windowX, (int) listOfSeatBack.get(seatPosition).getY() + windowY) ;

        return seatPoint;
      }
    }

    mLogger.error("ERROR FINDING USERS SEAT LOCATION");
    return null;
  }
}
