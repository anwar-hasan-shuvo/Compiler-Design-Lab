import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args)
    {
        try
        {
            File f = new File("D:\\Input.txt");
            Scanner scanner = new Scanner(f);

            String line = "";

            while (scanner.hasNextLine()){
                 line = scanner.nextLine();
            }

            line = line.replace(" ", "");

            FileWriter file = new FileWriter("D:\\Output.txt", true);
            file.write(line);
            file.close();
        }
        catch(Exception err){
            err.printStackTrace();
        }
    }

}
