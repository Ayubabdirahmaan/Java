package intermediatelevel;
import java.util.Scanner;
public class Array6 {
    Scanner kb = new Scanner(System.in);
    String People[][];
    String titls [] ={"Name", "Tell", "Birthday"};
        public void input() {
            System.out.println("How many :");
            int n = kb.nextInt();
            People = new String[n][titls];
            
        }
    public Array6() {
        
    }
    
}
