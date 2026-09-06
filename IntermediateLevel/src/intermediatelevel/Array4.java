package intermediatelevel;
import java.util.Scanner;
public class Array4 {
    Scanner kb = new Scanner(System.in);
    String people[][];
    String titls []= {"Names", "Phones", "Birthday"};
    public void input() {
        System.out.println("How many persons");
        int n = kb.nextInt();
        people = new String [n][titls.length];
        for(int i=0; i<people.length; i+=1) {
            for(int j=0; j< titls.length; j+=1) {
                System.out.println("Enter " + titls[j] + "Person" + (i+1) + " : ");
                people[i][j] = kb.next();
            }
        }
    }
            public void show() {
                for(int i=0; i<titls.length; i+=1) 
                    System.out.print(titls[i] + "\t");
                System.out.println("\n-----------------------------");
                for(int b=0; b<people.length; b+=1) {
                    for(int n=0; n<titls.length; n+=1) 
                        System.out.print(people[b][n] + "\t ");
                        System.out.println(" ");
                    }
            }
    public Array4() {
        input();
        show();
    }
    
}
