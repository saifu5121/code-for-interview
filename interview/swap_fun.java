package com.studyopedia.interview;

public class swap_fun {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap( a, b);
    }
}
