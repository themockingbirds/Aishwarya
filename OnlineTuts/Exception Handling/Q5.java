package com.oops.exceptionhandling;

import java.util.Scanner;

public class TestProgram4 {
    public static void main(String[] args) {
        int i;
        int a,b, result;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input : ");
            i=sc.nextInt();
            try{
                System.out.print("Input a: ");
                a=sc.nextInt();
                System.out.print("Input b: ");
                b=sc.nextInt(); //input 0 for b  to cause an exception
                System.out.print("Result : "+ (a/b));
            }catch(Exception e){
                System.out.println("Exception Occurred : "+e+"\n");
            }finally {
                System.out.println("End of nested try and catch and finally block");
            }
            System.out.println(i);
        } catch(Exception e){ 
            
            System.out.println("Exception Occurred : "+e+"\n");
        } finally {
            System.out.println("======= | Thank  you | =======");
            
        }
    }
}
