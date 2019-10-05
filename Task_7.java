/*
Write a program to find ASCII code of a character.
*/

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        System.out.print("ASCII code of "+c+ ": "+(int) c);
    }

}
