package intermediatelevel;
public class Array1 {
    String names []={"Ayub", "Suleyman", "Mohamed", "Farah", "Zamzam", "Khalid"};
    public Array1() {
        for(int i=0; i<names.length; i+=1) {
            System.out.print(names[i]+ ",");
        }
    }
}
