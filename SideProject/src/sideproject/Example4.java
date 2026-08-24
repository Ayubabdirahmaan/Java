package sideproject;
import java.util.Scanner;
public class Example4 {
    Scanner kb = new Scanner(System.in);
    public Example4() {
        System.out.println("Enter You age:");
        int age = kb.nextInt();
        System.out.println("Enter you Score");
        int score = kb.nextInt();
        if(age < 18) {
            System.out.println("Your are child");
        }else if(score < 60) {
            System.out.println("Your score is low");
        }else {
            System.out.println("Welcome Man!");
        }
    }
}
