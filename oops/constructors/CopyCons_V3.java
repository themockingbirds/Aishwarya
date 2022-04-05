package com.oops.constructors;

//shallow copy
public class CopyCons_V3 {
    int i, j;

    CopyCons_V3() {
        i = 6;
        j = 5;
    }

    public static void main(String[] args) {
        CopyCons_V3 obj = new CopyCons_V3();
        System.out.println("i: " + obj.i + "j: " + obj.j);

        CopyCons_V3 objNew = obj;
        System.out.println("obj: " + obj);
        System.out.println("objNew: " + objNew);
        System.out.println("i: " + objNew.i + " j: " + objNew.j);

        obj.i = 16;
        obj.j = 71;
        System.out.println("After changing obj.i and  obj.j values.");
        System.out.println("objNew.i: " + objNew.i + " objNew.j: " + objNew.j);

    }
}
