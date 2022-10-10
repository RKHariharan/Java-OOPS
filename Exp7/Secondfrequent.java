package com.mycompany.secondfrequent;

import java.util.Scanner;

public class Secondfrequent {
   static char second_most_freq(String s){
        int[] count=new int[256];
        int a;
        for(a=0;a<s.length();a++){
            (count[s.charAt(a)])++;
        }
        int one=0,two=0;
        for(a=0;a<256;a++){
            if(count[a]>count[one]) {
                two = one;
                one = a;
            }
            else if(count[a]>count[two] && count[a]!=count[one]){
                two=a;
            }
        }
        return (char)two;
    }
    public static void main(String[] args){
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        s= in.next();
        char x=second_most_freq(s);
        if(x!='\0') {
            System.out.println(x);
        }
        else{
            System.out.println("no second most freq character");
        }
    }
}