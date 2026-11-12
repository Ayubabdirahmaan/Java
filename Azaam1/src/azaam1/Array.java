package azaam1;
import java.util.Scanner;
public class Array {
    Scanner kb= new Scanner(System.in);
    int tiro[];
    public  Array () {
        tiro = new int[3];
        for(int a=0; a<tiro.length-1; a+=1) {
            System.out.println("Enter Number: " + (a+1));
            tiro[a] = kb.nextInt();
            tiro[tiro.length-1]+= tiro[a];
        }
        System.out.println("Total is:" +  tiro[tiro.length-1]);
    }
}
