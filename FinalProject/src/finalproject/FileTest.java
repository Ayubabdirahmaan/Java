package finalproject;
import java.io.File;
public class FileTest {
    public void FileCreation(String path, String type) {
      try{
            File fi= new File(path);
        if(type.equals("file"))
            System.out.println(fi.createNewFile()? "creation file": "not creation file");
        else if(type.equals("folder"))
            System.out.println(fi.mkdir()? "creation folder" : "not creation folder");
      }catch(Exception ex) {
          System.out.println(ex.getMessage());
      }
    }
    public FileTest() {
        FileCreation("C:\\Users\\hp\\Desktop\\Salmaan\\music\\show.MVW","file");
    }
}
