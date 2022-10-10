package com.mycompany.wordcount;

import java.util.Scanner;

public class Wordcount {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int count=0;
       String str;
       char x;
       System.out.println("Enter a String: ");
       str=obj.nextLine();
       char[] ch = str.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]==' '||ch[i]=='*'||ch[i]==','||ch[i]=='.'||ch[i]==';'||ch[i]=='!'||ch[i]=='?')
           {
               count++;
           } 
       }
        System.out.println("Count:"+count);
    }
    
}
