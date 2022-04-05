package com.oops.cls_obj_methods;

import java.util.Scanner;

public class ObjectArray2 {
    public static void main(String[] args) {
        //Step 1
        AbcDef[] abc=new AbcDef[500];
        int size;
        Scanner sc =new Scanner(System.in);

        //step 2 and other can merge as 1
        System.out.print("Input How Many Record You Want To Input: ");
        size=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<size;i++){
            abc[i]=new AbcDef();
            System.out.print("Name : ");
            abc[i].name=sc.nextLine();
            System.out.print("Roll : ");
            abc[i].roll=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("-------------Display Data-------------");
        for(int i=0;i<size;i++){
            abc[i].display();
            System.out.println("--------------------------------------");
        }
    }
}

class AbcDef {
    String name;
    int roll;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}