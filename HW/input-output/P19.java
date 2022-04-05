package HW;

import java.util.Scanner;
//	8. WAP to input two number and swap their values without using 3rd variables

class P19{
	public static void main(String arg[]){
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a: ");
		a=s.nextInt();
		System.out.print("enter the value of b: ");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}