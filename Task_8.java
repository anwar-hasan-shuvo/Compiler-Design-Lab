/*
Write a program to take input from a text file and save the sum of number in a new text file.
*/

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args)
    {

        try
        {
            File f = new File("D:\\input.txt");
            Scanner scanner = new Scanner(f);
            int sum = 0;
            while (scanner.hasNext()){
                sum = sum + scanner.nextInt();
            }
            System.out.println("Sum:"+sum);

            FileWriter file = new FileWriter("D:\\output.txt", true);
            String res = Integer.toString(sum);
            file.write(res);
            file.close();
        }
        catch(Exception err){
            err.printStackTrace();
        }

    }
}
