package com.oops.exceptionhandling;

import java.util.Scanner;

public class TestProgram1 {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Input : ");
            i=sc.nextInt();
            System.out.println(i);
        }catch (Exception e){
            System.out.println("Exception Occurred: "+e+"\n");
        }

        System.out.println("======= | Thank  you | =======");
    }
}