package com.company;
import java.util.Scanner;
public class PyramidExample {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number::");
            int n=sc.nextInt();
           // for(int i=1;i<=n;i++){
             //   for(int j=n;j>=i;j--){  //reverse pyramid
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("(<o.o>) ");
                }
                System.out.println();//new line
            }
        }
    }
