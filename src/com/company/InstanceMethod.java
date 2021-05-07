package com.company;

public class InstanceMethod {
    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        InstanceMethod obj=new InstanceMethod();
        System.out.println("the addition is::"+obj.add(10,10));
                // write your code here
    }
}
