package com.studyopedia.interview;
import java.util.*;

public class pallindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;

        while(num !=0){
            rev=rev*10 + num % 10;
            num=num/10;

        }
        if(org_num == rev){
            System.out.println(org_num + " pallindrome num");
        }
        else{
            System.out.println(org_num + " not a pallindrome num");
        }



    }
}
