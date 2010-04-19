package utilibot.card.util;

import java.awt.Point;

public class Points
{
  private static final Point POINT_TL = new Point(24, 18);
  private static final Point POINT_TC = new Point(32, 18);
  private static final Point POINT_TR = new Point(40, 18);
  
  private static final Point POINT_MTU = new Point(32, 24);
  private static final Point POINT_MTL = new Point(32, 30);  
  
  private static final Point POINT_MUL = new Point(24, 31);
  private static final Point POINT_MUR = new Point(40, 31);
  
  private static final Point POINT_ML = new Point(24, 37);
  private static final Point POINT_MC = new Point(32, 37);
  private static final Point POINT_MR = new Point(40, 37);
  
  private static final Point POINT_MLL = new Point(24, 43);  
  private static final Point POINT_MLR = new Point(40, 43);
  
  private static final Point POINT_MBU = new Point(32, 45);
  private static final Point POINT_MBL = new Point(32, 50);
  
  private static final Point POINT_BL = new Point(24, 57);
  private static final Point POINT_BC = new Point(32, 57);
  private static final Point POINT_BR = new Point(40, 57);
  
  public static final Point[] RANK_10 = {POINT_TL, POINT_TR, 
                                         POINT_MTU, 
                                         POINT_MUL, POINT_MUR,
                                         POINT_MLL, POINT_MLR,
                                         POINT_MBL, 
                                         POINT_BL, POINT_BR};
  
  public static final Point[] RANK_9 = {POINT_TL, POINT_TR, 
                                        POINT_MUL, POINT_MUR,
                                        POINT_MC,
                                        POINT_MLL, POINT_MLR,
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_8 = {POINT_TL, POINT_TR, 
                                        POINT_MTL, 
                                        POINT_MUL, POINT_MUR,
                                        POINT_MLL, POINT_MLR,
                                        POINT_MBU, 
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_7 = {POINT_TL, POINT_TR, 
                                        POINT_MTL, 
                                        POINT_MUL, POINT_MUR,
                                        POINT_MLL, POINT_MLR,
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_6 = {POINT_TL, POINT_TR, 
                                        POINT_ML, POINT_MR,
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_5 = {POINT_TL, POINT_TR, 
                                        POINT_MC,
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_4 = {POINT_TL, POINT_TR,
                                        POINT_BL, POINT_BR};
  
  public static final Point[] RANK_3 = {POINT_TC, 
                                        POINT_MC,
                                        POINT_BC};
  
  public static final Point[] RANK_2 = {POINT_TC, 
                                        POINT_BC};
}
