package com.oops.cls_obj_methods;

public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("I'm Main");
        //display2();  -- throw an error because no class in MainClass ,that is part of Class 2
        Class1.display2(); //call it with that class name;
        Class1.j=5;
        System.out.println("j: "+Class1.j);
        int i=Class1.j;
        i++;
        System.out.println("i: "+i);

        //for  non-static method that is part of some other class
        Class1 cls1=new Class1();
        cls1.display1();
        cls1.i=4;
        System.out.println("cls.i: "+cls1.i);
    }
}


class Class1{
    int i;
    static int j;
    void display1(){
        System.out.println("I am display 1");
    }
    static void display2(){
        System.out.println("I am display 2");
    }
}
