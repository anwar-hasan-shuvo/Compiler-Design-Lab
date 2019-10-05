/*
Write a program to remove whitespace.
*/

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");

        String input = scanner.nextLine();
        String output = spaceRemove(input); //output will contain the result.

        System.out.println("Text after space being removed: "+output);

    }

    public static String spaceRemove(String input) // method for space removing
    {
        return input.replace(" ", "");
    }

}
