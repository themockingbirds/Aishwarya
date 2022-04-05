package HW;

import java.util.Scanner;
//	3. WAP to print the following output:

/**
 Name                	Roll 	Age  	Class	Fees           	Fees paid
 Hello               	34   	3    	dfs  	345.00         	true
 Hello               	34   	3    	dfs  	345.00         	true
 Hello               	34   	3    	dfs  	345.00         	true
 */

class P15{
	public static void main(String arg[]){
		String name,cls,school;
		int i,roll,age;
		float fees;
		boolean feesPaid;
		Scanner s=new Scanner(System.in);
		
			System.out.print("Enter name: ");
			name=s.nextLine();
			System.out.print("Enter roll: ");
			roll=s.nextInt();
			System.out.print("Enter age: ");
			age=s.nextInt();
			s.nextLine();
			System.out.print("Enter class: ");
			cls=s.nextLine();
			System.out.print("Enter fees: ");
			fees=s.nextFloat();
			s.nextLine();
			System.out.print("Enter fees paid: ");
			feesPaid=s.nextBoolean();
			//s.nextLine();
		
		System.out.printf("%-20s\t%-5s\t%-5s\t%-5s\t%-15s\t%-10s\n","Name","Roll","Age","Class","Fees","Fees paid");
		for(i=0;i<3;i++){
			System.out.printf("%-20s\t%-5d\t%-5d\t%-5s\t%-15.2f\t%-10b\n",name,roll,age,cls,fees,feesPaid);
		}
			
	}
	
}
	
		