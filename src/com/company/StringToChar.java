package com.company;

import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char ::");
        //useing charAt()
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println("Character at"+i+" position::"+ch);
        }
    }
}
