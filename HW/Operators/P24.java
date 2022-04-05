import java.util.Scanner;
/*
	14. WAP to input a number and check that number either equal to 40 or 30 if yes then display true otherwise false relational Operator and Logical Operator.
	Input format:
		Input a num: 34
	Output format:
		34 is either equal to 40 or 30: false

 */
class P24{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.println(num+"is either equal to 40 or 30: "+(num==30||num==40));
	}
}