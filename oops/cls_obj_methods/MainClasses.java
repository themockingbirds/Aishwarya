package com.oops.cls_obj_methods;

public class MainClasses {
    static int i;
    int j;
    public static void main(String[] args) {
        System.out.println("Main Class");
        i=5;
        System.out.println("i: "+i);

        //j=5; non-static, can't use directly in static methods static  void Main()..
        //System.out.println("j: "+j);

        display2(); //static method that's why we can call it in Main
        MainClasses.display2(); //alternative way to call a static methods using that className

        //for non-static method and variable
        MainClasses obj=new MainClasses();
        obj.j=5;
        System.out.println("j="+obj.j);
        obj.display1();

    }
    void display1(){
        System.out.println("I am display1");
        j=5; //dis1 is non-static so we can use directly here
        System.out.println("j: "+j);
        this.j =8;//alternate way to use non-static variable
    }
    static void display2(){
        System.out.println("I am display 2");
    }
}