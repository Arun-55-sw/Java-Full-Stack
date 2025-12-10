package Arrays.File_Handling.Writing;

import java.io.File;
import java.io.FileWriter;

public class Writing_file {
    static void main(String[] args) {
        File obj=new File("pqr.txt");
        try
        {
            if(obj.createNewFile())
            {
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File Is Not Created");
            }
            // Below 3 Lines Is The Syntax For Inserting the Text To The File...!

            FileWriter obj1=new FileWriter("pqr.txt");
            obj1.write("I am God, God Is Grate");
            obj1.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

