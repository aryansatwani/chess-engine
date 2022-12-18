public static void undoMove(String move)
{
    if(move.charAt(4)!='P')//single quotes for character, "" for string which is an object in Java
    {
    /
    chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))]=chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))];
    chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))]=String.valueOf(move.charAt(4)); 
    }
    else
    {
       //if pawn promotion
       //column1,column2,captured-piece=2,new-piece,P
       chessBoard[1][Character.getNumericValue(move.charAt(0))]="P ";
       chessBoard[0][Character.getNumericValue(move.charAt(1))]=String.valueOf(move.charAt(2)); //destination of new piece
    }
}