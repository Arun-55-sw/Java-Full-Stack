package Arrays.File_Handling.Writing;

import java.io.File;
import java.io.FileOutputStream;

public class Writing_file2 {
    static void main(String[] args) {
        //This Below Code For inserting Data into File Using Constructor method for Binary Files.
        //Inserting An Image Does Not Support In This App.

        String content="C:\\Users\\ASUS\\Downloads\\Wallpaper\\one.jpg";
        try( FileOutputStream obj=new FileOutputStream("image.jpg"))
        {
            FileOutputStream obj1=new FileOutputStream("image.jpg");

            byte[] bytes=content.getBytes();
            obj1.write(bytes);
            obj1.close();
            System.out.println("File Created Successfully");
        }

        catch (Exception e)
        {
            System.out.println("File Is Not Created");
        }

        }


    }

