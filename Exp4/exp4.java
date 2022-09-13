
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
       Scanner obj1=new Scanner(System.in);
       rectangle obj=new rectangle(4,6,5);
       triangle obj2=new triangle(3,4,5);
       System.out.println("------Triangle------");
       System.out.println("Area:"+obj2.getarea()+"\n"+"Perimeter:"+obj2.getperimeter());
       System.out.println("------Rectangle------");
       System.out.println("Area:"+obj.getarea()+"\n"+"Perimeter:"+obj.getperimeter());
       
    }
    
}
abstract class shape
{
    int numside;
    shape(int n)
    {
       numside=n; 
    }
    int getnumside(int n)
    {
        return numside;
    }
    abstract double getarea();
    abstract double getperimeter();
}
class rectangle extends shape
        {
         int width;
         int height;
         rectangle(int nu,int he,int we)
         {
           super(nu);  
           width=we;
           height=he;
           numside=nu;
         }
         @Override
         double getarea()
         {
             return width*height;
         }
         @Override
         double getperimeter()
         {
             return 2*(width+height);
         }
        }
class triangle extends shape
    {
        int width;
        int height;
        double area;
        double peri;
        triangle(int n1,int he,int we)
        {
            super(n1);
            width=we;
            height=he;
            numside=n1;
        }
        @Override
        double getarea()
        {
           area= width*height*0.5; 
           return area;
        }
        @Override
        double getperimeter()
        {
         peri= numside+width+height;
         return peri;
        }
        
    }