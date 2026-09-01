package methods;
import java.util.Scanner;
public class Array8 {
    Scanner kb = new Scanner(System.in);
    int numbers [];
    public Array8() {
        numbers = new int[3];
        for(int a=0; a<numbers.length-1; a+=1) {
            System.out.println("Enter Number " + (a+1) + " : ");
            numbers[a] = kb.nextInt();
            numbers[numbers.length-1] += numbers[a];
        }
        System.out.println("Total of Numbers is " + numbers[numbers.length-1]);
    }
}
