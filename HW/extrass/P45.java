import java.util.Scanner;
class P45{
	public static void main(String arg[]){
		int a,b,c,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter three sides of a triangle: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		sum=a+b+c;
		if(sum==180){
			System.out.println("valid");
		}
		
		else{
			System.out.println("not valid");
		}
	}
}