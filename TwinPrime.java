package JavaConnect;

import java.util.ArrayList;
import java.util.Scanner;

public class TwinPrime {
    static ArrayList<Integer> PrimeNumber = new ArrayList<>();
    static ArrayList<String> TwinPrimes = new ArrayList<>();
    static ArrayList<String> SumIsEight = new ArrayList<>();
    static int lastDigit;
    static
    {
        System.out.print("Enter the last number : ");
        Scanner scan = new Scanner(System.in);
        lastDigit = scan.nextInt();
    }
    public void Prime()
    {
        for (int number = 2 ; number <= lastDigit ; number++)
        {
            int count = 0 ;
            for (int i = 2 ; i < number ; i++ )
            {
                if ( number % i == 0 )
                {
                    count++;
                }
            }
            if ( count == 0 )
            {
                PrimeNumber.add(number);
            }
        }
        System.out.println("\nPrime number between 1 to "+lastDigit+" : "+PrimeNumber);
        TwinPrime(lastDigit);

    }
    public void TwinPrime(int last)
    {
        int product;
        for ( int number = 1 ; number <= last ; number++ )
        {
            if ( PrimeNumber.contains(number) && PrimeNumber.contains(number+2))
            {
                product = number * (number + 2);
                TwinPrimes.add("("+number+","+(number+2)+")");
                if( SumOfTwinEight(product) == 8)
                {
                    SumIsEight.add("("+number+","+(number+2)+")");
                }
            }
        }
        System.out.println("\nTwin primes between 1 to "+lastDigit+" : "+TwinPrimes);
        System.out.println("\nSum of the product of Twin primes is '8' between 1 to "+lastDigit+" : "+SumIsEight);
    }
    public int SumOfTwinEight(int num )
    {
        int sum = 0 ,digit;

        while ( num > 0 )
        {
            digit = num % 10 ;
            sum = sum + digit ;
            num = num / 10 ;
        }
        return sum;
    }
    public static void main(String args[])
    {
        TwinPrime objectCalling = new TwinPrime();
        objectCalling.Prime();
    }
}
