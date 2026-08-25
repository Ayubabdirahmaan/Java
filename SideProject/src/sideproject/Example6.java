package sideproject;
import java.util.Scanner;
public class Example6 {
    int pass = 9090;
    Scanner secure = new Scanner(System.in);
    public Example6() {
        System.out.println("Please Enter You Password");
        int password = secure.nextInt();
        if(pass != password) {
            System.out.println("Your Password is Incorrect If yor what to forget you password choose option");
            System.out.println("1.forget Pass \n2.Go back");
            int choose = secure.nextInt();
            switch(choose) {
                case 1:
                    System.out.println("Enter New Passowrd");
                    int newPass = secure.nextInt();
                    pass = newPass;
                    System.out.println("congrualation You been updeted");
                    System.out.println("Enter You pin");
                    int newPin  = secure.nextInt();
                    if(newPass != newPin) {
                        System.out.println("Incorrect Pin");
                    }else {
                        System.out.println("Again Welcome ");
                    }
                    break;
                case 2:
                    System.out.println("Bye see you again");
                    break; 
                default:
                    System.out.println("Macsalaamo");
            }
        }else {
            System.out.println("Welcome");
        }
    }
}
