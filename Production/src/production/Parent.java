package production;
import java.util.Scanner;
public class Parent {
    int a,b;
    private Scanner kb = new Scanner(System.in);
    public void Input()  {
        System.out.println("Enter Number 1:");
        a= kb.nextInt();
        System.out.println("Enter Number 2:");
        b= kb.nextInt();
    }
}
