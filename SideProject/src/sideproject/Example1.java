package sideproject;
import java.util.Scanner;
public class Example1 {
    Scanner kb= new Scanner(System.in);
    int a,b;
   public void input() {
       System.out.println("Enter number 1:");
       a= kb.nextInt();
       System.out.println("Enter number 2: ");
       b= kb.nextInt();
   }
   public void outPut() {
       int sum = a+b;
       System.out.println("Total Sum is: " + sum);
   }
}
