package JavaConnect;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber

{
//    public int arrayList(int start,int end)
//    {
//        int[] ListOfNum = new int[end - start + 1];
//        int i  = 0 ;
//        while (start <= end)
//        {
//            ListOfNum[i] = start;
//            start++;
//            i++;
//        }
////        return ListOfNum;
//        return start;
//    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Starting Number: ");
        int startNum = sc.nextInt();
        System.out.print("Enter Ending Number: ");
        int endingNum = sc.nextInt();

        ArmstrongNumber method = new ArmstrongNumber();

        int[] ListOfNum = new int[endingNum - startNum + 1];
        int i  = 0 ;
        while (startNum <= endingNum)
        {
            ListOfNum[i] = startNum;
            startNum++;
            i++;
        }
        ArrayList<Integer> crtNum = new ArrayList<>();

        for (int j=0;j<ListOfNum.length;j++)
        {
            
        }




    }

}
