package JavaConnect;

import java.util.ArrayList;

public class PalinDromeSquare {
    public void palindrome()
    {
        System.out.print("The Square palindrome number between 100 to 1000 : ");
        ArrayList<Integer> SquarePalin = new ArrayList<>();
        for (int number = 100 ; number < 1000 ; number++)
        {
            for (int i = 10 ; i <= 31 ; i++)
            {
                if ( i*i == number)
                {
                    int Unit = Math.floorDiv((number % 10),1);
                    int Hun = Math.floorDiv(number,100);

                    if ( Unit == Hun )
                    {
                        SquarePalin.add(number);
//                        System.out.print(number+ " , ");
                    }
                }

            }
        }
        System.out.print(SquarePalin);
    }
    public static void main(String[] args)
    {
        PalinDromeSquare methodCalling = new PalinDromeSquare();
        methodCalling.palindrome();
    }

}
