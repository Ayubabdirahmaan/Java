package methods;
import java.util.Scanner;
public class Array1 {
        Scanner kb = new Scanner(System.in);
        int tiro [];
     public Array1() {
       tiro = new int[3];
       for(int i=0; i<tiro.length; i+=1) {
           System.out.println("Enter number 1");
          tiro[i] = kb.nextInt();
          tiro[tiro.length-1]+=tiro[i];
       }
     }
}
