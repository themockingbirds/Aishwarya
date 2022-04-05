package com.oc;

public class Current {
    Current(){
        this(5, 5);
    }

    Current(int a,int b){
        System.out.println("a+b: "+(a+b));
    }
    Current(int c){
        System.out.println("C: "+c);

    }
    public static void main(String[] args) {
        Current obj = new Current();

    }
}
