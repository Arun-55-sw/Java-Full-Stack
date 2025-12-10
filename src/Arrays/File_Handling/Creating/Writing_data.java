package Arrays.File_Handling.Creating;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writing_data {
    static void main(String[] args) {
        // This Method For Inserting The Data Along With Creating And This Is Preferable For Small Projects.
        String s = "abc.txt";
        try
        {
            Files.write(Paths.get(s),"Hello Arun".getBytes());
            System.out.println("File Created Successfully");
        }
        catch (IOException e)
        {
            System.out.println("File Is Not Created ");
        }
    }
}
