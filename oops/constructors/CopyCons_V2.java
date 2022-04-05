package com.oops.constructors;

//deep copy
public class CopyCons_V2 {
    String name;
    int roll;

    CopyCons_V2(int roll, String name) {
        System.out.println("2 Arg Constructor Calling...");
        this.roll = roll;
        this.name = name;
        display();
    }

    CopyCons_V2(CopyCons_V2[] obj) {
        System.out.println("Copy Constructor Calling...");
        for (CopyCons_V2 copyConsV2 : obj) {
            roll = copyConsV2.roll;
            name = copyConsV2.name;
        }
    }

    public static void main(String[] args) {
        CopyCons_V2[] original = new CopyCons_V2[3];
        original[0] = new CopyCons_V2(1, "Ujjawal");
        original[1] = new CopyCons_V2(2, "Abcdef");
        original[2] = new CopyCons_V2(3, "Hello");


        CopyCons_V2[] copy = new CopyCons_V2[original.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = new CopyCons_V2(new CopyCons_V2[]{original[i]});
        }
        for (CopyCons_V2 copyConsV2 : copy)
            copyConsV2.display();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}