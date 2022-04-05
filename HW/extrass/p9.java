import java.util.Scanner;
class P9{
	public static void main(String arg[]){
		double a=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		if(s.hasNextDouble()){
			a=s.nextDouble();
			System.out.println("Number: "+a);
		}
		else{
			System.out.println("Invalid number");
		}
		s.close();
	}
}
		