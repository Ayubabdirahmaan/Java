package azaam1;
import java.util.Scanner;
public class Example1 {
        int birthday;
    int age = 2026;
    Scanner kb=new Scanner(System.in);
    public void input() {
        System.out.println("Gormee dhalatay:");
        birthday=kb.nextInt();
    }
    public void show() {
        int myAge = age - birthday;
        System.out.println("Waxaad Jirtaa: " + myAge + " Sano");
    }
}
