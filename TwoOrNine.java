package JavaAssignment.Maths;

import java.util.Scanner;

public class TwoOrNine
{
    public static void main( String[] ags)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Starting number (Greater than 100) = ");
        int StartingNumber = scan.nextInt();
        System.out.print("Enter the Ending number (Less than 1000) = ");
        int EndingNUmber = scan.nextInt();
        System.out.print("Enter the first number (eg.2) = ");
        int FirstNumber = scan.nextInt();
        System.out.print("Enter a second number (eg.9) = ");
        int SecondNumber = scan.nextInt();

//        int StartingNumber = 100;
//        int EndingNUmber = 1000;
//        int FirstNumber = 2;
//        int SecondNumber = 9;

        int count = 0 ;

        for (int number = StartingNumber ; number <= EndingNUmber ; number++)
        {
         int Unit = Math.floorDiv((number % 10),1);
         int Ten = Math.floorDiv((number % 100),10);
         int Hun = Math.floorDiv(number,100);


         if(( Hun == FirstNumber ) || ( Hun == SecondNumber ))

         {
             if (( Ten == FirstNumber ) || ( Ten == SecondNumber ))
             {
                 if (( Unit == FirstNumber ) || ( Unit == SecondNumber))
                 {
                     System.out.print(number+" , ");
                     count++;
                 }
             }
         }
        }
        System.out.println("\nTotal numbers are there between 100 and 1000 such that every digit is either "+FirstNumber+" or "+SecondNumber+" = "+count);

    }
}
