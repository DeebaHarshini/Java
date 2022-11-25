package JavaAssignment.Maths;

public class ProductOfTwoDigitOdd {

    private int number,count = 0;

    public void SeparateNumber ()
    {
        for ( number = 10; number < 100 ; number++ )
        {
            int Unit = Math.floorDiv(( number % 10 ),1);
            int Ten = Math.floorDiv( number , 10);

            int Product = Unit * Ten;

            checkOdd(Product);
        }
        System.out.println("\nTotal number of product of two digit is odd : "+count);
    }
    public void checkOdd(int num )
    {
        if ( num % 2 != 0)
        {
            System.out.println(number+" -> "+num);
            count++;
        }
    }
    public static void main ( String[] args )
    {
        ProductOfTwoDigitOdd methodCalling = new ProductOfTwoDigitOdd();
        System.out.println("\nTotal number of product of two digit is odd :\n");
        methodCalling.SeparateNumber();
    }
}
