package com.oops.constructors;
public class DefCons {
    DefCons(){
        System.out.println("I am DefCons Constructor");
    }
    public static void main(String[] args) {
        Abc abc=new Abc();
        abc.display();
    }
}

class Abc{
    Abc(){
        System.out.println("I am Abc constructor");
        display();
    }
    void display() {
        System.out.println("I am display()");
    }
}