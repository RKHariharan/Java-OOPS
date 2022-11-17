package exp13;
import java.util.*;
import java.io.*;

    public class collection1
    {
        public static void main(String args[])throws IOException
        {
            ArrayList<String> obj = new ArrayList<String>();
            Scanner in=new Scanner(System.in);
            int c;
            int ch;
            int i,j;
            String str,str1;
            do
            {
                System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Search \t");
                System.out.println( "4.List string that starting with specific letter \t 5.Display");
                System.out.println("Enter the choice ");
                c=in.nextInt();
                switch(c)
                {
                    case 1:
                    {
                        System.out.println("Enter the string ");
                        str=in.next();
                        obj.add(str);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter the string ");
                        str=in.next();
                        System.out.println("Specify the index/position to insert");
                        i=in.nextInt();
                        obj.add(i-1,str);
                        System.out.println("The array list has following elements:"+obj);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter the string to search ");
                        str=in.next();
                        j=obj.indexOf(str);
                        if(j==-1)
                            System.out.println("Element not found");
                        else
                            System.out.println("Index of: "+str+" is "+j);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter the character to List string that starts with specified character");
                        str=in.next();
                        for(i=0;i<(obj.size());i++)
                        {
                            str1=obj.get(i);
                            if(str1.startsWith(str))
                            {
                                System.out.println(str1);
                            }
                        }
                        break;
                    }
                    case 5:
                    {
                        System.out.println("The array list has:"+obj);
                        break;
                    }
                }
                System.out.println("enter 0 to stop and 1 to continue again");
                ch=in.nextInt();
            }while(ch==1);
        }
    }

