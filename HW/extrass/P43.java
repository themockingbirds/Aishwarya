import java.util.Scanner;
class P43{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		if(num%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}