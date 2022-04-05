import java.util.Scanner;
//	29. WAP to that the inputted number check number is positive, negative or zero.
class P39{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		System.out.print(num+": ");
		System.out.println((num>0)?"positive":(num==0)?"zero":"negative");
	}
}