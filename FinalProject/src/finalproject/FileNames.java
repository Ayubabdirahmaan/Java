package finalproject;
import java.io.File;
public class FileNames {
    public void InsertFiles(String path, String type) {
        try{
            File fi=new File(path);
            if(type.equals("file"))
                System.out.println(fi.createNewFile()? "Created New File": "Not Created file");
            else if (type.equals("folder"))
                System.out.println(fi.mkdir()? "Created Folder": "Not Created folder");
                   
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
  
}
