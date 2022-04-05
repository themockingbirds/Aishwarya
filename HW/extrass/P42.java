import java.util.Scanner;
class P42{
	public static void main(String arg[]){
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number: ");
		num=s.nextInt();
		if(num%2==0){
			System.out.println("even");
		}
		if(num%2!=0){
			System.out.println("odd");
		}
	}
}