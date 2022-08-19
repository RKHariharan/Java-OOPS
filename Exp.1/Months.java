
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int days,mon,a;
        System.out.println("Enter number of days");
        a=obj.nextInt();
        mon=a/30;
        days=a%30;
        System.out.println("No.of Months in"+a+"days is");
        System.out.println(mon+" Months"+"  "+days+"  days");  
    }
    
}