package JavaAssignment.Maths;

public class DigitHasFive {
    public static void main(String[] ags)
    {
        int count = 0 ;
        for (int number = 100; number < 1000 ; number++)
        {
         int Unit = Math.floorDiv((number % 10),1);
         int Ten = Math.floorDiv((number % 100),10);
         int Hun = Math.floorDiv(number,1000);

         if ((Unit == 5) || (Ten == 5) || (Hun == 5 ))
         {
             System.out.print(number+" , ");
             count++;
         }
        }
        System.out.print("\nTotal numbers are there between 100 and 1000 such that at least one of the digits is 5 = "+count);
    }
}
