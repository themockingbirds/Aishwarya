package com.oops.constructors;

public class ArgCons {
    public static void main(String[] args) {
        ConsWithArg  obj1=new ConsWithArg();
        ConsWithArg  obj2=new ConsWithArg(4,5);
        ConsWithArg  obj3=new ConsWithArg(6,5,7);
    }
}

class ConsWithArg{
    int num1,num2,num3;
    ConsWithArg(){
        this(6,6);
        System.out.println("No argument constructor");

    }
    ConsWithArg(int num1,int num2){
        System.out.println("Two argument Constructor");
        System.out.println("num1+num2 =" +(num1+num2));
    }
    ConsWithArg(int num1,int num2, int num3){
        this();
        System.out.println("Three Argument Construct");
        System.out.println("num1+num2 =" +(num1+num2+num3));
    }
    void display(){
        System.out.println("Display Methods");
    }
}
