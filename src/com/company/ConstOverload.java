package com.company;
    //Java program to overload constructors
    class ConstOverload{
        int id;
        String name;
        //creating 3 arg constructor
        ConstOverload(){
        id=1;
        name="shubham";
        }
        ConstOverload(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        ConstOverload(String n){
            name = n;
        }
        public void setName(String N) {
            this.name = N;
        }
        public String getName() {
            return name;
        }
        public void setId(int k) {
            this.id = k;
        }
        public int getId() {
            return id;
        }

        public static void main(String args[]){
            ConstOverload s1 = new ConstOverload();
            ConstOverload s2 = new ConstOverload(222,"Aryan");
            ConstOverload s3=new ConstOverload("xyz");
            System.out.println(s1.getId());
            System.out.println(s1.getName());
            System.out.println(s2.getId());
            System.out.println(s2.getName());
            System.out.println(s3.getId());
            System.out.println(s3.getName());
        }
    }
