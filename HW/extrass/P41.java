import java.util.Scanner;
class P41{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		if(num>=0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	}
}
	