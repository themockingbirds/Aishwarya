import java.util.Scanner;
class Q2{
	public static void main(String arg[]){
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		a=s.nextInt();
		System.out.print(a+" lies between 30 to 100: ");
		System.out.println((a>30&&a<100)?"true":"false");
	}
}



/*WAP to input a Input a number and check that number must lies between 30 to 100.
if yes then display true otherwise false Using Operator. 
Input format:- 
Input a num: 34 
Output format:- 
34 lies between 30 to 100: true */