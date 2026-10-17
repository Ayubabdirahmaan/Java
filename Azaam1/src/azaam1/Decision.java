package azaam1;
import java.util.Scanner;
public class Decision {
    Scanner kb = new Scanner(System.in);
    public Decision() {
        System.out.println("Enter Number");
        int n=kb.nextInt();
        if(n>100) {
            System.out.println(n+"is greater then: 100");
        }else if(n<100) {
            System.out.println(n+"is less then 100");
        }else 
            System.out.println(n+"is 100");
    }
}
