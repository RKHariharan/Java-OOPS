package mainpack.one;
import mainpack.one.two.second;
public class first {
    public void display1()
    {
        System.out.println("Package 1 inside main");
        second obj=new second();
        obj.display2();
    }
}
