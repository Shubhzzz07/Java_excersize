package com.company;
import java.util.Scanner;
//A year is leap, if it is divisible by 4 and 400. But, not by 100.
public class LeapYearExample {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the Year=");
            int year=sc.nextInt();
            if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
                System.out.println("LEAP YEAR!");
            }
            else{
                System.out.println("COMMON YEAR!");
            }
        }
    }
