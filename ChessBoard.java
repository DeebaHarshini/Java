package JavaConnect;

import java.util.Scanner;

public class ChessBoard {
    char[][] chessBoard = new char[8][8];
    public void clearBoard()
    {
        for (int i = 0 ; i < chessBoard.length ; i++)
        {
            for (int j = 0 ; j < chessBoard[i].length;j++)
            {
               chessBoard[i][j] = 'x';
            }
        }
        inputRowAndColumn();
    }
    public void inputRowAndColumn()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Enter a row number of (1-8) : ");
        int x = scan.nextInt()-1;
        System.out.print("\n Enter a column number of (1-8) : ");
        int y = scan.nextInt()-1;
        allCoins(x,y);
    }
    public void allCoins(int x,int y)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n1.King ==> K\n2.Queen ==> Q\n3.Rook ==> R\n4.Bishop ==> B\n5.Knight ==> H\n6.Pawn ==> P");
        System.out.print("\nEnter any one of the value pf above pieces : ");
        char piece = scan.next().charAt(0);

        if ( x >= 0 && x <= 7 && y >=0 && y <= 7 )
        {
            if ( piece == 'R' || piece == 'r')
            {
               rookMove(x,y);
            }
            else if ( piece == 'K' || piece == 'k')
            {
                kingMove(x,y);
            }
            else if ( piece == 'Q' || piece == 'q')
            {
                queenMove(x,y);
            }
            else if ( piece == 'B' || piece == 'b')
            {
                bishopMove(x,y);
            }
            else if ( piece == 'H' || piece == 'h')
            {
                knightMove(x,y);
            }
            else if ( piece == 'P' || piece == 'p')
            {
                pawnMove(x,y);
            }
            else
            {
                System.out.println("Please give a correct character of pieces");
            }
        }
        else
        {
            System.out.println("Please give a correct value for Rows and Column");
        }

    }
    public void rookMove(int x,int y )
    {
        for (int i = 0 ; i <= 7 ; i++)
        {
            this.chessBoard[x][i] = '0';
            this.chessBoard[i][y] = '0';
        }
        this.chessBoard[x][y] = 'R';
        display();
    }
    public void kingMove(int x,int y)
    {
        for (int i = x-1 ; i <= x+1 ; i++)
        {
            this.chessBoard[i][y] = '0';
            for (int j = y-1 ; j <= y+1 ; j++)
            {
                this.chessBoard[x][j] = '0';
                if ( (i != x) & ( j != y) )
                {
                    this.chessBoard[i][j] = '0';
                }
            }
        }
        this.chessBoard[x][y] = 'K';
        display();
    }
    public void queenMove(int x,int y)
    {
        bishopMove(x,y);
        rookMove(x,y);
        this.chessBoard[x][y] = 'Q';
        display();
    }
    public void bishopMove(int x,int y)
    {
//       TOP RIGHT
        for ( int i=x, j=y; i>= 0 && j <= chessBoard.length-1 ; i--,j++)
        {
            this.chessBoard[i][j] = '0';
        }
//        BOTTOM LEFT
        for ( int i=x, j=y ; i <= chessBoard.length-1 && j >= 0 ; i++,j--)
        {
            this.chessBoard[i][j] = '0';
        }
//        TOP LEFT
        for ( int i=x , j=y ; i >= 0 && j >=0 ; i--,j--)
        {
            this.chessBoard[i][j] = '0';
        }
//        BOTTOM RIGHT
        for(int i=x , j=y; i<=chessBoard.length-1 && j<=chessBoard.length-1; i++,j++){

            this.chessBoard[i][j]='O';

        }
        this.chessBoard[x][y]='B';
        display();
    }
    public void knightMove(int x,int y)
    {
        if(x-1>=0 && y-2>=0){
            this.chessBoard[x-1][y-2]='O';
        }
        if(x-2>=0 && y-1>=0){
            this.chessBoard[x-2][y-1]='O';
        }
        if(x-2>=0 && y+1<=7){
            this.chessBoard[x-2][y+1]='O';
        }
        if(x-1>=0 && y+2<=7){
            this.chessBoard[x-1][y+2]='O';
        }
        if(x+1<=7 && y+2<=7){
            this.chessBoard[x+1][y+2]='O';
        }
        if(x+2<=7 && y+1<=7){
            this.chessBoard[x+2][y+1]='O';
        }
        if(x+2<=7 && y-1>=0){
            this.chessBoard[x+2][y-1]='O';
        }
        if(x+1<=7 && y-2>=0){
            this.chessBoard[x+1][y-2]='O';
        }
        this.chessBoard[x][y]='H';
        display();
    }
    public void pawnMove(int x,int y)
    {
        for ( int i = y-1 ; i <= y+1 ; i++)
        {
            this.chessBoard[x-1][i] = 'o';
        }
        this.chessBoard[x][y] = 'P';
        display();
    }
    public void display()
    {
        for(int i=0; i<chessBoard.length;i++)
        {
            System.out.println();
            for(int j=0; j<chessBoard[i].length;j++)
            {
                System.out.print(chessBoard[i][j]+" ");
            }
        }
        System.out.println();
        questionRepeat();
    }
    public void questionRepeat()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n Do you want to know others steps? ( Y / N ) : ");
        char repeat = scan.next().charAt(0);

        if (repeat == 'Y' || repeat == 'y')
        {
            clearBoard();
        }
        else if (repeat == 'N' || repeat == 'n')
        {
            System.out.println("\n ========== Thank you! ==========");
        }
        else
        {
            System.out.println("\n ===== Please give a correct input (Y/N) =====");
            questionRepeat();
        }
    }
    public static void main(String[] args)
    {
        ChessBoard MethodCalling = new ChessBoard();
        MethodCalling.clearBoard();
    }
}
