package com.company;
import java.util.Scanner;
//A Java Program to demonstrate the use of if-else statement.
//It is a program of odd and even number
    public class IfElseEX {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number::");
            //defining a variable
            int number=sc.nextInt();
            //Check if the number is divisible by 2 or not
            if(number%2==0){
                System.out.println("even number");
            }else{
                System.out.println("odd number");
            }
        }
    }
