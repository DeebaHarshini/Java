package JavaAssignment.Maths;

public class PuzzleOfThreeDigit {

   public static void main ( String[] args)
   {
       int count = 0;
       for( int number = 100 ; number < 1000; number++)
       {
           int Unit = Math.floorDiv(( number % 10 ),1);
           int Ten = Math.floorDiv(( number % 100 ),10);
           int Hun = Math.floorDiv(number,100);

           if ((Ten+Hun) == Unit)
           {
               System.out.print(number+" , ");
               count++;
           }

       }
       System.out.println("\nThe total number of three-digit numbers are there such that the digit in the unit's place is the sum of the other two digits = "+count);
   }
}
