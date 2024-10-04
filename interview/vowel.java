package com.studyopedia.interview;

public class vowel {
    public static void main(String[] args) {
        char ch='w';
//        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//            System.out.println(ch + "  vowel");
//        }
//        else{
//            System.out.println(ch +"  contstraint");
//        }
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " vowel");
                break;
            default:
                System.out.println(ch + " constraint");
        }
    }
}
