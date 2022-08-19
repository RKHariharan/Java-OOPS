
import java.util.Scanner;

public class Starpattern {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
       System.out.println("enter the no. of rows:");
       int n=in.nextInt();
       for(int i=0;i<n;i++)
	{
		for(int j=2*(n-i);j>=0;j--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
   } 
}
    
