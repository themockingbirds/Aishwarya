import java.util.Scanner;
/*
	18. WAP to input a number and display the number is negative or positive using Conditional Operator.

	Input format:
		Input a num: -34
	Output format:
		-34 is +ive or -ive: -ive

 */
class P28{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.print(num+" is +ve or -ve:");
		System.out.println((num>=0)?"+ve":"-ve");
	}
}