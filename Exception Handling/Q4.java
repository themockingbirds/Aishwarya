package com.oops.exceptionhandling;

import java.util.Scanner;

public class TestProgram3 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input : ");
            i=sc.nextInt();
            System.out.println(i);
        } catch(Exception e){ //if there will be any exception try block throw the exception to
            // this block. after execution this block it will jump to final block and execute it.
            System.out.println("Exception Occurred : "+e+"\n");
        } finally {
            System.out.println("======= | Thank  you | =======");
            // statement inside this block always run error occurred or  not, if there will be
            // any  error that will  be placed  after this block.
        }
    }
}