package intermediatelevel;
import java.util.Scanner;
public class Arrays {
    Scanner kb = new Scanner(System.in);
    int number[];
    public void Arrays() {
        number = new int[3];
        for(int i=0; i<number.length-1; i+=1) {
            System.out.println("Enter Number: ");
            number[i] = kb.nextInt();
            number[number.length-1] += number[i];
        }
        System.out.println("Total Numbers is " + number[number.length-1]);
    }

}
