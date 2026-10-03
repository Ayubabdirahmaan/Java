 package lastproject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Example1 {
    public boolean saveData(String name, String tell, String add) {
        try{
            FileOutputStream output = new FileOutputStream("student.txt", true);
            PrintWriter pr= new PrintWriter(output);
            pr.println(name+ "" + tell + " "+ add);
            pr.close();
            return true;
        }catch(Exception ex) {
            return false;
        }
    }
    public void show() {
        try{
            FileInputStream inp = new FileInputStream("student.txt");
            Scanner reader = new Scanner(inp);
            while(reader.hasNext())
                System.out.println(reader.nextLine());
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
