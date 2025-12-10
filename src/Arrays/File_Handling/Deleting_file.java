package Arrays.File_Handling;

import java.io.File;

public class Deleting_file {
    static void main(String[] args) {
        // If you Want to delete file use this method.
        // if you want to use try catch you can Use.
        /*
        File obj=new File("pqr.txt");
        try
        {
            if(obj.delete())
            {
                System.out.println("File Deleted Successfully");
            }
            else
            {
                System.out.println("File Is Not Deleted");
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
        */

        // Without Using Try Catch Block.
        File obj=new File("image.png");
        if(obj.exists())
        {
            if(obj.delete())
            {
                System.out.println("File Deleted..!");
            }
            else
            {
                System.out.println("File Is Not Deleted..!");
            }
        }
        else
        {
            System.out.println("File Does Not Exist..!");
        }
    }
}

