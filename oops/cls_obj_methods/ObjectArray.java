package com.oops.cls_obj_methods;

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {

        //Step 1
        AbcDef[] abc=new AbcDef[500];
        //step 2
        for(int i=0;i<abc.length;i++){
            abc[i]=new AbcDef();
        }
        int size;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input How Many Record You Want To Input: ");
        size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Name : ");
            abc[i].name=sc.nextLine();
            System.out.println("Roll : ");
            abc[i].roll=sc.nextInt();
        }

        //step 2 and other can merge as 1


        for(int i=0;i<size;i++){
            abc[i].display();
        }

    }
}

class  Abc{
    String name;
    int roll;

    void display(){
        System.out.println("I am Class AbcDef");
    }
}