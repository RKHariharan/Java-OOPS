package com.mycompany.electricitybill;
import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args)
    {
        details obj=new details();
        obj.getdetails();
        obj.display();  
        obj.calulation();
    }
}
class details
{
  int con_no;
  String con_name;
  int prev;
  int cru;
  String type;
  int tot;
  double tariff;
  void getdetails()
  {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter id number:");
      con_no=obj.nextInt();
      System.out.println("Enter id name:");
      con_name=obj.next();
      System.out.println("Enter prev month usage:");
      prev=obj.nextInt();
      System.out.println("Enter cuurent month usage:");
      cru=obj.nextInt();
      System.out.println("Enter type:");
      type=obj.next();
      tot=prev+cru;
  }
  void display()
  {
      System.out.println("Id: "+con_no);
      System.out.println("Name: "+con_name);
      System.out.println("Total unit consumed: "+tot);
      System.out.println("Type: "+type);   
  }
  void calulation()
  {
    switch(type){
        case "d":
            if(tot<100)
                tariff=tot;
            else if(tot>100&&tot>200)
                tariff=100+((tot-100)*2.50);
            else if(tot>200&&tot>500)
                tariff=100+250+(tot-200)*4;
            else if(tot>500)
                tariff=100+250+1200+(tot-500)*6;
            break;
        case "i":
            if(tot<100)
                tariff=tot*2;
            else if(tot>100&&tot>200)
                tariff=200+(tot-100)*4.50;
            else if(tot>200&&tot<500)
                tariff=200+450+(tot-200)*6;
            else if(tot>500)
                tariff=200+450+1800+(tot-500)*7;
            break;  
     }
      System.out.println("Total cost: "+tariff+".rupees") ;            
              
      }
  }