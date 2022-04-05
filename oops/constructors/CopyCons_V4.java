package com.oops.constructors;

/**
 * Copy object using clone methods
 */
public class CopyCons_V4 implements Cloneable {
    int i, j;

    CopyCons_V4(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CopyCons_V4 obj1 = new CopyCons_V4(5, 6);
        obj1.display();

        CopyCons_V4 objNew = (CopyCons_V4) obj1.clone();
        objNew.display();

        System.out.println("obj1 :" + obj1);
        System.out.println("objNew :" + objNew);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("i: " + i + "\nj: " + j);
    }
}
