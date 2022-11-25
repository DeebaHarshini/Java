package JavaConnect;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] ags) {
        Palindrome methodcalling = new Palindrome();
//        methodcalling.palin();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> square = new ArrayList<>();
        ArrayList<Integer> palin = new ArrayList<>();
        ArrayList<Integer> PalinDivTwo = new ArrayList<>();

        for (double input = 100; input <= 1000; input++)
        {
            double srt = Math.sqrt(input);

            if (srt == Math.floor(srt)) {
                int number = ( int ) input;
//                System.out.print(number+" ");
                square.add(number);
                int Unit = Math.floorDiv((number % 10),1);
                int Ten = Math.floorDiv((number % 100),10);
                int Hun = Math.floorDiv(number,100);

                if ((Unit == Hun )&&(number % 2 == 0))
                {
//                    System.out.print(number);
//                    palin.add(number);
                    int palinDivTwo = number / 2 ;
                    int Unit1 = Math.floorDiv((palinDivTwo % 10),1);
                    int Ten1 = Math.floorDiv((palinDivTwo % 100),10);
                    int Hun1 = Math.floorDiv(palinDivTwo,100);

                    if( Unit1 == Hun1 )
                    {
                        PalinDivTwo.add(palinDivTwo);
                        palin.add(number);
                    }

                }

            }
        }
        System.out.println("Squares : "+square);
        System.out.println("palin : "+palin);
        System.out.print("divPalin : "+PalinDivTwo);
    }
}
