public static void makeMove(String move)
{
 if(move.charAt(4)!='P')//single quotes for character, "" for string which is an object in Java
 {
 //x1,y1 moves to x2,y2 for a captured piece
 chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))]=chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))];
 chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))]=" "; //x1,y1 should now be empty
 }
 else
 {
    //if pawn promotion
    //column1,column2,captured-piece,new-piece,P
    chessBoard[1][Character.getNumericValue(move.charAt(2))]=" ";
    chessBoard[0][Character.getNumericValue(move.charAt(1))]=String.valueOf(move.charAt(3)); //destination of new piece
 }
}


