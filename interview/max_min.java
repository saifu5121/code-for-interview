package com.studyopedia.interview;

public class max_min {
    public static void main(String args[]){
        int [] a={1,5,8,0,-10};
        int min=a[0];
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("mininum :" + min);
        System.out.println("maxmium :" + max);
    }
}
