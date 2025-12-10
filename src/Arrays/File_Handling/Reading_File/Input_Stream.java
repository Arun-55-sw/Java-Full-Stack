package Arrays.File_Handling.Reading_File;

import java.io.FileInputStream;
import java.io.FileReader;

public class Input_Stream {
    static void main(String[] args) {
        try(FileInputStream obj=new FileInputStream("abc.txt"))
        {
            int a;
            //  if ((a=obj.read())!=-1) if you want to fetch single character use "if" condition
            while((a= obj.read())!=-1) // This While Loop For Reading Entire Data.
            {
                System.out.print((char)a);

                //System.out.print("Files Reading Successfully");
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
