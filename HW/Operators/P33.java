import java.util.Scanner;
/*
	23. WAP to input three number and display the smallest number using Conditional Operator.
	Input format:
		Input 1st num: 10
		Input 2nd num: 5
		Input 3rd num: 22
	Output Format:
5 is smallest.
 */
class P33{
	public static void main(String arg[]){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter three numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println((a<b&&a<c)?a+" is smallest":(b<a&&b<c)?b+" is smallest":c+" is smallestest");
	}
}