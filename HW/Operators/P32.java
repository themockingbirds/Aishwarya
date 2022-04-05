import java.util.Scanner;
/*
	22. WAP to input three number and display the greatest number using Conditional Operator.
	Input format:
		Input 1st num: 10
		Input 2nd num: 5
		Input 3rd num: 22
	Output Format:
		22 is greatest.

 */

class P32{
	public static void main(String arg[]){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter three numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println((a>b&&a>c)?a+" is greatest":(b>a&&b>c)?b+" is greatest":c+" is greatest");
	}
}