package calc;
import java.lang.Math;
class Calculater{
    public void calculate(int a,int b) {
    System.out.print("your result is::"+ a+b);
    
        
    }
}

class ScCalculater{
    public void calculate(int a, int b) {
        System.out.print("result is::"+ Math.sin(a+b));
    }
}

class HyCalculater{
    public void calculate(int a, int b) {
        System.out.println("result is::"+ (a+b));
        System.out.print("result is::"+ Math.sin(a+b));
    }
}
public class problem1{
    public static void main(String[] args) {
        System.out.print("I m main method....");
    }
}