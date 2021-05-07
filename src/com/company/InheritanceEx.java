package com.company;
class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("This is Base class and Setting X now..");
        this.x = x;
    }

    public void prinMe() {
        System.out.println("PrintMe no!!!!!!");
    }
}
    class Derived extends Base{
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            System.out.println("This is Derived Class and Setting Y now..");
            this.y = y;
        }
    }
public class InheritanceEx {
    public static void main(String[] args) {
        //Creating object of Base class
       // Base b=new Base();
       // b.setX(1);
        //System.out.println(b.getX());

        //Creating pbject of Derived class
        Derived d=new Derived();
        d.setX(1);
        System.out.println(d.getX());
        d.setY(2);
        System.out.println(d.getY());
        d.prinMe();
    }
}
