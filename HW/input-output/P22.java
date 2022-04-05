import java.util.Scanner;

//	11. WAP to input 5 digit number and print the reverse of the number.
class P22{
	public static void main(String arg[]){
		int num,i,j,k,l,m;
		Scanner s=new Scanner(System.in);
		System.out.print("enter a five digit number: ");
		num=s.nextInt();
		i=num%10;
		num=num/10;
		j=num%10;
		num=num/10;
		k=num%10;
		num=num/10;
		l=num%10;
		num=num/10;
		m=num%10;
		System.out.print("reverse: "+i);
		System.out.print(j);
		System.out.print(k);
		System.out.print(l);
		System.out.println(m);
		
	}
}