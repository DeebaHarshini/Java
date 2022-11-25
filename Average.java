package JavaBasic;
import java.util.Scanner;

public class Average {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array = ");
        int n = sc.nextInt();
        double[] arrLen = new double[n];
        double total = 0 ;


        for (int i= 0 ; i < arrLen.length ; i++)
        {
            System.out.print("Enter the element of an array's "+(i+1)+" value : ");
            arrLen[i] = sc.nextDouble();
        }
        for (int i = 0 ; i < arrLen.length ; i++ )
        {
            total += arrLen[i];
        }
        double average = total / arrLen.length;
        System.out.println("\nThe average is = "+average);


    }
}
