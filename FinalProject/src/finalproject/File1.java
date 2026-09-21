package finalproject;
import java.io.File;
public class File1 {
    public void createFile(String path, String type) {
        try{
           File fi= new File(path);
           if(type.equals("file"))
                System.out.println(fi.createNewFile()? "create new file": "not created");
           else if(type.equals("folder"))
                System.out.println(fi.mkdir()? "create folder": "no create folder");
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public File1() {
        createFile("C:\\Users\\hp\\Desktop\\Ayub/khalid.pdf","file");
    }
}
