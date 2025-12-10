package Arrays.File_Handling.Creating;

import java.io.File;

public class Creating_file {
    static void main(String[] args) {
        // This Is Create For Text File

         File obj=new File("abc.txt");
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
         } catch (Exception e)
         {
             System.out.println(e);
         }
    }
}
