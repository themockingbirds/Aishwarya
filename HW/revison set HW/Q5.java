//revision set Q5
/*
	5. WAP to calculate and display the sum of all ODD number from 1 to N, N input by a user.

*/
import java.util.Scanner;
class Q5{
	public static void main(String arg[]){
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the value of n: ");
		n=s.nextInt();
		for(int i=1;i<=n;i+=2){
			sum=sum+i;
		}
		System.out.println("sum: "+sum);
	}
}