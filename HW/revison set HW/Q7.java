//revision set Q7
/*

Pattern...

    *
   **
  ***
 ****
*****

*/
import java.util.Scanner;
class Q7{	
	public static void main(String arg[]){
		int n; //n stand for number of rows
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the value of n: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j<=i&&j>=1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
			