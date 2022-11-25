package Java.Connect.Maths.ThreeDigitOddNumber;

import java.util.ArrayList;

public class ThreeDigitOddNumber
{
    public static void threeDigitOddNumber()
    {
        ArrayList<Integer> three_digit = new ArrayList<>();
        int count = 0;
        for (int number = 100; number < 1000 ;number++)
        {
            int unit = (number % 10);
            int ten = (number / 10) % 10;
            int hun = (number / 100);
            if ( (unit % 2 != 0) && (ten % 2 != 0) && (hun % 2 != 0))
            {
                if ( ( unit != ten ) && ( ten != hun ) && ( hun != unit))
                {
                    three_digit.add(number);
                    count++;
                }
            }
        }
        System.out.println(three_digit);
        System.out.println("Total no of three digit odd number : "+count);
    }
    public static void main(String[] args)
    {
        threeDigitOddNumber();
    }
}
