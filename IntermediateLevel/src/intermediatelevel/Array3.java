 package intermediatelevel;
import java.util.Scanner;
public class Array3 {
    Scanner kb = new Scanner(System.in);
        String people[][];
        String titls [] = {"Name","Tell","Birth day"};
        public void input() {
            System.out.println("How many Persons");
            int n = kb.nextInt();
            people = new String [n][titls.length];
            for(int i=0; i< people.length; i+=1) {
                for(int j=0; j<titls.length; j+=1) {
                    System.out.println("Enter "  + titls[j] + "Person " + (i+1) + " : " );
                    people[i][j] = kb.next();
                }
            }
        }
        public void show() {
            for(int i=0;  i<titls.length;  i+=1) 
                System.out.print(titls[i]+"\t");
                System.out.println("\n--------------------------------");
                for(int a=0; a<people.length; a+=1){
                    for(int b=0; b<titls.length; b+=1) 
                        System.out.print(people[a][b] + "\t");
                    System.out.println(" ");
                }
        }
        
    public   Array3() {
        input();
        show();
    }
}
