package com.studyopedia.interview;

public class leap_year {
    public static void main(String args[]){
        int n =2024;
        if (n % 4 == 0 && n / 100 !=0 || n % 4 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("non leap year");
        }
    }


}
