package methods;
import java.util.Scanner;
public class Array5 {
    Scanner kb = new Scanner(System.in);
    int numbers [];
    public Array5() {
        numbers = new int[4];
        for(int i=0; i< numbers.length-1; i+=1) {
            System.out.println("Enter Number " + (i+1) + " : ");
            numbers[i] = kb.nextInt();
            numbers[numbers.length-1] +=numbers[i];
        }
        System.out.println("Total is: " + numbers[numbers.length-1]);
    }
}
