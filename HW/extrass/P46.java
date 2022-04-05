import java.util.Scanner;
class P46{
	public static void main(String arg[]){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter three sides of a triangle: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a+b>c||b+c>a||a+c>b){
			System.out.println("valid");
		}
		
		else{
			System.out.println("not valid");
		}
	}
}