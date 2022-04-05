import java.util.Scanner;
/*
	13. WAP to input a number and check that number must lies between 30 to 100.
	 if yes then display true otherwise false Using Operator.
	Input format:
		Input a num: 34
	Output format:
		34 lies between 30 to 100: true

 */
class P23{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.println(num+"lies between 30 and 100: "+(num>30&&num<100));
	}
}