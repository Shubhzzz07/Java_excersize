package com.company;

class MyThread1 extends Thread{ //Extending Thread class
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{ //Extending Thread class
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for watching TV");
            System.out.println("I am excited!");
            i++;
        }
    }
}

public class ThreadEX1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();//Thread class method called...
        t2.start();//Thread class method called...

    }
}

