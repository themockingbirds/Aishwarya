import java.util.Scanner;
/*
	15. WAP to input a number and check that number is less than 100 and greater than 50, display true otherwise false.

	Input format:
		Input a num: 34
	Output format:
		35 is less than 100 and greater than 50: True

 */
class P25{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.println(num+"is less than 100 and greater than 50: "+(num>50&&num<100));
	}
}