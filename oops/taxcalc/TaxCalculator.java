package com.oops.taxcalc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int personCount;
        System.out.println("""
                -------Tax Calculator App--------
                -------------Welcome-------------
                """);
        System.out.print("Input Total Number Of Person: ");
        personCount=sc.nextInt();
        sc.nextLine();
        String[] name =new String[personCount];
        long[] income = new long[personCount];

        for(int i=0;i<personCount;i++){
            System.out.printf("Enter Name %d : ",i+1);
            name[i]=sc.nextLine();
            System.out.print("Enter "+name[i]+"'s Annual Income: ");
            income[i]=sc.nextInt();
            sc.nextLine();

        }
        System.out.println("-----------------------------------");
        System.out.println("Name with liable taxes");
        System.out.println("-----------------------------------");
        TaxCalculator tc=new TaxCalculator();
        for(int i=0;i<personCount;i++){
            tc.calculateTax(name[i],income[i]);
        }
    }
    void calculateTax(String name,long income){
        long tax;
        if(income>=300000){
            tax=(income*20)/100;
        }else if(income>=100000){
            tax=(income*10)/100;
        }else{
            tax=0;
        }
        System.out.println(name+" : "+tax);
    }
}
