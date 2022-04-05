import java.util.Scanner;
class P8{
	public static void main(String arg[]){
		float a=0F;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		if(s.hasNextFloat()){
			a=s.nextFloat();
			System.out.println("Number: "+a);
		}
		else{
			System.out.println("Invalid number");
		}
		s.close();
	}
}