package com.company;

public class CharToString {
    public static void main(String[] args) {
        //Meth 1 use toString()
        char ch='a';
        String str=Character.toString(ch);
        System.out.println("String is::"+str);

        //meth2 use valueOf()
        String str2=String.valueOf(ch);
        System.out.println("String is::"+str2);
    }
}
