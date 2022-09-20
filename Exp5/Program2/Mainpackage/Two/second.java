package mainpack.one.two;
import mainpack.one.two.three.third;
public class second {
    public void display2()
    {
        System.out.println("Package 2 inside pack 1");
        third obj3=new third();
        obj3.display3();    
    }
}
