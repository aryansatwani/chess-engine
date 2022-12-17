import java.util.LinkedList;
public class Queen extends Piece
{
    public Queen(int xp,int yp,boolean isWhite,String n,LinkedList<Piece>ps)
    {
    super(xp,yp,isWhite,n:"queen",ps);
    }
    public Queen(String pos,boolean isWhite,String n,LinkedList<Piece>ps)
    {
        super(pos,isWhite,n:"rook",ps);
    }


public static String posibleQ(int i){
    String list="",oldPiece;
    int r=i/8,c=i%8;
    int temp=1;
    for(int j=-1;j<=-1;j++) //these numbers talk about  direction, if both 1's then they move in a 45 degree angle
    {
        for(int k=-1;k<=1;k++)
        try{
            while(" ".equals(ps[r+temp*j][c+temp*k])) //going in j,k direction
            {
                oldPiece=ps[r+temp*j][c+temp*k];
                ps[r][c]=" ";
                ps[r+temp*j][c+temp*k]=0;
                if (kingSafe()){
                    list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                }
                ps[r][c]="Q";
                ps[r+temp*j][c+temp*k]=oldPiece; //temp keeps getting increased until there is no further to go
                temp++;
            }
            if(Character.isLower(ps[r+temp*j][c+temp*k].charAt(0)))
            {
                oldPiece=ps[r+temp*j][c+temp*k];
                ps[r][c]=" ";
                ps[r+temp*j][c+temp*k]=0;
                if (kingSafe()){
                    list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                }
                ps[r][c]="Q";
                ps[r+temp*j][c+temp*k]=oldPiece; //temp keeps getting increased until there is no further to go
                

            }
            

        }catch(Exception e){}
        temp=1;
    }
    return list;
}
