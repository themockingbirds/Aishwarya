package HW;

import java.util.Scanner;
/*
Q2. 	WAP to print the following output
		Name : Neha          class : 5th
		School : ABC Academy
 */

class P14{
	public static void main(String arg[]){
	String name,cls,school;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter name: ");
	name=s.nextLine();
	System.out.print("Enter class: ");
	cls=s.nextLine();
	System.out.print("Enter school: ");
	school=s.nextLine();
	System.out.println("Name: "+name+"		Class: "+cls);
	System.out.println("School: "+school);
	}
}
	
		