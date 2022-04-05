import java.util.Scanner;
class P13{
	public static void main(String arg[]){
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a boolean value: ");
		flag=s.nextBoolean();
		if(flag){
			System.out.println("Number: "+flag);
		}	
		else{
			System.out.println("Invalid");
		}
		s.close();
	}
}
