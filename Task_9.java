import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task_9 {

    public static void main(String[] args)
    {
        try
        {
            File f = new File("D:\\Input.txt");
            FileReader reader = new FileReader(f);
            BufferedReader buff = new BufferedReader(reader);

            StringBuilder sb = new StringBuilder();

            while(true) {
                String inputText = buff.readLine();
                if(inputText == null)
                    break;
                sb.append(inputText);
            }

            String allFile = sb.toString();

            FileWriter file = new FileWriter("D:\\Output.txt", true);
            file.write(allFile.trim().replaceAll("[\\n\\t ]", ""));
            file.close();
        }
        catch(Exception err){
            err.printStackTrace();
        }
    }

}
