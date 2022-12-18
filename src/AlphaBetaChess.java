import java.util.*;
import javax.swing.*;
public class AlphaBetaChess
{
static String chessBoard[][]=
{
    {"r","k","b","q","a","b","k","r"},
    {"p","p","p","p","p","p","p","p"},
    {" "," "," "," "," "," "," "," "},
    {" "," "," "," "," "," "," "," "},
    {" "," "," "," "," "," "," "," "},
    {" "," "," "," "," "," "," "," "},
    {"P","P","P","P","P","P","P","P"},
    {"R","K","B","Q","A","B","K","R"},
};
static int kingPositionC,kingPositionL;
public static void main(String[] args)
{
    while(!"A".equals(chessBoard[kingPositionC/8][kingPositionC%8])){kingPositionC++;} //get King's location
    while(!"a".equals(chessBoard[kingPositionL/8][kingPositionL%8])){kingPositionL++;} //get King's location
    //PIECE-White/Black
    //pawn=P/p
    //knight(horse)=K/k
    //bishop=B/b
    //rook(castle)=R/r
    //Queen=Q/q
    //King=A/a

    //Strategy is to create an alpha-beta tree diagram which returns the best outcomes
    //1234b represents row1,column2 moves to row3,column4 which captured
    // b( a space that represents no capture)
    JFrame f=new JFrame("Chess Tutorial");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      UserInterface u1=new UserInterface();
      f.add(u1);
      f.setSize(500,500);
      f.setVisible("true");
      System.out.println(posibleMoves());
      makeMove("6050");
      undoMove("6050");
    for(int i=0;i<8;i++)
    {
        System.out.println(Arrays.toString(chessBoard[i]));
    }
    

}
}



