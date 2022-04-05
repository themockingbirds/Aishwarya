import java.util.Scanner;
/*
	19. WAP to input two number and display the greatest number using conditional Operator.
	Input format:
		Input 1st num: 10
		Input 2nd num: 5
	Output Format:
		10 is greatest.
 */
class P29{
	public static void main(String arg[]){
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("enter two numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println((a>b)?a+" is greatest":b+" is greatest");
	}
}