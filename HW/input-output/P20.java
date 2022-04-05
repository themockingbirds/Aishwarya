package HW;

import java.util.Scanner;
//	9. WAP to input 3 digit number and print the each number in separate line.
class P20{
	public static void main(String arg[]){
		int num,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a three digit number: ");
		num=s.nextInt();
		i=num%10;
		num=num/10;
		j=num%10;
		num=num/10;
		k=num%10;
		System.out.println(k);
		System.out.println(j);
		System.out.println(i);
	}
}