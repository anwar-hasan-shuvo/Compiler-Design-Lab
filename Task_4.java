/*
Write a program to detect comment.
*/

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.startsWith("//") || input.startsWith("/*"))
        {
            System.out.print("Comment");
        }
        else
        {
            System.out.print("Not a comment");
        }
    }

}
