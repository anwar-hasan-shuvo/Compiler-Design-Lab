/*
Write a program to concatenate two strings and determine the length of concatenated string.
*/

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st Input: ");
        String input_one = scanner.nextLine();

        System.out.print("2nd Input: ");
        String input_two = scanner.nextLine();

        String concatenated_text = input_one.concat(input_two);

        System.out.print("\nConcatenated String: "+concatenated_text);
        System.out.print("\nLength of concatenated string:"+concatenated_text.length());

    }

}
