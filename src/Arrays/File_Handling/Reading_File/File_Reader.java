package Arrays.File_Handling.Reading_File;

import java.io.FileReader;

public class File_Reader {
    static void main(String[] args) {
        try(FileReader obj=new FileReader("abc.txt"))
        {
            int a;
          //  if ((a=obj.read())!=-1) if you want to fetch single character use "if" condition
            while((a= obj.read())!=-1)
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
