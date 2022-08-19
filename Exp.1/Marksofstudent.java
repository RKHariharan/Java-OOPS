package marksofstudent;

import java.util.Scanner;

public class Marksofstudent {

    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
        System.out.println("enter the grades:");
        int a=in.nextInt();
        switch(a){
            case 10:
                System.out.println("excellent");
                break;
             case 9:
                System.out.println("very good");
                break; 
             case 8:
                System.out.println("very good");
                break; 
             case 7:
                System.out.println("good");
                break; 
             case 6:
                System.out.println("good");
                break; 
             case 5:
                System.out.println("poor");
                break; 
             case 4:
                System.out.println("poor");
                break; 
             case 3:
                System.out.println("poor");
                break;
             case 2:
                System.out.println("very poor");
                break; 
             case 1:
                System.out.println("very poor");
                break;
        }
    }
    
}
