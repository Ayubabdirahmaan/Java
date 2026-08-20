package sideproject;
import java.util.Scanner;
public class Example2 {
    Scanner kb= new Scanner(System.in);
    int num;
    public void Squance () {
        System.out.println("Enter Number: ");
        num = kb.nextInt();
    }
    public void display () {
        int square = num * num;
        System.out.println("The square " + num + " is " + square);
    }
}
