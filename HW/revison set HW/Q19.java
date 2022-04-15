//revision set Q7 pattern 340
/*
*****
*   *
*   *
*   *
*****
*/
import java.util.Scanner;
class Q19{
	public static void main(String arg[]){
		for(int i=1;i<=5;i++){
				System.out.printf("*");
			}
			System.out.printf("\n");

		for(int i=2;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(j==1||j==5){
					System.out.printf("*");
				}
				else{
					System.out.printf(" ");
				}
			}
				System.out.printf("\n");
		}
		
		for(int i=1;i<=5;i++){
				System.out.printf("*");
		}
		
	}
}