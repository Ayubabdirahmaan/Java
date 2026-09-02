package intermediatelevel;
import java.util.Scanner;
public class Arrays {
    Scanner kb = new Scanner(System.in);
    int num [];
    int year = 2026;
    public Arrays() {
        num = new int[3];
        for(int i=0; i<num.length-1; i+=1) {
            System.out.println("Enter Your Age");
            num[i] = kb.nextInt();
            num[0] =  num[1] - year;
        }
        System.out.println("Your Age: " + num[0]);
    }
    
}
