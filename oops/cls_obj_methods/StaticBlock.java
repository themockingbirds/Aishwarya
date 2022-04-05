package com.oops.cls_obj_methods;

public class StaticBlock {
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block  2");
    }
    public static void main(String[] args) {
        System.out.println("Main");
    }
    static{
        System.out.println("Block 3");
    }
}
