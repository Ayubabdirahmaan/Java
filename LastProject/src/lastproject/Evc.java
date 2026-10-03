package lastproject;
import java.util.Scanner;
public class Evc {
    Files f=new Files();
    String txt="",phone="",mon="";
    public boolean checkPin(){
        System.out.println("Enter Pin");
            String pin=f.reader.next();
            if(pin.equals(f.getPin()))
                return true;
            else
                return false;
    }//end of check
    public void getData(){
        phone=txt.substring(5, 14);
        mon=txt.substring(15, txt.length()-1);
    }
    public Evc(){
        f.reader=new Scanner(System.in);
        txt=f.reader.next();
        if(txt.startsWith("*711")){          
                System.out.println(checkPin()?"your balance is $"+f.getBalance():"invlaid pin");         
        }
        else if(txt.startsWith("*712")){
            if(checkPin()){
                getData();
                if(Double.parseDouble(mon)<=f.getBalance()){
                    boolean b=f.setTransaction("wareejin", phone, Double.parseDouble(mon));
                  if(b){
                      f.setBalance(f.getBalance()-Double.parseDouble(mon));
                        System.out.println("waxaad u wareejisay number: "+phone+" lacag dhan $"+mon+" Haragaduna waa $"+f.getBalance());
                  }
            }
            else
                System.out.println("invlaid pin");
        }            
    }// end else if
        else if(txt.startsWith("*770")){
            Scanner kb=new Scanner(System.in);
            if(checkPin()){
                System.out.println("1. Itus haraaga \n2. ku shubo \n3. Ugu shub \n4. U wareeji \n5. Warbixin");
                int ch=kb.nextInt();
                switch(ch){
                    case 1:
                        System.out.println("Haraagu waa: $"+f.getBalance());
                        break;
                    case 5:
                        System.out.println("1. Itus Haraaga \n2. Ku raadi number: ");
                        int xy=kb.nextInt();
                        if(xy==1)
                            f.getLastAction();
                        break;
                }
            }
             else
                System.out.println("invlaid pin");
        }
    }
}
