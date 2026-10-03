 package lastproject;
import java.io.*;
import java.util.Scanner;
public class Files {
    PrintWriter pr=null;
    FileOutputStream out=null;
    FileInputStream inp=null;
    Scanner reader=null;
    public void saveFile(String path,boolean bol){
        try{
            out=new FileOutputStream(path,bol);
            pr=new PrintWriter(out);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }// end of saveFile
    public void readFile(String path){
          try{
              inp=new FileInputStream(path);
           reader=new Scanner(inp);           
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }// end of readFile
    public void setBalance(double bal){
          try{
              saveFile("balances.txt",false);
              pr.println(bal);
              pr.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }// end of exception
    }// end of setBalance
    public void setPin(String pin){
          try{
              saveFile("passwords.txt",false);
              pr.println(pin);
              pr.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }// end of exception
    }// end of setBalance
    public double getBalance(){
        double bal=0;
         try{
             readFile("balances.txt");
             if(reader.hasNext())
                bal=reader.nextDouble();
        }catch(Exception ex){
            bal=0;
        }// end of exception
         return bal;
    }// end getBalance method
    public String getPin(){
       String pass="";
         try{
             readFile("passwords.txt");
             if(reader.hasNext())
               pass=reader.nextLine();
        }catch(Exception ex){
            pass="invalid user";
        }// end of exception
         return pass;
    }// end getBalance method
    public boolean setTransaction(String type,String tell,double money){
        try{
            saveFile("transactions.txt",true);
            pr.println(type+","+tell+","+money);
            pr.close();
            return true;
        }catch(Exception ex){
            return false;
        }
    }// end of transaction method
    public void getLastAction(){
        try{
            readFile("transactions.txt");
            String txt="";
            while(reader.hasNext())
                txt=reader.nextLine();
            String rows[]=txt.split(",");
            if(rows[0].equals("wareejin"))
                System.out.println("Waxaad u wareejisay number-ka "+rows[1]+" lacag dhan $"+rows[2]+" waan ku mahadsantay isticmaalka");
            else if(rows[1].equals("kushub"))
                      System.out.println("Waxaad ugu shubtay number-ka "+rows[1]+" lacag dhan $"+rows[2]+" waan ku mahadsantay isticmaalka");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }// end of getLastAction
}// end of class
