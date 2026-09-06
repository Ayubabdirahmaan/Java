package intermediatelevel;
import java.util.Scanner;
public class Array5 {
        Scanner kb = new Scanner(System.in);
        int birthday [];
    public void input() {
        System.out.println("How many");
        int n = kb.nextInt();
        birthday = new int [n];
        for(int i=0; i<birthday.length; i+=1) {
            System.out.println("Enter birth year of person " +  (i+1)+ " : ");
            birthday[i] = kb.nextInt();
            birthday[i] = 2026 - birthday.length;
         }
            System.out.println("1.Show All \n2.Show all sorted by total asc \n3.show all with sorted by total desc \n4.find maximy");
            int ch = kb.nextInt();
            switch(ch) {
                case 1:
                    for(int j=0; j<birthday.length; j+=1) 
                        System.out.print(birthday[j] +  ",");
                    System.out.println("");
                    break;
                default:
                    System.out.println("macsalaamo");
            }
       
    }
    public Array5() {
        input();
    }
}
