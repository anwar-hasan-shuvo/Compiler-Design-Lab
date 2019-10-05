/*
Write a program to count whitespace.
*/

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        int no_of_whiteSpace = countWhiteSpace(input);
        System.out.print("\nNumber of WhiteSpace in the text: "+no_of_whiteSpace);

    }

    public static int countWhiteSpace(String input)
    {
        int length_of_input = input.length();
        int count=0;
        for(int i=0;i<length_of_input;i++)
        {
            if(Character.isWhitespace(input.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

}
