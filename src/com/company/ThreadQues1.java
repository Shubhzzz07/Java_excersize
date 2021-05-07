package com.company;
class GoodMorning extends Thread{
    public void run(){
        while(true){
            System.out.println("GOOD MORNING........");
        }
    }
}

class WelCome extends Thread{
    public void run(){
        while(true){
            System.out.println("WELCOME THREADS........");
            try{  //Sleep method is used using exception handling of try and catch block
                sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadQues1 {
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        WelCome w = new WelCome();

       // g.start();
        //w.start();


        //set priority
        g.setPriority(5);
        w.setPriority(8);

        //get priority
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
    }
}