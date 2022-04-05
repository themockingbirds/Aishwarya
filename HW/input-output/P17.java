package HW;
//Input_output Q6
/**
 * 	6. WAP to read a number from user and print the table for that number in the following ways:
 * 		Input format:
 * 			Input a number: 5
 * 		Output Format:
 * 			5 x 1 = 5
 * 			5 x 2 = 10
 * 			..
 * 			..
 * 			5 x 10 = 50
 */

import java.util.Scanner;
class P17{
	public static void main(String arg[]){
		int table,j;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number to get the table: ");
		j=s.nextInt();
		for(int i=1;i<=10;i++){
			table=j*i;
			System.out.println(j+"*"+i+"="+table);
		}
	}
}
			