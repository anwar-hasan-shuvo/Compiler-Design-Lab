/*
Write a program to split each word into individual word.
*/

import java.util.StringTokenizer;

public class Task_6 {

    public static void main(String[] args)
    {
        String s = "Life is a tale told by an idiot, Full of sound and fury, Signifying nothing";
        StringTokenizer tokenizer = new StringTokenizer(s);

        while(tokenizer.hasMoreTokens())
        {
            System.out.println(tokenizer.nextToken());
        }

    }
}
