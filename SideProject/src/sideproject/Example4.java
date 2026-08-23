
package sideproject;

import java.util.Scanner;

public class Example4 {
    Scanner kb = new Scanner(System.in);
    public Example4() {
        System.out.println("Enter fist number:");
        int x= kb.nextInt();
        System.out.println("Enter last number:");
        int y= kb.nextInt();
        
        if(x> y ) {
            int score = x;
            x=y;
            y= score;
        }
        
        for(int n=x; n<=y;  n+=1) {
            System.out.print(n + ",");
        }
        
        
    }
    
}
