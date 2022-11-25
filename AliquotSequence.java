package Java.Connect.Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class AliquotSequence
{
    protected static ArrayList<Integer> valid_numbers = new ArrayList<>();
    public static void getInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.print(num);
        aliquotSequence(num);
    }
    public static void aliquotSequence(int num)
    {
        if (valid_numbers.contains(num))
            return ;
        valid_numbers.add(num);

        int sum = 0;
        for (int i = 1; i <= (num/2);i++)
        {
            if ((num % i) == 0)
                sum += i ;
        }
        if (sum != 0) {
            System.out.print(" --> "+sum);
            aliquotSequence(sum);
        }
    }
    public static void main(String[] args)
    {
        getInput();
    }
}
