package sideproject;
import java.util.Scanner;
public class Example4 {
    Scanner kb = new Scanner(System.in);
    public Example4() {
        System.out.println("Enter Number");
        int number = kb.nextInt();
        System.out.println("1.isku dar \n2.kala jar \n3.isku dhufo");
        int max = kb.nextInt();
        
        switch(max) {
            case 1:
                System.out.println( number + number);
                break;
            case 2:
                System.out.println("number - number");
                break;
            case 3:
                System.out.println(number * number);
                break;
            default:
                System.out.println("Macsalaamo");
        }
        
        
     
    }
}
