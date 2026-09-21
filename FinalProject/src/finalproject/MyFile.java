package finalproject;
import java.io.File;
public class MyFile {
    public void createNewFile(String path, String type) {
        try{
            File fi=new File(path);
            if(type.equals("file"))
                System.out.println(fi.createNewFile()? "Create New File" : "Not created file");
            else if(type.equals("folder"))
                System.out.println(fi.mkdir()?"created new folder": "not created folder");
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public MyFile() {
        createNewFile("C:\\Users\\hp\\Desktop\\mm/zaam.pdf","file");
    }
}
