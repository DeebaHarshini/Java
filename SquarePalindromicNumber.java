package JavaConnect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SquarePalindromicNumber {

    public void arrayList(int start,int end)
    {
        int[] numArray = new int[end - start + 1 ];

        int i = 0;

        while (start <= end)
        {
            numArray[i] = start;
            i++;
            start++;
        }
        System.out.println(Arrays.toString(numArray));

        ArrayList<Integer> sqNum = new ArrayList<>();
//        int[] sqNum =new int[];
        for ( int j = 0 ; j < numArray.length ; j++)
        {
            int temp1 = numArray[j];

            for (int k = 1 ; k <= temp1 ; k++)
                if (temp1 == k * k) {
                    sqNum.add(numArray[j]);
                }
        }
        System.out.println(Collections.unmodifiableList(sqNum));



    }
    public static void main(String[] ags)
    {
        SquarePalindromicNumber method = new SquarePalindromicNumber();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a starting number = ");
        int startingNum = scan.nextInt();
        System.out.print("Enter a ending number = ");
        int endingNum = scan.nextInt();

        method.arrayList(startingNum,endingNum);

//        int[] numArray = new int[endingNum - startingNum + 1 ];
//
//        int i = 0;
//
//        while (startingNum <= endingNum)
//        {
//            numArray[i] = startingNum;
//            i++;
//            startingNum++;
//        }
//        System.out.print(Arrays.toString(numArray));



    }
}
