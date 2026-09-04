package methods;
import java.util.Scanner;
public class Array9 {
    
    Scanner kb = new Scanner(System.in);
    String People [][];
    String titls [] ={"Name","tell", "age"};
    public void input() {
        System.out.println("Meqo qof:");
        int n = kb.nextInt();
        People = new String[n][titls.length];
        for(int i=0; i< People.length; i+=1) {
            for(int j=0; j< titls.length;  j+=1 ) {
                System.out.println("Enter "+ titls[j] + " of person " + (i+1) + " :  ");
                People[i][j] = kb.next();
            }
        }
    }
    public void show() {
        for(int i=0; i< titls.length; i+=1)
            System.out.print(titls[i] + "\t");
        System.out.println("\n-----------------------------");
        for(int a=0; a< People.length; a+=1){
            for(int b=0; b<titls.length; b+=1)
                System.out.print(People[a][b] + "\t");
            System.out.println("");
        }
    }
    public  Array9() {
        input();
        show();
    }
}
