package sideproject;

import java.util.Scanner;

public class Example3 {
    Scanner kb = new Scanner(System.in);
            
    public Example3 () {
        System.out.println("Enter your Age");
        int age = kb.nextInt();
           System.out.println("Enter you grade");
           int grade = kb.nextInt();
           
           if(age < 18 | grade < 60) {
               System.out.println("your'e Failed");
           }else {
               System.out.println("passed welcome");
           }
    }
    
}
