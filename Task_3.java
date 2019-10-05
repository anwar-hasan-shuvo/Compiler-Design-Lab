/*
Write a program to count no. of whitespace, digit, uppercase and lowercase.
*/

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        System.out.print("\nNo of Digit: "+countDigit(input));
        System.out.print("\nNo of Space: "+countWhiteSpace(input));
        System.out.print("\nNo of Lowercase: "+countLowerCase(input));
        System.out.print("\nNo of Uppercase: "+countUpperCase(input));

    }

    public static int countDigit(String input) //method for counting digit
    {
        int count = 0;
        for(int i=0;i<input.length();i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    public static int countWhiteSpace(String input) // method for counting space
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

    public static int countLowerCase(String input) //method for counting lowercase
    {
        int length_of_input = input.length();
        int count=0;
        for(int i=0;i<length_of_input;i++)
        {
            if(Character.isLowerCase(input.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    public static int countUpperCase(String input) //method for counting uppercase
    {
        int length_of_input = input.length();
        int count=0;
        for(int i=0;i<length_of_input;i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

}
