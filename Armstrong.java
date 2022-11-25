package JavaConnect;

import java.util.Scanner;

public class Armstrong {


    public void ArmStrong(int number,int Digit)
    {
        int num = number;
        int sum = 0 ;
        while (num > 0)
        {
            sum = sum + (int) (Math.pow((num % 10), Digit));
            num = Math.floorDiv(num,10);
        }
        if(sum == number)
        {
            System.out.println(number);
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digit = ");
        int Digit = sc.nextInt();

        int Lowest_Number = (int) Math.pow(10,(Digit-1));
        int Largest_Number = (int) Math.pow(10,Digit);

        System.out.println("Lowest_number = "+Lowest_Number+"  "+"Largest_Number = "+Largest_Number);

        Armstrong method = new Armstrong();

        for (int i = Lowest_Number;i < Largest_Number;i++)
        {
            method.ArmStrong(i,Digit);
        }
    }
}