package finalproject;
import java.util.Scanner;
public class Error {
    int a,b;
    private Scanner kb = new Scanner(System.in);
    public void input() {
        boolean bol= true;
        do{
            try{
                System.out.println("Enter Number 1");
                a= kb.nextInt();
                System.out.println("Enter Number 2");
                b= kb.nextInt();
                bol=false;
            }catch(Exception ex){
                kb.next();
                System.err.println("Fadlan tiro soo gali ");
            }
        }while(bol);
    }
    public void show() {
        int sum = a+b;
        System.out.println("Total is:" + sum);
    }
}
