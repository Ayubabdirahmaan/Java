package lastproject;
import java.io.File;
public class CreateFile {
    public void createFile(String path, String type) {
        try{
            File f = new File(path);
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
