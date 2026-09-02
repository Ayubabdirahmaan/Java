package intermediatelevel;
import java.util.Scanner;
public class Arrays {
    Scanner kb = new Scanner(System.in);
    int num [];
    public Arrays() {
        System.out.println("How many Persons");
        int n = kb.nextInt();
        for(int i=0;  i< n; i+=1) {
            System.out.println("Enter birthYear of person");  
            num[i] = kb.nextInt();
            num[2] = num[0] + num[1];
        }
        System.out.println("total is " + num[2]);
    }
    
}
