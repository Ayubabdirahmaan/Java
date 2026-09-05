package intermediatelevel;
import java.util.Scanner;
public class Array3 {
    Scanner kb = new Scanner(System.in);
    int tiro[];
    public Array3() {
        tiro = new int [3];
        for(int i=0; i<tiro.length-1; i+=1) {
            System.out.println("Enter Number " + (i+1) + " : ");
        }
    }
}
