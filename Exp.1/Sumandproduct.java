package minimum;
import java.util.Scanner;
public class Sumandproduct {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter digits:");
        int a=obj.nextInt();
        int sum=0,product=1,temp,t;
        while(a>0)
        {
            t=a%10;
            sum+=t;
            product=product*t;
            a=a/10;
        }
        System.out.println("Sum of digits is "+sum);
        System.out.println("product of digits is "+product); 
    }
    
}
