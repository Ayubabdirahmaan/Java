 package lastproject;
public class LastProject {
    public static void main(String[] args) {
//    new CreateFile();
        Example1 ob= new Example1();
        System.out.println(ob.saveData("Mohamed", "612363672", "hodan")? "saved successed":  "not saved");
        ob.show();
    }   
}
