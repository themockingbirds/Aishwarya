import java.util.Scanner;
class P49{
	public static void main(String arg[]){
		int ch;
		double a,b,change;
		Scanner s=new Scanner(System.in);
		System.out.print("enter your choice 1:d to r  2:r to d:  ");
		ch=s.nextInt();
		switch(ch){
			case 1:
			System.out.print("enter the temp in degrees: ");
			a=s.nextDouble();
			change=a*(3.14/180);
			System.out.println(a+" degrees= "+change+"radians");
			break;
			case 2:
			System.out.print("enter the temp in radian: ");
			b=s.nextDouble();
			change=b*(180/3.14);
			System.out.println(b+" radians= "+change+"degrees");
			break;
			default:
			System.out.println("invalid choice");
			break;
		}
	}
}