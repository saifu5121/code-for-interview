package com.studyopedia.interview;

public class duplicate {
    public static void main(String[] args) {
        int num[]={1,2,3,2,4,5,4};
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }

            }
        }

    }
}
