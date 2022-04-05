package HW;

import java.util.Scanner;

class P5{
	public static void main(String arg[]){
		String fn,ln,bg,married;
		char gender;
		boolean isMarried;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name: ");
		fn=sc.nextLine();
		System.out.println("Enter last name: ");
		ln=sc.nextLine();
		System.out.println("Enter gender: ");
		gender=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter blood group: ");
		bg=sc.nextLine();
		System.out.println("Are you married?: ");
		isMarried=sc.nextBoolean();
		
		if(isMarried){
			System.out.println("Congratulations");
			married="Congratulations";
		}
		else{
			System.out.println("All the best");
			married="All the best";
		}
		
		System.out.println("First Name: "+fn+" Last Name: "+ln);
		System.out.println("Full Name: "+fn+""+ln);
		System.out.println("Gender: "+gender);
		System.out.println("Blood Group: "+bg);
		System.out.println(married);
	}
}