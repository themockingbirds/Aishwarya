import java.util.Scanner;
class P44{
	public static void main(String arg[]){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter three sides of a triangle: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a==b&&b==c&&c==a){
			System.out.println("equilateral");
		}
		if(a!=b&&b!=c&&c!=a){
			System.out.println("scalene");
		}
		else{
			System.out.println("isosceles");
		}
	}
}