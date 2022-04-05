package com.oops.constructors;

//not using copy Constructor... here
public class CopyCons_V0 {
    private int roll;
    private String name;

    //constructor to initialize roll number and name of the student
    CopyCons_V0(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    CopyCons_V0() {
    }

    //class to create student object and print roll number and name of the student
    public static void main(String[] args) {
        CopyCons_V0 copyCons_V0 = new CopyCons_V0(101, "Sneha");
        copyCons_V0.display();

        CopyCons_V0 copy = new CopyCons_V0();
        System.out.println("copyConsV0: " + copyCons_V0);
        System.out.println("copy: " + copy);

        copy.roll = copyCons_V0.roll; //copy object data one by one
        copy.name = copyCons_V0.name; //copy object data one by one into variable
        copy.display();
    }

    //method to return roll number
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }

}