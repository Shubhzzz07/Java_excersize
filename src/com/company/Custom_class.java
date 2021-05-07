package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My ID is="  + id);
        System.out.println("My Name is::"  + name);
    }
    public int getSalary(){
    System.out.println("My Salary is="  + salary);
     return salary;
}
}

public class Custom_class {
    public static void main(String [] args){
        System.out.println("This is custom class.");
        Employee shubhz=new Employee();//instantiating new employee object.
        Employee harry=new Employee();
        //Setting attributes for shubhz
        shubhz.id=1;
        shubhz.name="Shubham Mahajan";
        shubhz.salary=50;

        //Setting attributes for harry
        harry.id=2;
        harry.name="Harry Potter";
        harry.salary=30;
        //Printing the employee details
        shubhz.printDetails();
        int salary=shubhz.getSalary();

        harry.printDetails();
        harry.getSalary();

    }
}
