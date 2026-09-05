package intermediatelevel;
import java.util.Scanner;
public class Arrays {
    Scanner kb = new Scanner(System.in);
    int tiro [];
    public Arrays() {
       tiro = new int [3];
       for(int i=0; i< tiro.length-1; i+=1) {
           System.out.println("Enter Number " + (i+1) + " : ");
          tiro[i] = kb.nextInt();
          tiro[tiro.length-1] +=tiro[i];
       }
        System.out.println("Total is " + tiro[tiro.length-1] );
       
    }
}
