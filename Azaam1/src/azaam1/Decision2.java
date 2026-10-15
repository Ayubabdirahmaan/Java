package azaam1;
import java.util.Scanner;
public class Decision2 {
    Scanner kb = new Scanner(System.in);
    public Decision2() {
        System.out.println("Enter Your Age:");
        int age = kb.nextInt();
        System.out.println("Enter Your Average Marks:");
        int avg = kb.nextInt();
        if(age >= 18){
            if(avg >= 50)
                System.out.println("You can join university:");
        }
    }
}
