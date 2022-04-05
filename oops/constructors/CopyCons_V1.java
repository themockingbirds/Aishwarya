package com.oops.constructors;

//deep copy
public class CopyCons_V1 {
    String name;
    int roll;

    CopyCons_V1(int roll, String name) {
        System.out.println("2 Arg Constructor Calling...");
        this.roll = roll;
        this.name = name;
    }

    CopyCons_V1(CopyCons_V1 obj) {
        System.out.println("Copy Constructor Calling...");
        roll = obj.roll;
        name = obj.name;
        System.out.println("Copy Of Object Created Successfully..");
    }

    public static void main(String[] args) {
        CopyCons_V1 o = new CopyCons_V1(1, "Ujjawal");
        o.display();
        CopyCons_V1 copy = new CopyCons_V1(o);
        copy.display();

        //another object copy...
        CopyCons_V1 o1 = new CopyCons_V1(1, "Ujjawal");
        CopyCons_V1 copy1 = new CopyCons_V1(o1);
        o1.display();
        copy1.display();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}
