package finalproject;
import java.util.Scanner;
public class Strings {
    Scanner kb= new Scanner(System.in);
    public void input() {
        System.out.println("Enter Username");
        String user = kb.nextLine();
        System.out.println(user.toLowerCase());
    }
    public Strings() {
        input();
    }
}
