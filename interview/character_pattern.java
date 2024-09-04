package com.studyopedia.interview;

public class character_pattern {
    public static void main(String[] args) {
        char ch='A';
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.println(ch);
                ch++;
            }
        }
        System.out.println();

    }
}
