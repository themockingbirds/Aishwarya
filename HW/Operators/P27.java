import java.util.Scanner;
/*
	17. WAP to input a number and display the number is Even or Odd using Conditional Operator.
	Input format:
		Input a num: 34
	Output format:
		34 is even or Odd: Even

 */

class P27{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.print(num+" is even or odd:");
		System.out.println((num%2==0)?"even":"odd");
	}
}