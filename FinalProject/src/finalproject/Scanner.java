package finalproject;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Scanner {
    public boolean dataSave(String name, String tell, String add) {
        try{
           FileOutputStream output = new FileOutputStream("students.txt",true);
           PrintWriter pr = new PrintWriter(output);
           pr.println(name + " " +  tell + " " + add );
           return true;
        }catch(Exception ex){
            return false;
        }
    }
    public void show() {
          try{
               FileOutputStream inp = new FileOutputStream("students.txt",true);
               Scanner reader = new Scanner(inp);
          
        }catch(Exception ex){
         
        }
    }
    
}
