package intermediatelevel;
import java.util.Scanner;
public class Array3 {
    Scanner kb = new Scanner(System.in);
    int tiro[][];
    public Array3() {
        System.out.println("Meeqo qof");
        int n = kb.nextInt();
        tiro = new int [n][n];
        for(int i=0; i<tiro.length; i+=1) {
            System.out.println("Enter Your birthday");
            tiro[i][i] = kb.nextInt();
            tiro[tiro.length] 
        }
        
    }
}
