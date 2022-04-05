package com.oops.cls_obj_methods;

public class MethodOverloading {
    public static void main(String[] args) {
        Mo mo=new Mo();
        mo.sum();
        mo.sum(4,5);
        mo.sum(4.5f,6);
        mo.sum(4.5f,4,9);
    }
}

class Mo{
    int num1,num2;
    void sum(){
        System.out.println("num1+num2:"+(num1+num2));
    }
    void sum(int num1, int num2){
        System.out.println("num1+num2: "+(num1+num2));
    }

    void sum(float num1, int num2){
        System.out.println("num1+num2: "+(num1+num2));
    }
    void sum(float num1, int num2, int num3){
        System.out.println("num1+num2: "+(num1+num2+num3));
    }

}