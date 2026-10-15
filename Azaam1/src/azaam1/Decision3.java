package azaam1;
import java.util.Scanner;
public class Decision3 {
    Scanner kb= new Scanner(System.in);
    public Decision3() {
        System.out.println("Enter number:");
        int n=kb.nextInt();
        System.out.println("1.Squance \n2. cubic");
        int ch = kb.nextInt();
        
        switch(ch) {
            case 1:
                System.out.println("the square " +n  + " is" + n*n);
                break;
            case 2:
                 System.out.println("the square " +n  + " is" + n*n*n);
                 break;
            default:
                System.out.println("Macsalaamo");
    }
        
    }
}
