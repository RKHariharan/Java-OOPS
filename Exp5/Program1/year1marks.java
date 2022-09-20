package Yeear1;
public class year1marks {
     public double sub1mark,sub2mark;
    public year1marks(double a,double b)
    {
        sub1mark=a;
        sub2mark=b;          
    }
    public String Sub1(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
    public String Sub2(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
    
}
