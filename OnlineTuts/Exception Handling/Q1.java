package com.oops.exceptionhandling;

public class ArrayIndexOutOfBounds_Ex {
    public static void main(String[] args) {
        int  size=5;
        int[] arr =new int[size];

        try{
            arr[0]=8;
            for(int i=1;i<size;i++){
                arr[i]=i+10;
            }
            arr[20]=10; 

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e+"\n");
        }finally {
            for(int i=0;i<5;i++){
                System.out.printf("arr[%d]: %d\n",i,arr[i]);
            }
        }

    }
}
