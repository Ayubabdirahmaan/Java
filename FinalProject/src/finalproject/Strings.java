package finalproject;
import java.util.Scanner;
public class Strings {
    Scanner kb= new Scanner(System.in);
    public void input() {
        System.out.println("Enter Username");
        String user = kb.nextLine();
//        System.out.println(user.toLowerCase()); this is tolowercase
//        System.out.println(user.toUpperCase()); this is to uppercase
//            System.out.println(user.length());   this is length of string
//            System.out.println(user.concat("Welcome "));  waxaa uu isku kaa dhajinayaa laba string
//                    System.out.println(user.indexOf("M"));   eray index uu ku jiro ayuu soo sheegayaa
                    System.out.println(user.lastIndexOf("S"));
    }
    public Strings() {
        input();
    }
}
