import java.util.Scanner;
//	10. WAP to input 3 digit number and print the reverse of the number.

class P21{
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
		System.out.print("reverse: "+i);
		System.out.print(j);
		System.out.println(k);
	}
}