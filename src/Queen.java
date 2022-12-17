

public static String posibleQ(int i){
    String list="",oldPiece;
    int r=i/8,c=i%8;
    int temp=1;
    for(int j=-1;j<=-1;j++) //these numbers talk about  direction, if both 1's then they move in a 45 degree angle
    {
        for(int k=-1;k<=1;k++)
        try{
            while(" ".equals(chessBoard[r+temp*j][c+temp*k])) //going in j,k direction
            {
                oldPiece=chessBoard[r+temp*j][c+temp*k];
                chessBoard[r][c]=" ";
                chessBoard[r+temp*j][c+temp*k]=0;
                if (kingSafe()){
                    list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                }
                chessBoard[r][c]="Q";
                chessBoard[r+temp*j][c+temp*k]=oldPiece; //temp keeps getting increased until there is no further to go
                temp++;
            }
            if(Character.isLower(chessBoard[r+temp*j][c+temp*k].charAt(0)))
            {
                oldPiece=chessBoard[r+temp*j][c+temp*k];
                chessBoard[r][c]=" ";
                chessBoard[r+temp*j][c+temp*k]=0;
                if (kingSafe()){
                    list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                }
                chessBoard[r][c]="Q";
                chessBoard[r+temp*j][c+temp*k]=oldPiece; //temp keeps getting increased until there is no further to go
                

            }
            

        }catch(Exception e){}
        temp=1;
    }
    return list;
}
