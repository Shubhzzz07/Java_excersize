package com.company;
//MULTIPLE CATCH BLOCK
public class ExceptionHandlingEX1{

    public static void main(String[] args) {

        try{
            int a[]=new int[5];
           // a[5]=30/0;// for Arithmatic exception
            String s=null;
            System.out.println(s.length());//for Exception class
          //  System.out.println(a[10]);//for arrayindexoutofbound
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
