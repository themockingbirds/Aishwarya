import java.util.Scanner;
/*
	20. WAP to input two number and display the which number is greatest or smallest number
	Input format:
		Input 1st num: 10
		Input 2nd num: 5
	Output Format:
		5 is smallest.

 */
class P30{
	public static void main(String arg[]){
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("enter two numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println((a>b)?b+" is smallest":a+" is smallest");
	}
}