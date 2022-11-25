package JavaConnect;

import java.util.Scanner;

public class RemoveJunk {
    public void StringBuilderInput()
    {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter a value : ");
        sb.append(scan.nextLine());
        removeJunk(sb);
    }
    public void removeJunk(StringBuilder word)
    {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length() ; i++)
        {
            char junk = word.charAt(i);
            if ((junk <= 90 && junk >= 65) || (junk <= 122 && junk >= 97))
            {
                output.append(junk);
            }
        }
        System.out.println(output);
    }

    public static void main (String[] args)
    {
        RemoveJunk methodCalling = new RemoveJunk();
        methodCalling.StringBuilderInput();
    }
}
