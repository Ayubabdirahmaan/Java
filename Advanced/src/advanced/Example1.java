
package advanced;

import java.io.File;

public class Example1 {
   public void createFile(String path, String type) {
       try{
           File fi = new File(path);
           if(type.equals("file"))
               System.out.println(fi.createNewFile()? "Create file" : "not created file");
           else if(type.equals("folder"))
               System.out.println(fi.mkdir()? "folder created" : "not created folder");
       }catch(Exception ex) {
           System.out.println(ex.getMessage());
       }
       }
   public Example1() {
            createFile("C:\\Users\\hp\\Desktop\\hello\\ayub.ppt", "file");
}
   }

