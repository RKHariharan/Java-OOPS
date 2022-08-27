
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

public class employee
{
public static void main(String[] args){
     Scanner per=new Scanner(System.in);
     emp obj=new emp(121,"Sachin","Ram",100000);
     int percent;
     System.out.println(obj.toString());
     System.out.println("Enter raise percentage:");
     percent=per.nextInt();  
     System.out.println("Annualsalary: "+obj.annual());
     System.out.println("SALARY RISE: "+obj.rsalary(percent));
}
}
class emp
{
    int id;
    String fn;
    String ln;
    int salary;
    emp(int id1,String fn1,String ln1,int salary1)
    {
        id=id1;
        fn=fn1;
        ln=ln1;
        salary=salary1;
    }
    int getId()
    {
        return id;
    }
    String firstname()
     {
      return fn;  
    }
    String lastname()
     {
      return ln;  
    }
    String name()
    {
        return fn+ln;
    }
     int salary()
    {
        return salary;
    }
     int annual()
    {
        return salary*12;
    }
    int rsalary(int percent)
    {
        salary+=(salary*percent)/100;
        return salary;
    }
    @Override
    public String toString()
    {
        return "Employee id: "+id+"\n"+"Name: "+fn+ln+"\n"+"Salary: "+salary+"\n";
    }
}
