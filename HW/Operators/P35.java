import java.util.Scanner;
/*
	24. WAP to check whether year is leap year or not using conditional operator.
	Case 1:
	Input format:
		Input year: 2010
	Output Format:
		2010: Leap year

	Case 2:
	Input format:
		Input year: 2010
	Output Format:
		2010: Not a Leap year

 */
class P35{
	public static void main(String arg[]){
		int year;
		Scanner s=new Scanner(System.in);
		System.out.print("enter an year : ");
		year=s.nextInt();
		System.out.print(year+": ");
		System.out.println((year%4==0)?"Leap year":"Not a leap year");
	}
}