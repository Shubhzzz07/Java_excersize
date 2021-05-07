package com.company;

public class TestThrowEX1 {
    static void validate(int age) {
        if (age <= 18)
            throw new ArithmeticException("INVALID...");
        else
            System.out.println("ELIGIBLE TO VOTE...");
    }

    public static void main(String[] args) {
        validate(15);
        System.out.println("REST OF THE CODE");
    }
    }
