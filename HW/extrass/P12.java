import java.util.Scanner;
class P12{
	public static void main(String arg[]){
		long a=0L;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		if(s.hasNextLong()){
			a=s.nextLong();
			System.out.println("Number: "+a);
		}
		else{
			System.out.println("Invalid number");
		}
		s.close();
	}
}