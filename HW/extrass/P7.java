
import java.util.Scanner;
class P7{
	public static void main(String arg[]){
		int a=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		if(s.hasNextInt()){
			a=s.nextInt();
			System.out.println("Number: "+a);
		}
		else{
			System.out.println("Invalid number");
		}
		s.close();
	}
}
		
		
	