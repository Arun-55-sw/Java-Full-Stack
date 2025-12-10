package Arrays.File_Handling.Reading_File;

import javax.sound.sampled.Line;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reading_All_Lines {
    static void main(String[] args) {
        // This Method Will Read All The Data In the File.

        try
        {
            List<String> obj=Files.readAllLines(Paths.get("abc.txt"));
                for(String a: obj)
                {
                    System.out.println(a);
                }

        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}
