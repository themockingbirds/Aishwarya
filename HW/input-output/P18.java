package HW;

//Input Output  7. WAP to input two number and swap their values using 3rd variables.
import java.util.Scanner;
class P18{
	public static void main(String arg[]){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a: ");
		a=s.nextInt();
		System.out.print("enter the value of b: ");
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}