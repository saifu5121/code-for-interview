package com.studyopedia.interview;

public class factorial_fun {
    public static int fact(int n){
        int f=1;

        for (int i=1;i<n;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
       // int n=5;
        System.out.println(fact(5));

    }
}
