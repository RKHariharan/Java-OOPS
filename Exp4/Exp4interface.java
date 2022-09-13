
import java.util.Scanner;

/*Create an interface Resizable that has a method resize which resizes the shape by a factor 
x.  Create  a  class  rectangle  that  implements  resizable  and  has  methods  to  print  the  area 
and perimeter of rectangle. Create a main method which creates the rectangle object with 
length  =10  breadth=5,  print  the  area  and  perimeter.  Resize  the  rectangle  by  5  then  print 
the  area  and  perimeter.  Create  another  class  Circle  which  has  methods  to  print  area  and 
perimeter. Resize the circle by 10 then print the area and perimeter*/
public class Exp4interface {
    public static void main(String[] args) {
        Scanner obj0=new Scanner(System.in);
        rec obj=new rec(10,5);
        circle obj2=new circle(2);
        System.out.println("------Rectangle------");
         System.out.println("Enter resize value:");
         int res=obj0.nextInt();
         obj.resize(res);
        System.out.println("Area:"+obj.area()+"\n"+"Perimeter:"+obj.peri());
         System.out.println("------circle------");
         System.out.println("Enter resize value:");
         int cr=obj0.nextInt();
         obj2.resize(cr);
        System.out.println("Area:"+obj2.area()+"\n"+"Perimeter:"+obj2.peri());
    }
}
interface resizable
{
    void resize(int x);
}
class rec implements resizable
{
    int len;
    int breadth;
    rec(int l1,int b1)
    {
        len=l1;
        breadth=b1;
    }
    @Override
    public void resize(int x)
    {
        len=len*x;
        breadth=breadth*x;
    }
    double area()
    {
        return len*breadth;
    }
    double peri()
    {
        return 2*(len+breadth);
    }
}
class circle implements resizable
{
    int radius;
    circle(int r1)
    {
      radius=r1;
    }
    @Override
    public void resize(int x)
    {
        radius=radius*x;
    }
    double area()
    {
        return 3.14*radius*radius;
    }
    double peri()
    {
        return 2*3.14*radius;
    }
}