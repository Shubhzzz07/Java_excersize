package com.company;

import java.util.Scanner;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle {
    Scanner sc=new Scanner(System.in);
    int speed;

    {
        System.out.println("Enter the Speed::");
        speed = sc.nextInt();
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("after Applying brake::" +speed);
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("after paddling the speed is::" +speed);
    }

}
    class CycleCompanyEx{
    public static void main(String[] args) {
        AvonCycle c=new AvonCycle();
        c.applyBrake(1);
        c.speedUp(2);
    }
}
