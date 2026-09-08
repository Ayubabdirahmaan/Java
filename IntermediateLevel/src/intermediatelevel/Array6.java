package intermediatelevel;
import java.util.Scanner;
public class Array6 {
    Scanner kb = new Scanner(System.in);
    String  People [][];
    String titls [] ={"Name", "Tell", "Birthday"};
        public void input() {
            System.out.println("How many :");
            int n = kb.nextInt();
            People = new String[n][titls.length];
             for(int i=0; i<People.length; i+=1) 
                for(int j=0; j<titls.length; j+=1) {
                    System.out.println("Enter " + (titls[i]) + "Person" + (i+1));
                   
                }
             }
        }
    public Array6() {
        
    }
    
}
