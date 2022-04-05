import java.util.*;
//import java.util.Scanner;

class Input_p1{
	public static void main(String arg[]){
		int age;
		String name;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Age: ");
		age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Salry: ");
		salary=sc.nextFloat();
		sc.nextLine();
		
		System.out.print("Name : ");
		name=sc.nextLine();
		
		sc.close();
		
		System.out.println();
		
		System.out.println("Name : "+name+
			"\nAge: "+age+"\nSalary : "+salary);
		/*
		System.out.println("Name : "+name+
			"\nAge: "+age+"\nSalary : "+salary);
		
		System.out.print("Name : ");
		name=sc.nextLine();
		
		System.out.println("Name : "+name+
			"\nAge: "+age+"\nSalary : "+salary);
		*/ //-- throw exception ..
	}
}