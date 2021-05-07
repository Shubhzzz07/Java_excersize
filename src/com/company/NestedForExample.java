package com.company;
import java.util.Scanner;
    public class NestedForExample {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the n number::");//taking input from keyboard as user
            int n=sc.nextInt();
//loop of i
            for(int i=1;i<=n;i++){
//loop of j
                for(int j=1;j<=4;j++){
                    System.out.println(i+" "+j);
                }//end of i
            }//end of j
        }
    }
