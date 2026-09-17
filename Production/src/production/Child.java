package production;
public class Child extends Parent {
    public Child() {
        super(null);
    }
    public void show() {
           int sum  = a+b;
       System.out.println("Total is " + sum);
    }
}
