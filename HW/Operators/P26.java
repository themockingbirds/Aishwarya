import java.util.Scanner;
/*
		16. WAP to input a number and check that if number is less than equal to 100 or greater than equal to 50,display false otherwise true.
	Input format:
		Input a num: 34
	Output format:
	34 is less than equal to 100 and greater than equal to 50: false
 */
class P26{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.println(num+"is less than or equal to 100 and greater than equal to 50: "+(num>=50&&num<=100));
	}
}