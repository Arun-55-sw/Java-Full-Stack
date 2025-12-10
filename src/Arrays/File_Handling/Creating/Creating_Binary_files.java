package Arrays.File_Handling.Creating;

import java.io.FileOutputStream;

public class Creating_Binary_files {
    static void main(String[] args) {
       try( FileOutputStream obj=new FileOutputStream("image.png"))// This Is The Constructor That's Why We No Need To Call the Obj
        {
            System.out.println("File Created Successfully");
        }
       catch (Exception e)
       {
           System.out.println("File Is Not Created");
        }
    }
}
