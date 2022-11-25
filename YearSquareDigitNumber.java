package JavaAssignment.Maths;

public class YearSquareDigitNumber {

    public static void main (String[] args)
    {
        int count = 0;

        System.out.println("How many years during the twenty-first century have a square digital sum?\n");
        for (int year = 2000 ; year <= 2100 ; year++)
        {
            int Unit = Math.floorDiv((year % 10),1);
            int Ten = Math.floorDiv((year % 100),10);
            int Hun = Math.floorDiv((year % 1000),100);
            int Tho = Math.floorDiv(year,1000);

            int SumSquare =( Unit + Ten + Hun + Tho );
            int Square = (int) Math.sqrt(SumSquare);

            if (Math.sqrt(SumSquare)-Square == 0)
            {
                System.out.print(year+" , ");
                count++;
            }

        }
        System.out.println("\n\nTotal number of years during the twenty-first century have a square digital sum = "+count);
    }
}
