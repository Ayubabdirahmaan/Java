package finalproject;
import java.io.File;
public class FellingCreations {
    public void CreationFilling(String path, String type) {
        try{
            File fi=new File(path);
            if(type.equals("File"))
                System.out.println(fi.createNewFile()?"creation file": "not creation file");
            else if(type.equals("folder"))
                System.out.println(fi.mkdir()?"creation folder" : "not creation folder");
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public FellingCreations() {
        CreationFilling("C:\\Users\\hp\\Desktop\\Music//som.pdf","File");
    }
    
}
