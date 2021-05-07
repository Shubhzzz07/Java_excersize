package com.company;
import java.util.Scanner;
public class NestedIf{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the age::");
            int age=sc.nextInt();
            System.out.print("enter the weight::");
            int weight=sc.nextInt();
            //applying condition on age and weight
            if(age>=18 && weight>=50) {
                //if(weight>50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not Eligible to donate blood");
                }
            }
        }
