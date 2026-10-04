package lastproject;
import java.io.File;
public class CreateFile {
    public void createFile(String path, String type) {
        try{
            File f = new File(path);
            if(type.equals("File"))
                System.out.println(f.createNewFile()? "Created File": "Not Created File");
            else 
                System.out.println(f.mkdir()?"Created Folder:": "Not Created Folder.");
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public CreateFile() {
        createFile("C:\\Users\\hp\\Desktop\\Test//somlai","folder");
    }
}
