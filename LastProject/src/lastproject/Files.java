 package lastproject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Files {
    PrintWriter pr= null;
    FileOutputStream out=null;
     FileInputStream inp=null;
     Scanner reader=null;
     public void saveFile(String path, boolean bol) {
         try{
             out = new FileOutputStream(path,bol);
             pr = new PrintWriter(out);
         }catch(Exception ex) {
             System.out.println(ex.getMessage());
         }
     }
     public void ReadFile(String path) {
         try{
             inp = new FileInputStream(path);
             reader = new Scanner(inp);
         }catch(Exception ex) {
             System.out.println(ex.getMessage());
         }
     }
     public void setBalance(double bal) {
          try{
            saveFile("balances.txt",false);
            pr.println(bal);
            pr.close();
         }catch(Exception ex) {
             System.out.println(ex.getMessage());
         }
     }
      public void setPin(String pin) {
          try{
            saveFile("Passwords.txt",false);
            pr.println(pin);
            pr.close();
         }catch(Exception ex) {
             System.out.println(ex.getMessage());
         }
     }
      public double getBalance() {
          try{
           ReadFile("balances.txt");
           if(reader.hasNext())
               return reader.nextDouble();
         }catch(Exception ex) {
             return 0;
         }
      
      }
}
