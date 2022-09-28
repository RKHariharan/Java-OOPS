package UserExcepton;
import java.util.*;
public class ThrowApartmentException {
	public static void main(String[] args)
    {
       int n;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of apartments:");
        n=sc.nextInt();
        Apartment obj[]=new Apartment[n];      
        String address[]=new String[n];
        String apt_no[]=new String[n];
        int beds[]=new int[n];
        double rent[]=new double[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter address of apartment"+(i+1)+":");
        address[i]=sc.next();
        System.out.println("Enter apartment no of apartment"+(i+1)+":");
        apt_no[i]=sc.next();
        System.out.println("Enter bed countof apartment"+(i+1)+":");
        beds[i]=sc.nextInt();
        System.out.println("Enter rent of apartment"+(i+1)+":");
        rent[i]=sc.nextDouble();
        obj[i]=new Apartment(address[i],apt_no[i],beds[i],rent[i]);
        }
        for(int i=0;i<n;i++)
        {
        obj[i].AptNoError();
        obj[i].BedsError();
        obj[i].RentError();
    }
}
}
