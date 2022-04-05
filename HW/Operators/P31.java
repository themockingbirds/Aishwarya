import java.util.Scanner;
/*
	21. WAP to input two number and display the where the number is equal or not using Conditional Operator.
	Input format:
		Input 1st num: 10
		Input 2nd num: 5
	Output Format:
		Num is not equal.

	Input format:
		Input 1st num: 5
		Input 2nd num: 5
	Output Format:
		Num is equal.

 */
class P31{
	public static void main(String arg[]){
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("enter two numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println((a==b)?"num is equal":"num is not equal");
	}
}