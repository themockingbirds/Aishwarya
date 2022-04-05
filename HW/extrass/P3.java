import java.util.Scanner;

class NewClass{
	public static void main(String arg[]){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			