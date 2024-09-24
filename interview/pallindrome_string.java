package com.studyopedia.interview;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class pallindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.next();
        String org_str= str;

        String rev="";
        int len=str.length();
        for(int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
       // System.out.println(rev);
        if(org_str == str){
            System.out.println("pallindrome string" + org_str);
        }
        else{
            System.out.println("non pallindrome_string" + org_str);
        }
    }
}
