package JavaConnect;

import java.util.Scanner;

public class UnitMatrix {
    int[][] Matrix;
    public void getInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value for row and column : ");
        int row_and_column = scan.nextInt();
        matrixCreate(row_and_column);
    }
    public void matrixCreate(int x)
    {
        Scanner scan = new Scanner(System.in);
        Matrix = new int[x][x];

        for (int i=0 ; i< Matrix.length ;i++)
        {
            System.out.println(i+"-ROW");
            for (int j=0 ; j < Matrix[i].length ;j++)
            {
                System.out.print("Enter element for "+j+" column : ");
                int element = scan.nextInt();
                Matrix[i][j] = element;
            }
        }
        displayMatrix();
    }
    public void displayMatrix()
    {
        for (int i=0 ; i< Matrix.length ;i++)
        {
            System.out.println();
            for (int j=0 ; j < Matrix[i].length ;j++)
            {
                System.out.print(Matrix[i][j]+" ");
            }
        }
        System.out.println();
        toCheckUnitMatrix();
    }
    public void toCheckUnitMatrix()
    {
        int count1=0;
        int count2=0;
        for(int i=0;i<Matrix.length;i++)
        {
            for(int j=0;j<Matrix[i].length;j++)
            {
                if((i==j) && (Matrix[i][j]==1)){
                    count1++;
                }
                if(i!=j && Matrix[i][j]==0)
                {
                    count2++;
                }
            }
        }
        if((count1==Matrix.length && count2==Matrix.length) || (count1==Matrix.length && count2==2*Matrix.length))
        {
            System.out.println("\n\n========== This is a unit Matrix ==========");    }
        else
        {
            System.out.println("\n\n========= This is not a unit Matrix ==========");
        }
        questionRepeat();
    }
    public void questionRepeat()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDo you want to check another matrix as unit matrix? ( Y / N ): ");
        char repeat = scan.next().charAt(0);

        if (repeat == 'Y' || repeat == 'y')
        {
            getInput();
        }
        else if (repeat == 'N' || repeat == 'n')
        {
            System.out.println("\n ========== Thank you! ==========");
        }
        else
        {
            System.out.println("\n ===== Please give a correct input (Y/N) =====");
            questionRepeat();
        }
    }

    public static void main(String[] args)
    {
        UnitMatrix methodCalling = new UnitMatrix();
        methodCalling.getInput();
    }
}
