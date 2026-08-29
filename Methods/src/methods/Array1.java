package methods;
import java.util.Scanner;
public class Array1 {
        Scanner kb = new Scanner(System.in);
        int num [];
    public Array1() {
        num = new int [3];
        for(int i=0; i<num.length-1; i+=1) {
             System.out.println("Enter number 1" + (i+1)+ ",");
                num[i] = kb.nextInt();
        }
        num[num.length-1] = num[0] + num[1];
        System.out.println("Total is " + num[num.length-1]);
    }
}
