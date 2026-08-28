package methods;

import java.util.Calendar;

public class Method1 {
//  static  String name = "eng ayub";
//    public String display() {
////        System.out.println("Waan ku salamay " + name);
//        return "Waan ku salamay " + name;
//    }
//    
//    public static void show() {
//        System.out.println("Hi " + name);
//    }
    public int  withRetun(int birthYear) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - birthYear;
        return  age;
    }
    
   
    
}
