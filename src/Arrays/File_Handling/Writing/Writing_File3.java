package Arrays.File_Handling.Writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writing_File3 {
    static void main(String[] args) {
        // This Below Code For Both Insert And Creating A File.

        String content = "Hello";
        try
        {
            Files.write(Paths.get("abc.txt"), content.getBytes());
            System.out.println("File Created Successfully");
        }
        catch (IOException e)
        {
            System.out.println("File Is Not Created ");
        }
    }
}

