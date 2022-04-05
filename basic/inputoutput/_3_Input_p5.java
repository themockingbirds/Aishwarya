package com.basic.inputoutput;

//command line arguments
public class _3_Input_p5 {
    public static void main(String[] arg) {
        System.out.println("First Name : "+arg[0]);
        System.out.println("Last Name : "+arg[1]);

        for (String s : arg) {
            System.out.println(s);
        }
    }
}
