import java.io.*;

public class Task_10 {

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
            file.write(allFile.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
            file.close();
        }
        catch(Exception err){
            err.printStackTrace();
        }
    }
}
