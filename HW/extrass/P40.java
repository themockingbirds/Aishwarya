import java.util.Scanner;
class P40{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		if(num>=0){
			System.out.println("positive");
		}
		if(num<0){
			System.out.println("negative");
		}
	}
}
	
		